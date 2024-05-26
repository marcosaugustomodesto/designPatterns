package br.com.modesto.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
	String name;
	String description;
	List<MenuComponent> components = new ArrayList<>();

	public Menu(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void print() {
		System.out.println(getName());
		System.out.println(getDescription());
		for (MenuComponent c : components) {
			c.print();
		}
	}

	@Override
	public void add(MenuComponent component) {
		components.add(component);
	}

	@Override
	public void remove(MenuComponent component) {
		components.remove(component);
	}

	@Override
	public MenuComponent getChild(int index) {
		return components.get(index);
	}

}
