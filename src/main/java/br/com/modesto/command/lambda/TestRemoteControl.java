package br.com.modesto.command.lambda;

import br.com.modesto.command.devices.Light;

public class TestRemoteControl {

	public static void main(String[] args) {
		Light device = new Light("Room");
		Command lightOn = () -> device.on();
		Command lightOff = () -> device.off();
		RemoteControl rc = new RemoteControl();
		rc.setSlot(0, lightOn, lightOff);
		for(int i = 0; i < 7; i++) {
			rc.buttonOnPressed(i);
			rc.buttonOffPressed(i);	
		}
	}
}
