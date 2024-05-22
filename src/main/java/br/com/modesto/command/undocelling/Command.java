package br.com.modesto.command.undocelling;

public interface Command {
	public void execute();
	
	public void undo();
}
