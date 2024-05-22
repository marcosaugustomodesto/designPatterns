package br.com.modesto.command.partymode;

import br.com.modesto.command.devices.TV;

public class CommandTVOff implements Command {

	private final TV tv;

	public CommandTVOff(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();
	}

	@Override
	public void undo() {
		tv.on();
	}
}
