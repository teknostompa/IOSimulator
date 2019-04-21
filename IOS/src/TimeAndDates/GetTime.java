package TimeAndDates;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetTime {
	static String time;
	static Calendar cal;
	static SimpleDateFormat sdf;
	public static void setupTime(){
        sdf = new SimpleDateFormat("HH:mm");
        cal = Calendar.getInstance();
	}
	
	public static void updateTime() {
		time = (String) sdf.format(cal.getTime());
	}
	
	public static String getTime() {
		return time;
	}
}
