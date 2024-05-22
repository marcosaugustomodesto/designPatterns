package br.com.modesto.command.lambda;

public class RemoteControl {
	public Command[] slotsOn = new Command[7];
	public Command[] slotsOff = new Command[7];

	public RemoteControl() {
		for (int i = 0; i < 7; i++) {
			this.slotsOn[i] = new NoCommand();
			this.slotsOff[i] = new NoCommand();
		}
	}

	public void setSlot(int slot, Command on, Command off) {
		this.slotsOn[slot] = on;
		this.slotsOff[slot] = off;
	}
	
	public void buttonOnPressed(int slot) {
		this.slotsOn[slot].execute();
	}
	
	public void buttonOffPressed(int slot) {
		this.slotsOff[slot].execute();
	}
}
