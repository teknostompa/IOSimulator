package Bootloader;

import javax.swing.JFrame;

public class MakeWindow {
	public static JFrame J(int w, int h, String Title){
		JFrame J = new JFrame(Title);
		J.setSize(w, h);
		J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		J.setResizable(true);
		J.setVisible(true);
		return J;
	}
}
