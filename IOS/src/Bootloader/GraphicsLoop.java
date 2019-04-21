package Bootloader;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import Font.GetFont;
import Images.Background;
import TimeAndDates.GetDate;
import TimeAndDates.GetTime;

@SuppressWarnings("serial")
public class GraphicsLoop extends JPanel{
	
	Image i;
	ImageObserver io = null;
	
	@Override
	public void paint(Graphics G) {
		//Background
		i = Background.getBackground();
		float percent =(float) (Main.h/i.getHeight(io));
		G.drawImage(i, (int) ((Main.w/2)-(i.getWidth(io)/2 * percent)), 0, (int) (i.getWidth(io)*percent), (int) (i.getHeight(io)*percent), io);
        
        G.setColor(Color.white);
        Font customFont = GetFont.getFont();
        G.setFont(customFont); 
        Graphics2D graphics2D = (Graphics2D) G;
		graphics2D.setRenderingHint( RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP); 
		GetTime.updateTime();
		GetDate.updateDate();
        String time = GetTime.getTime();
        String date = GetDate.getDate();
        G.setFont(customFont.deriveFont(48f));
        G.drawString(date, Main.w/2 - (G.getFontMetrics().stringWidth(date)/2) - 4, 260+G.getFontMetrics().getHeight());	
        G.setFont(customFont.deriveFont(128f)); 
		G.drawString(time, (Main.w/2) - (G.getFontMetrics().stringWidth(time)/2) - 4, 100+G.getFontMetrics().getHeight());
		repaint();
	}
}
