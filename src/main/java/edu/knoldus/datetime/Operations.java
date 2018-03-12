package edu.knoldus.datetime;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import static java.time.temporal.ChronoUnit.DAYS;

public class Operations {

    /**
     * gets days for given burthdate.
     *
     * @param date birthdate on which days has to be find.
     * @return list of days.
     */

    public static List<String> getBirthDateDays(LocalDate date) {

        List<String> result = new ArrayList<>();
        String day = date.getDayOfWeek().toString();
        result.add(day);
        LocalDate currentDate = date.plusYears(1);
        while (currentDate.getYear() < (LocalDate.now()).getYear()) {
            result.add(currentDate.getDayOfWeek().toString());
            currentDate = currentDate.plusYears(1);
        }

        return result;
    }

    /**
     * get current time according to a time zone.
     *
     * @param timeZone specifies timezone for which current time has to be shown.
     * @return time according to time zone given.
     */
    public static String getTimeFromTimeZone(String timeZone) {

        ZoneId zone = TimeZone.getTimeZone(timeZone).toZoneId();
        return LocalTime.now(zone).toString();

    }

    /**
     * gives seconds mahatma gandhi lived.
     *
     * @return seconds.
     */

    public static Long getSecondsLived() {
        LocalDate birthDate = LocalDate.of(1869, 10, 2);
        LocalDate deathDate = LocalDate.of(1949, 1, 30);
        long days = DAYS.between(birthDate, deathDate);
        return Duration.ofDays(days).getSeconds();
    }

    /**
     * gives list of all leap years starting from 1990 till date.
     *
     * @return list of leap years till date.
     */

    public static List<Integer> getLeapYears() {

        LocalDate currentDate = LocalDate.ofYearDay(1990, 1);
        LocalDate endDate = LocalDate.now();
        List<Integer> leapYearList = new ArrayList<>();

        while (currentDate.getYear() <= endDate.getYear()) {
            if (currentDate.isLeapYear()) {
                leapYearList.add(currentDate.getYear());
            }
            currentDate = currentDate.plusYears(1);
        }
        return leapYearList;

    }


}
