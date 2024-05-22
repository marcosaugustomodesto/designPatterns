package br.com.modesto.command.undocelling;

import br.com.modesto.command.devices.CellingFan;

public class CommandCellingMedium implements Command {

	private final CellingFan cellingFan;
	private int previusSpeed;

	public CommandCellingMedium(CellingFan cellingFan) {
		this.cellingFan = cellingFan;
	}

	@Override
	public void execute() {
		previusSpeed = cellingFan.getSpeed();
		cellingFan.MEDIUM();
	}

	@Override
	public void undo() {
		if (CellingFan.OFF == previusSpeed) {
			cellingFan.OFF();
		}
		if (CellingFan.NORMAL == previusSpeed) {
			cellingFan.NORMAL();
		}
		if (CellingFan.MEDIUM == previusSpeed) {
			cellingFan.MEDIUM();
		}
		if (CellingFan.HIGH == previusSpeed) {
			cellingFan.HIGH();
		}
	}
}
