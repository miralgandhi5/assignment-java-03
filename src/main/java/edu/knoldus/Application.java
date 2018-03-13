package edu.knoldus;

import edu.knoldus.datetime.Operations;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        System.out.println("days for birthDate- 15-06-1994 " + Operations.getBirthDateDays(LocalDate.of(1994, 6, 15)));
        System.out.println("currentTime according to UTC timeZone " + Operations.getTimeFromTimeZone("UTC"));
        System.out.println("Seconds Mahatma gandhi lived " + Operations.getSecondsLived());
        System.out.println("Leap years from 1990 till now " + Operations.getLeapYears(1900,LocalDate.now().getYear()));
    }
}
