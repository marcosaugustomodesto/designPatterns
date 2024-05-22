package br.com.modesto.command.partymode;

import br.com.modesto.command.devices.Hottube;

public class CommandHottubeOn implements Command {

	private final Hottube hottube;

	public CommandHottubeOn(Hottube hottube) {
		this.hottube = hottube;
	}

	@Override
	public void execute() {
		hottube.on();
	}

	@Override
	public void undo() {
		hottube.off();
	}
}
