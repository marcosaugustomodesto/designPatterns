package br.com.modesto.state2;

public class NoQuarterState implements State {

	private final MachineGum machineGum;

	public NoQuarterState(MachineGum machineGum) {
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
