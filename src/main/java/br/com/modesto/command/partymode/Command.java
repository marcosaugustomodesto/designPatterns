package br.com.modesto.command.partymode;

public interface Command {
	public void execute();
	
	public void undo();
}
