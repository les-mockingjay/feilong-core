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
package com.feilong.core.date.dateutiltest;

import static java.util.Calendar.FRIDAY;
import static java.util.Calendar.MONDAY;
import static java.util.Calendar.SATURDAY;
import static java.util.Calendar.TUESDAY;
import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import com.feilong.test.AbstractOneParamAndOneResultParameterizedTest;

import static com.feilong.core.bean.ConvertUtil.toList;
import static com.feilong.core.date.DateUtil.getDayOfWeek;
import static com.feilong.core.date.DateUtil.toDate;

import static com.feilong.core.DatePattern.COMMON_DATE;

/**
 * The Class DateUtilGetYearParameterizedTest.
 *
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 */
public class DateUtilGetDayOfWeekParameterizedTest extends AbstractOneParamAndOneResultParameterizedTest<String, Integer>{

    /**
     * Data.
     *
     * @return the iterable
     */
    @Parameters(name = "index:{index}: DateUtil.getDayOfWeek({0})={1}")
    public static Iterable<Object[]> data(){
        Object[][] objects = new Object[][] { //
                                              { "2012-6-29", FRIDAY },
                                              { "2016-08-16", TUESDAY },
                                              { "2016-12-31", SATURDAY },
                                              { "2016-02-01", MONDAY },
                //
        };
        return toList(objects);
    }

    /**
     * Test get day of week.
     */
    @Test
    public void testGetDayOfWeek(){
        Date date = toDate(input1, COMMON_DATE);
        assertEquals(expectedValue, (Integer) getDayOfWeek(date));
    }
}