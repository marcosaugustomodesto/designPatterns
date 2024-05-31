package br.com.modesto.state2.proxy;

import java.rmi.RemoteException;

public class SoldState implements State {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2964143052566868651L;
	transient GumballMachine machineGum;

	public SoldState(GumballMachine machineGum) {
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
		try {
			machineGum.releaseBall();
			if (machineGum.getCount() > 0) {
				machineGum.setState(machineGum.getNoQuarterState());
			} else {
				System.out.println("Ops, out of gumballs ...");
				machineGum.setState(machineGum.getSoldOutState());
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
