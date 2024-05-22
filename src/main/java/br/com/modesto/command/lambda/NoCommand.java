package br.com.modesto.command.lambda;

public class NoCommand implements Command {

	public NoCommand() {
	}

	@Override
	public void execute() {
		System.out.println("Do nothing");
	}
}
