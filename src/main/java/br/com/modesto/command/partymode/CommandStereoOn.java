package br.com.modesto.command.partymode;

import br.com.modesto.command.devices.Stereo;

public class CommandStereoOn implements Command {

	private final Stereo stereo;

	public CommandStereoOn(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
	}

	@Override
	public void undo() {
		stereo.off();
	}
}
