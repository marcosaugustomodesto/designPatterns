package br.com.modesto.command.partymode;

public class NoCommand implements Command {

	public NoCommand() {
	}

	@Override
	public void execute() {
		System.out.println("Do nothing");
	}

	@Override
	public void undo() {
		System.out.println("Undo nothing");
	}
}
