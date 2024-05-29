package br.com.modesto.state2;

public interface State {
	public void insertQuarter();

	public void ejectQuarter();

	public void turnCrank();

	public void dispense();
}
