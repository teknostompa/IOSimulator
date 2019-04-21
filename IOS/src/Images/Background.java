package Images;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Background {
	public static Image getBackground() {
		Image i = null;
		try {
			i = ImageIO.read(new File("C:\\Users\\Tom\\eclipse-workspace\\IOS\\Background.jpg"));
		} catch (IOException e) {
			i = getBackground();
		} 
		return i;
	}
}
