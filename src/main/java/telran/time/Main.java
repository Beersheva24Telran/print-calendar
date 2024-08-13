package telran.time;

import java.time.DayOfWeek;
record MonthYear(int month, int year) {}
public class Main {
    public static void main(String[] args) {
        try {
            MonthYear monthYear = getMonthYear(args); //if no arguments current year and month should be applied
            printCalendar(monthYear);
        } catch (RuntimeException e) {
                e.printStackTrace();
        }
        catch (Exception e) {
           System.out.println(e.getMessage());
        }
       
    }

    private static void printCalendar(MonthYear monthYear) {
        printTitle(monthYear);
        printWeekDays();
        printDates(monthYear);
    }

    private static void printDates(MonthYear monthYear) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printDates'");
    }

    private static void printWeekDays() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printWeekDays'");
    }

    private static void printTitle(MonthYear monthYear) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printTitle'");
    }

    private static MonthYear getMonthYear (String[] args) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMonthYear'");
    }
    private int getFirstDayofWeek(MonthYear monthYear) {
        //TODO
        return -1;
    }
    private int getOffset(int firstWeekDay) {
        //TODO
        //shift on this offset for starting printin
        return -1;
    }
    private int getLastDayOfMonth(MonthYear monthYear) {
        //TODO
        return -1;
    }
}