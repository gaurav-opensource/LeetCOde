class Solution {
    int[] daysPerMonth = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int daysBetweenDates(String date1, String date2) {
        // Calculate the absolute difference between the two dates
        return Math.abs(daysFrom1971(date1) - daysFrom1971(date2));
    }

    private int daysFrom1971(String date) {
        String[] dateArray = date.split("-");
        int year = Integer.parseInt(dateArray[0]);
        int month = Integer.parseInt(dateArray[1]);
        int day = Integer.parseInt(dateArray[2]);

        int yearsFrom1971 = year - 1971;

        // Check if the current year is a leap year
        boolean isLeap = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

        // If the month is after February in a leap year, add an extra day
        if (month > 2 && isLeap) {
            day++;
        }

        // Add the days from the months of the current year
        for (int m = 1; m < month; m++) {
            day += daysPerMonth[m - 1];
        }

        // Add the days from the years from 1971 to the current year
        return day + yearsFrom1971 * 365 + countLeapYearsSince1971(year);
        
    }

    private int countLeapYearsSince1971(int year) {
        int count = 0;
        for (int y = 1971; y < year; y++) {
            if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)) {
                count++;
            }
        }
        return count;
    }
}
