package br.com.modesto.command.partymode;

import br.com.modesto.command.devices.Stereo;

public class CommandStereoOff implements Command {

	private final Stereo stereo;

	public CommandStereoOff(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();
	}
}
