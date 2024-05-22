package br.com.modesto.command.undo;

public interface Command {
	public void execute();
	
	public void undo();
}
