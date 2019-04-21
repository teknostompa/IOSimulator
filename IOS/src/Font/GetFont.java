package Font;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class GetFont {
	public static Font getFont() {
		Font customFont = null;
        try {
			customFont = Font.createFont(Font.TRUETYPE_FONT, new File("SFProText-Light.ttf")).deriveFont(48f);
		} catch (FontFormatException | IOException e1) {
			e1.printStackTrace();
		}
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(customFont);
        return customFont;
	}
}
