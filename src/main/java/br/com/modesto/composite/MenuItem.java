package br.com.modesto.composite;

public class MenuItem extends MenuComponent {
	private String name;
	private String description;
	private Double price;
	private Boolean vegeterian;

	public MenuItem(String name, String description, Double price, Boolean vegeterian) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.vegeterian = vegeterian;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getVegeterian() {
		return vegeterian;
	}

	public void setVegeterian(Boolean vegeterian) {
		this.vegeterian = vegeterian;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println(getName());
		System.out.println(getDescription());
		System.out.println("U$" + getPrice());
		System.out.println("Vegeterian: " + getVegeterian());
	}

}
