public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isValid() {
        // Check if the year is a valid value
        if (year < 1) {
            return false;
        }

        // Check if the month is a valid value
        if (month < 1 || month > 12) {
            return false;
        }

        // Check if the day is a valid value
        int daysInMonth = getDaysInMonth();
        if (day < 1 || day > daysInMonth) {
            return false;
        }

        // The date is valid
        return true;
    }

    public int getDayOfWeek() {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4}; // Array of magic numbers
        int y = year - (month < 3 ? 1 : 0); // Subtract 1 from the year for January or February
        int dow = (y + y/4 - y/100 + y/400 + t[month-1] + day) % 7;
        return dow;
    }

    public boolean isLeapYear() {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public Date getNextDay() {
        int nextDay = day + 1;
        int nextMonth = month;
        int nextYear = year;
        if (nextDay > getDaysInMonth()) {
            nextDay = 1;
            nextMonth++;
            if (nextMonth > 12) {
                nextMonth = 1;
                nextYear++;
            }
        }
        return new Date(nextDay, nextMonth, nextYear);
    }

    public Date getPreviousDay() {
        int previousDay = day - 1;
        int previousMonth = month;
        int previousYear = year;
        if (previousDay < 1) {
            previousMonth--;
            if (previousMonth < 1) {
                previousMonth = 12;
                previousYear--;
            }
            previousDay = getDaysInMonth(previousMonth);
        }
        return new Date(previousDay, previousMonth, previousYear);
    }

    private int getDaysInMonth() {
        return getDaysInMonth(month);
    }

    private int getDaysInMonth(int month) {
        switch (month) {
            case 2:
                return isLeapYear() ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d-%02d-%04d", day, month, year);
    }


public static void main(String[] args) {
    // create a new Date object
    Date date = new Date(31, 12, 2022);
    
    // print out whether the date is valid or not
    System.out.println("Is the date valid? " + date.isValid());
    
    // print out the day of the week for the date
    System.out.println("Day of the week: " + date.getDayOfWeek());
    
    // print out whether the year of the date is a leap year or not
    System.out.println("Is it a leap year? " + date.isLeapYear());
    
    // get the next day and print it out
    Date nextDay = date.getNextDay();
    System.out.println("Next day: " + nextDay);
    
    // get the previous day and print it out
    Date previousDay = date.getPreviousDay();
    System.out.println("Previous day: " + previousDay);
}
}
