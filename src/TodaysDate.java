package myUtilities;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TodaysDate {
    private String time;
    protected int day;
    int month;
    public int year;

    public TodaysDate() {
        Calendar now = new GregorianCalendar();
        this.year = now.get(Calendar.YEAR);
        this.month = now.get(Calendar.MONTH) + 1;
        this.day = now.get(Calendar.DAY_OF_MONTH);
        this.time = String.format("%02d:%02d:%02d",
                now.get(Calendar.HOUR_OF_DAY),
                now.get(Calendar.MINUTE),
                now.get(Calendar.SECOND));
    }

    public void printDateAndTime() {
        System.out.println("Time: " + time + " Date: " + day + " " + month + " " + year);
    }
}