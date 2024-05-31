package br.com.modesto.state2.proxy;

import java.rmi.RemoteException;

public class MachinGumTest {
	public static void main(String[] args) throws RemoteException {
		GumballMachine m = new GumballMachine("127.0.0.1", 5);
		m.inventory();
		m.insertQuarter();
		m.turnCrank();
		m.inventory();
		System.out.println();

		m.insertQuarter();
		m.turnCrank();
		m.inventory();
		System.out.println();

		m.insertQuarter();
		m.turnCrank();
		m.inventory();
		System.out.println();

		m.insertQuarter();
		m.turnCrank();
		m.inventory();
		System.out.println();

		m.insertQuarter();
		m.turnCrank();
		m.inventory();
		System.out.println();

		m.insertQuarter();
		m.turnCrank();
		m.inventory();
		System.out.println();

		m.insertQuarter();
		m.turnCrank();
		m.inventory();
		System.out.println();

		m.ejectQuarter();
		m.inventory();
		System.out.println();

		m.refil(10);
		m.inventory();

		m.insertQuarter();
		m.turnCrank();
		m.inventory();

		m.inventory();
		m.insertQuarter();
		m.turnCrank();
		m.inventory();
		System.out.println();

		m.insertQuarter();
		m.turnCrank();
		m.inventory();
		System.out.println();

		m.insertQuarter();
		m.turnCrank();
		m.inventory();
		System.out.println();

		m.insertQuarter();
		m.turnCrank();
		m.inventory();
		System.out.println();

		m.insertQuarter();
		m.turnCrank();
		m.inventory();
		System.out.println();

		m.insertQuarter();
		m.turnCrank();
		m.inventory();
		System.out.println();

		m.insertQuarter();
		m.turnCrank();
		m.inventory();
		System.out.println();

		m.ejectQuarter();
		m.inventory();
		System.out.println();

		m.refil(10);
		m.inventory();

		m.insertQuarter();
		m.turnCrank();
		m.inventory();

	}
}
