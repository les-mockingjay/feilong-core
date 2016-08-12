/*
 * Copyright (C) 2008 feilong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.core.date;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import com.feilong.test.AbstractBooleanParameterizedTest;

/**
 * The Class DateUtilIsLeapYearTest.
 */
public class DateUtilIsLeapYearParameterizedTest extends AbstractBooleanParameterizedTest<Integer, Boolean>{

    /**
     * Data.
     *
     * @return the collection
     */
    @Parameters(name = "index:{index}: DateUtil.isLeapYear({0})={1}")
    public static Iterable<Object[]> data(){
        Object[][] objects = new Object[][] { { 2014, false }, { 2000, true }, { 1900, false } };
        return Arrays.asList(objects);
    }

    /**
     * Checks if is leap year.
     */
    @Test
    public void isLeapYear(){
        assertEquals(expectedValue, DateUtil.isLeapYear(input));
    }
}