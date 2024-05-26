package br.com.modesto.iterator;

import java.util.List;

public class Waitress {
	public static void main(String[] args) {

		DinerMenu dinerMenu = new DinerMenu();
		PancakeMenu pancakeMenu = new PancakeMenu();

		printMenu(dinerMenu, pancakeMenu);
	}

	private static void printMenu(DinerMenu dinerMenu, PancakeMenu pancakeMenu) {
		System.out.println("----------------");
		System.out.println("LUNCH MENU");
		System.out.println("----------------");
		MenuItem[] menu1 = dinerMenu.getMenu();
		for (int i = 0; i < menu1.length; i++) {
			if(menu1[i] != null)
				print(menu1[i]);
		}
		System.out.println("----------------");
		System.out.println("BREAKFAST MENU");
		System.out.println("----------------");
		List<MenuItem> menu2 = pancakeMenu.getMenu();
		for (int i = 0; i < menu2.size(); i++) {
				print(menu2.get(i));
		}
	}

	private static void print(MenuItem menuItem) {
		System.out.println(menuItem.getDescription());
		System.out.println("U$" + menuItem.getPrice());
		System.out.println("Vegeterian: " + menuItem.getVegeterian());

	}
}
