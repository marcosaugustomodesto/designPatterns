package br.com.modesto.proxy.virtual;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {

	volatile ImageIcon imageIcon;
	final URL imageURL;
	Thread retriveThread;
	boolean retrieving = false;

	public ImageProxy(URL imageURL) {
		this.imageURL = imageURL;
	}

	@Override
	public int getIconWidth() {
		if (imageIcon != null) {
			return imageIcon.getIconWidth();
		} else {
			return 800;
		}
	}

	public synchronized void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}

	@Override
	public int getIconHeight() {
		if (imageIcon != null) {
			return imageIcon.getIconHeight();
		} else {
			return 600;
		}
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		if (imageIcon != null) {
			imageIcon.paintIcon(c, g, x, y);
		} else {
			g.drawString("Loading album cover, please wait ...", x + 300, y + 190);
			if (!retrieving) {
				retrieving = true;
				retriveThread = new Thread(new Runnable() {

					@Override
					public void run() {
						try {
							System.out.println("initial thread");
							setImageIcon(new ImageIcon(imageURL, "Album Cover"));
							System.out.println(imageURL.getPath());
							c.repaint();
							System.out.println("final thread thread");
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				retriveThread.start();
			}
		}

	}

}
