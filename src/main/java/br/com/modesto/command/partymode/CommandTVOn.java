package br.com.modesto.command.partymode;

import br.com.modesto.command.devices.TV;

public class CommandTVOn implements Command {

	private final TV tv;

	public CommandTVOn(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
	}

	@Override
	public void undo() {
		tv.off();
	}
}
