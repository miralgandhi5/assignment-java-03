package edu.knoldus.datetime;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;


public class TestOperations {

    @Test
    public void testGetBirthDateDays() {
        List<String> actualResult = Operations.getBirthDateDays(LocalDate.of(2017,3,12));
        List<String> expectedResult = Arrays.asList("SUNDAY","MONDAY");
        assertEquals("getBirthDateDays method failed",expectedResult,actualResult);
    }

    @Test
    public void testGetSecondsLived() {
        Long actualResult = Operations.getSecondsLived();
        Long expectedResult = 2471731200L;
        assertEquals("getSecondsLived method failed",expectedResult,actualResult);
    }

    @Test
    public void testGetTimeFromTimeZone() {
        String actualResult = Operations.getTimeFromTimeZone("UTC");
        String expectedResult = LocalTime.now(TimeZone.getTimeZone("UTC").toZoneId()).toString();
        assertEquals("getTimeForTimeZone method fails",expectedResult.substring(0,5),actualResult.substring(0,5));
    }

    @Test
    public void testGetLeapYears() {
        List<Integer> actualResult = Operations.getLeapYears(1990,2018);
        List<Integer> expectedResult = Arrays.asList(1992,1996,2000,2004,2008,2012,2016);
        assertEquals("getLeapYears method failed",expectedResult,actualResult);
    }

}
