package br.com.modesto.iterator3;

public class MenuItem {
	private String description;
	private Double price;
	private Boolean vegeterian;

	public MenuItem(String description, Double price, Boolean vegeterian) {
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

}
