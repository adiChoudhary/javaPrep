package Day2.HackerRankProblems;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class CalendarProblem {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, day, month);
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTime().getDay());
        switch(calendar.getTime().getDay()){
            case 1:
                return "MONDAY";
            case 2:
                return "TUESDAY";
            case 3:
                return "WEDNESDAY";
            case 4:
                return "THURSDAY";
            case 5:
                return "FRIDAY";
            case 6:
                return "SATURDAY";
            case 0:
                return "SUNDAY";

        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(findDay(8,5,2015));
        double payment = 12324.134;

        // Write your code here.

        System.out.println("US: " + NumberFormat.getInstance(Locale.US).format(payment));
        Locale india = new Locale("en", "INDIA");
        System.out.println("India: " + "Rs."+NumberFormat.getInstance(india).format(payment));
        System.out.println("China: " + NumberFormat.getInstance(Locale.CHINA).format(payment));
        System.out.println("France: " + NumberFormat.getInstance(Locale.FRANCE).format(payment));
    }
}
