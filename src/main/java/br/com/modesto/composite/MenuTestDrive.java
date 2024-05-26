package br.com.modesto.composite;

public class MenuTestDrive {
	public static void main(String[] args) {
		MenuComponent pancakeMenu = new Menu("PANCAKE MENU", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Desssert of course!");

		MenuComponent allMenu = new Menu("ALL MENU", "All Menus Combined");
		allMenu.add(pancakeMenu);
		allMenu.add(dessertMenu);
		allMenu.add(cafeMenu);

		dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce", 3.67, true));
		dinerMenu.add(dessertMenu);
		dessertMenu.add(new MenuItem("Apple Pie", "Apple Pie with a flakey crust", 1.53, true));

		Waitress w = new Waitress(allMenu);
		w.print();
	}
}
