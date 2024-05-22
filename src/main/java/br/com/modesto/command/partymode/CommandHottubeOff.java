package br.com.modesto.command.partymode;

import br.com.modesto.command.devices.Hottube;

public class CommandHottubeOff implements Command {

	private final Hottube hottube;

	public CommandHottubeOff(Hottube hottube) {
		this.hottube = hottube;
	}

	@Override
	public void execute() {
		hottube.off();
	}

	@Override
	public void undo() {
		hottube.on();
	}
}
