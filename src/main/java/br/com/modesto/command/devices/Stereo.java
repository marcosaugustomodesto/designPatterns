package br.com.modesto.command.devices;

public class Stereo {
	
	private final String location;
	
	public Stereo(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println("Turn on the Stereo on the " + location);
	}

	public void off() {
		System.out.println("Turn off the Stereo on the " + location);
	}

}
