package br.com.modesto.command.devices;

public class CellingFan {

	public static int OFF = 0;
	public static int NORMAL = 1;
	public static int MEDIUM = 2;
	public static int HIGH = 3;

	public int speed;
	public String location;
	
	public CellingFan(String location) {
		this.speed = OFF;
		this.location = location;
	}

	public void OFF() {
		speed = OFF;
		System.out.println("Turn celling off");
	}

	public void NORMAL() {
		speed = NORMAL;
		System.out.println("Turn celling normal");
	}

	public void MEDIUM() {
		speed = MEDIUM;
		System.out.println("Turn celling medium");
	}

	public void HIGH() {
		speed = HIGH;
		System.out.println("Turn celling high");
	}

	public int getSpeed() {
		return speed;
	}

}
