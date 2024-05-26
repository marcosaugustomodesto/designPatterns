package br.com.modesto.iterator;

public class DinerMenu {

	private MenuItem[] menu;

	public DinerMenu() {
		this.menu = new MenuItem[6];
		menu[0] = new MenuItem("Meat with rice", 22.34, false);
		menu[1] = new MenuItem("Strogronof", 32.23, false);
		menu[2] = new MenuItem("Salad", 18.62, true);

	}

	public MenuItem[] getMenu() {
		return menu;
	}

	public void addItemMenu(MenuItem item, int index) throws Exception {
		if (index < 6 && menu[index] == null) {
			menu[index] = item;
		} else {
			throw new Exception("insertion invalid");
		}
	}
}
