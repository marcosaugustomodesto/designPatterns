package br.com.modesto.command.undocelling;

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
