package br.com.modesto.command.simple;

public class RemoteControl {
	public Command slot;
	
	public RemoteControl(Command slot) {
		this.slot = slot;
	}

	public void setSlot(Command slot) {
		this.slot = slot;
	}

	public void buttonPressed() {
		slot.execute();
	}
}
