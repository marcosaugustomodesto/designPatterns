package br.com.modesto.command.devices;

public class Light {
	
	private final String location;
	
	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println("Turn on the light on the " + location);
	}

	public void off() {
		System.out.println("Turn off the light on the " + location);
	}

}
