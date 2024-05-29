package br.com.modesto.state2;

public class SoldOutState implements State {

	private final MachineGum machineGum;

	public SoldOutState(MachineGum machineGum) {
		this.machineGum = machineGum;
	}

	@Override
	public void insertQuarter() {
		System.out.println("There's not gum in the machine");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("There's not a quarter to eject");

	}

	@Override
	public void turnCrank() {
		System.out.println("operation not allowed");

	}

	@Override
	public void dispense() {
		System.out.println("Operation not allowed");

	}

}
