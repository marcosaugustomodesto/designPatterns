package br.com.modesto.iterator2;

public class Waitress implements printMenu {
	public static void main(String[] args) {

		DinerMenu dinerMenu = new DinerMenu();
		PancakeMenu pancakeMenu = new PancakeMenu();

		printMenu(dinerMenu, pancakeMenu);
	}

	private static void printMenu(DinerMenu dinerMenu, PancakeMenu pancakeMenu) {
		System.out.println("----------------");
		System.out.println("LUNCH MENU");
		System.out.println("----------------");

		Iterator<MenuItem> menu1 = dinerMenu.getMenu();
		PrintInternal(menu1);

		System.out.println("----------------");
		System.out.println("BREAKFAST MENU");
		System.out.println("----------------");
		Iterator<MenuItem> menu2 = pancakeMenu.getMenu();
		PrintInternal(menu2);
	}

	private static void PrintInternal(Iterator<MenuItem> menu1) {
		while (menu1.hasNext()) {
			print(menu1.next());
		}
	}

	private static void print(MenuItem menuItem) {
		System.out.println(menuItem.getDescription());
		System.out.println("U$" + menuItem.getPrice());
		System.out.println("Vegeterian: " + menuItem.getVegeterian());

	}
}
