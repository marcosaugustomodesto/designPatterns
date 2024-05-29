package br.com.modesto.state2;

import java.util.Random;

public class HasQuarterState implements State {

	private final MachineGum machineGum;
	private Random randowWinner = new Random(System.currentTimeMillis());

	public HasQuarterState(MachineGum machineGum) {
		this.machineGum = machineGum;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter ejected");
		machineGum.setState(machineGum.getHasQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("turning the crank ...");
		int winner = randowWinner.nextInt(10);
		if (winner == 0) {
			machineGum.setState(machineGum.getWinnerState());
		} else {
			machineGum.setState(machineGum.getSoldState());
		}

	}

	@Override
	public void dispense() {
		System.out.println("Eject your quarter ...");
	}

}
