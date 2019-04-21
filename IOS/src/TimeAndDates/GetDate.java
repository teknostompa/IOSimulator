package TimeAndDates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDate {
	static String date;
	static Date now;
	static SimpleDateFormat sdf;
	public static void setupDate(){
        sdf = new SimpleDateFormat("EEEE dd MMMM");
        now = new Date();
	}
	
	public static void updateDate() {
		date = sdf.format(now);
	}
	
	public static String getDate() {
		return date;
	}
}
