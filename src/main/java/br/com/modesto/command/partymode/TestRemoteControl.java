package br.com.modesto.command.partymode;

import br.com.modesto.command.devices.Hottube;
import br.com.modesto.command.devices.Light;
import br.com.modesto.command.devices.Stereo;
import br.com.modesto.command.devices.TV;

public class TestRemoteControl {

	public static void main(String[] args) {
		TV tv = new TV("Living Room");
		Light light = new Light("Bedroom");
		Stereo stereo = new Stereo("Living Room");
		Hottube hottube = new Hottube("Bathroom");

		RemoteControl rc = new RemoteControl();

		CommandTVOn tvCommandOn = new CommandTVOn(tv);
		CommandTVOff tvCommandOff = new CommandTVOff(tv);

		CommandRoomLightOn lightCommandOn = new CommandRoomLightOn(light);
		CommandRoomLightOff lightCommandOff = new CommandRoomLightOff(light);

		CommandStereoOn stereoCommandOn = new CommandStereoOn(stereo);
		CommandStereoOff stereoCommandOff = new CommandStereoOff(stereo);

		CommandHottubeOn hottubeCommandOn = new CommandHottubeOn(hottube);
		CommandHottubeOff hottubeCommandOff = new CommandHottubeOff(hottube);

		Command[] on = { tvCommandOn, lightCommandOn, stereoCommandOn, hottubeCommandOn };
		Command[] off = { tvCommandOff, lightCommandOff, stereoCommandOff, hottubeCommandOff };

		MacroCommand partyModeOn = new MacroCommand(on);
		MacroCommand partyModeOff = new MacroCommand(off);

		rc.setSlot(0, partyModeOn, partyModeOff);

		rc.buttonOnPressed(0);
		rc.buttonOffPressed(0);
		rc.buttonUndoPressed();

	}
}
