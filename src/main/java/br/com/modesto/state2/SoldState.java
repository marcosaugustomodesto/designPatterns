package br.com.modesto.state2;

public class SoldState implements State {

	private final MachineGum machineGum;

	public SoldState(MachineGum machineGum) {
		this.machineGum = machineGum;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You already bought a gum");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("You already bought a gum, can't eject now");
	}

	@Override
	public void turnCrank() {
		System.out.println("You already bought a gum");
	}

	@Override
	public void dispense() {
		machineGum.releaseBall();
		if (machineGum.getCount() > 0) {
			machineGum.setState(machineGum.getNoQuarterState());
		} else {
			System.out.println("Ops, out of gumballs ...");
			machineGum.setState(machineGum.getSoldOutState());
		}

	}

}
