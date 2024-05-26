package br.com.modesto.composite;

public abstract class MenuComponent {

	public String getName() {
		throw new UnsupportedOperationException();
	}

	public String getDescription() {
		throw new UnsupportedOperationException();
	}

	public Double getPrice() {
		throw new UnsupportedOperationException();
	}

	public Boolean getVegeterian() {
		throw new UnsupportedOperationException();
	}

	public void print() {
		throw new UnsupportedOperationException();
	}

	public void add(MenuComponent component) {
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent component) {
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int index) {
		throw new UnsupportedOperationException();
	}
}
