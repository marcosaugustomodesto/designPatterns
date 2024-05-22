package br.com.modesto.command.devices;

public class Hottube {
	
	private final String location;
	
	public Hottube(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println("Turn on the Hottube on the " + location);
	}

	public void off() {
		System.out.println("Turn off the Hottube on the " + location);
	}

}
