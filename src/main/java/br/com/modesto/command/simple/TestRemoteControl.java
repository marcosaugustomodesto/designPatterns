package br.com.modesto.command.simple;

import br.com.modesto.command.devices.Light;

public class TestRemoteControl {

	public static void main(String[] args) {
		Light device = new Light("Room");
		Command lightOn = new CommandRoomLightOn(device);
		Command lightOff = new CommandRoomLightOff(device);
		RemoteControl rc = new RemoteControl(lightOn);
		rc.setSlot(lightOn);
		rc.buttonPressed();
		rc.setSlot(lightOff);
		rc.buttonPressed();
	}
}
