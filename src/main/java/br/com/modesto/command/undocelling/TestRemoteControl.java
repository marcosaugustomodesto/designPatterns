package br.com.modesto.command.undocelling;

import br.com.modesto.command.devices.CellingFan;

public class TestRemoteControl {

	public static void main(String[] args) {
		CellingFan device = new CellingFan("Living room");
		Command cellingOff = new CommandCellingOff(device);
		Command cellingNormal = new CommandCellingNormal(device);
		Command cellingMedium = new CommandCellingMedium(device);
		Command cellingHigh = new CommandCellingHigh(device);
		RemoteControl rc = new RemoteControl();
		rc.setSlot(0, cellingNormal, cellingOff);
		rc.setSlot(1, cellingMedium, cellingOff);
		rc.setSlot(2, cellingHigh, cellingOff);
		
		rc.buttonOnPressed(0);
		rc.buttonOnPressed(1);
		rc.buttonOnPressed(2);
		rc.buttonOffPressed(2);
		
		rc.buttonUndoPressed();
		
		rc.buttonOnPressed(1);
		rc.buttonOnPressed(0);
		
		rc.buttonUndoPressed();
				
	}
}
