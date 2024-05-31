package br.com.modesto.state2.proxy;

public class NoQuarterState implements State {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5108587778244648079L;
	transient GumballMachine machineGum;

	public NoQuarterState(GumballMachine machineGum) {
		this.machineGum = machineGum;
	}

	@Override
	public void insertQuarter() {
		System.out.println("you inserted a quarter");
		machineGum.setState(machineGum.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("There's not a quarter to eject");

	}

	@Override
	public void turnCrank() {
		System.out.println("You need to insert a quarter");

	}

	@Override
	public void dispense() {
		System.out.println("You need to insert a quarter");

	}

}
