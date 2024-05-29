package br.com.modesto.state;

public class MachinGumTest {
	public static void main(String[] args) {
		MachineGum m = new MachineGum(5);
		m.inventory();
		m.insertQuarter();
		m.turnCrank();
		m.dispense();
		m.inventory();
		System.out.println();

		m.insertQuarter();
		m.turnCrank();
		m.dispense();
		m.inventory();
		System.out.println();
		
		m.insertQuarter();
		m.turnCrank();
		m.dispense();
		m.inventory();
		System.out.println();
		
		m.insertQuarter();
		m.turnCrank();
		m.dispense();
		m.inventory();
		System.out.println();
		
		m.insertQuarter();
		m.turnCrank();
		m.dispense();
		m.inventory();
		System.out.println();
		
		m.insertQuarter();
		m.turnCrank();
		m.dispense();
		m.inventory();
		System.out.println();
		
		m.insertQuarter();
		m.turnCrank();
		m.dispense();
		m.inventory();
		System.out.println();
		
		m.ejectQuarter();
		m.inventory();
		System.out.println();
		
		m.refil(10);
		m.inventory();
		
		m.insertQuarter();
		m.turnCrank();
		m.dispense();
		m.inventory();

		
	}
}
