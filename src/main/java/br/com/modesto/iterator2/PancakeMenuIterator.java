package br.com.modesto.iterator2;

import java.util.List;

public class PancakeMenuIterator implements Iterator<MenuItem> {

	private List<MenuItem> menu;
	private int position = 0;

	public PancakeMenuIterator(List<MenuItem> menu) {
		this.menu = menu;
	}

	@Override
	public Boolean hasNext() {
		if (position >= menu.size() || menu.get(position) == null) {
			return false;
		}
		return true;
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = menu.get(position);
		position = position + 1;
		return menuItem;
	}

}
