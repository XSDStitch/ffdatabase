package XSDStitch.FanfictionDatabase;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class TestPics {

	public static ImageIcon getPic() {
		Image image = null;
		try {
			image = ImageIO.read(new File("test2.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		ImageIcon icon = new ImageIcon(image);
		return icon;
	}
}
