package java_basic_study;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Time {

	public static void main(String[] args) {
		Date date = new Date();
		Calendar cal = new GregorianCalendar();
		System.out.println(date);
		System.out.println(cal.get(Calendar.YEAR) + "year"
				+ (cal.get(Calendar.MONTH) + 1) + "month"
				+ (cal.get(Calendar.HOUR_OF_DAY) + ":")
				+ (cal.get(Calendar.MINUTE) + ":")
				+ (cal.get(Calendar.SECOND)));
	}
}
