package br.com.modesto.iterator3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeMenu {

	private List<MenuItem> menu;

	public PancakeMenu() {
		this.menu = new ArrayList<>();
		menu.add(new MenuItem("Panckake of lean meat", 42.12, false));
		menu.add(new MenuItem("Panckake of ckicken", 32.32, false));
		menu.add(new MenuItem("Panckeke of lettuce", 18.62, true));

	}

	public Iterator getMenu() {
		return menu.iterator();
	}

	public void addItemMenu(MenuItem item) throws Exception {
		menu.add(item);
	}
}
