package com.interview;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateExampleTest {

	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("MMddHH");
	    Date date = new Date();
	    TimeZone tzInTW = TimeZone.getTimeZone("Asia/Taipei");
	    df.setTimeZone(tzInTW);
	    String fileYear = df.format(date);
	    System.out.println(fileYear);
	}
}
