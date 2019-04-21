package Bootloader;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;

import TimeAndDates.GetDate;
import TimeAndDates.GetTime;

public class Main {
	
	static int w = 525;
	static int h = 934;
	static String Title = "IPhone 7";
	
	public static void main(String[] args) {
		GetTime.setupTime();
		GetDate.setupDate();
		GraphicsLoop Graphics = new GraphicsLoop();
		JFrame Phone = MakeWindow.J(w, h, Title);
		Phone.add(Graphics);
	}
}
