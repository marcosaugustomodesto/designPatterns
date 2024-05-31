package br.com.modesto.state2.proxy;

import java.util.Random;

public class HasQuarterState implements State {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7615689275716558003L;
	transient GumballMachine machineGum;
	private Random randowWinner = new Random(System.currentTimeMillis());

	public HasQuarterState(GumballMachine machineGum) {
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
