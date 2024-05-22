package br.com.modesto.command.devices;

public class TV {
	
	private final String location;
	
	public TV(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println("Turn on the TV on the " + location);
	}

	public void off() {
		System.out.println("Turn off the TV on the " + location);
	}

}
