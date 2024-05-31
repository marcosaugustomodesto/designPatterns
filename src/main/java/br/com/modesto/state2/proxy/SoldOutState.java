package br.com.modesto.state2.proxy;

public class SoldOutState implements State {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8854126996055165229L;
	transient GumballMachine machineGum;

	public SoldOutState(GumballMachine machineGum) {
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
