package br.com.modesto.proxy.virtual;

import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JComponent;

public class ImageComponent extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6282248655085725742L;
	private Icon icon;

	public ImageComponent(Icon icon) {
		this.icon = icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int w = icon.getIconHeight();
		int h = icon.getIconHeight();
		int x = (800 - w) / 2;
		int y = (600 - h) / 2;
		icon.paintIcon(this, g, x, y);
	}
}
