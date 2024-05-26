package br.com.modesto.iterator3;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

	private MenuItem[] menu;
	private int position = 0;

	public DinerMenuIterator(MenuItem[] menu) {
		this.menu = menu;
	}

	@Override
	public boolean hasNext() {
		if (position >= menu.length || menu[position] == null) {
			return false;
		}
		return true;
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = menu[position];
		position = position + 1;
		return menuItem;
	}

}
