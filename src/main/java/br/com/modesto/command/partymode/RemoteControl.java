package br.com.modesto.command.partymode;

public class RemoteControl {
	public Command[] slotsOn = new Command[7];
	public Command[] slotsOff = new Command[7];
	public Command undo;

	public RemoteControl() {
		for (int i = 0; i < 7; i++) {
			this.slotsOn[i] = new NoCommand();
			this.slotsOff[i] = new NoCommand();
		}
		undo = new NoCommand();
	}

	public void setSlot(int slot, Command on, Command off) {
		this.slotsOn[slot] = on;
		this.slotsOff[slot] = off;
	}

	public void buttonOnPressed(int slot) {
		this.slotsOn[slot].execute();
		undo = this.slotsOn[slot];
	}

	public void buttonOffPressed(int slot) {
		this.slotsOff[slot].execute();
		undo = this.slotsOff[slot];
	}

	public void buttonUndoPressed() {
		this.undo.undo();
	}

}
