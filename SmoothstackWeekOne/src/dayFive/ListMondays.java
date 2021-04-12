package dayFive;

/**
 * Display all of the Mondays in the current year and the specified month.
 */
import java.time.Month;
import java.time.Year;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.DateTimeException;

import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import java.io.PrintStream;
import java.lang.NumberFormatException;

public class ListMondays {
    public static void main(String[] args) {
        Month month = null;

        if (args.length < 1) {
            System.out.printf("Usage: ListMondays <month>%n");
            throw new IllegalArgumentException();
        }

        try {
            month = Month.valueOf(args[0].toUpperCase());
        } catch (IllegalArgumentException exc) {
            System.out.printf("%s is not a valid month.%n", args[0]);
            throw exc;      // Rethrow the exception.
        }

        System.out.printf("For the month of %s:%n", month);
        LocalDate date = Year.now().atMonth(month).atDay(1).
              with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        Month mi = date.getMonth();
        while (mi == month) {
            System.out.printf("%s%n", date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            mi = date.getMonth();
        }
    }
}
