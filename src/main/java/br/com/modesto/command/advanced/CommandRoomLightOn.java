package br.com.modesto.command.advanced;

import br.com.modesto.command.devices.Light;

public class CommandRoomLightOn implements Command {

	private final Light roomLight;

	public CommandRoomLightOn(Light roomLight) {
		this.roomLight = roomLight;
	}

	@Override
	public void execute() {
		roomLight.on();
	}
}
