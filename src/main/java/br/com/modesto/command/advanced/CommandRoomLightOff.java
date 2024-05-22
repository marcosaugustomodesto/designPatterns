package br.com.modesto.command.advanced;

import br.com.modesto.command.devices.Light;

public class CommandRoomLightOff implements Command {

	private final Light roomLight;

	public CommandRoomLightOff(Light roomLight) {
		this.roomLight = roomLight;
	}

	@Override
	public void execute() {
		roomLight.off();
	}
}
