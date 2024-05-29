package br.com.modesto.state2;

public class MachineGum {
   
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State soldOutState;
	private State winnerState;

	private int count = 0;

	private State state = soldOutState;

	public MachineGum(int count) {
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		soldOutState = new SoldOutState(this);
		winnerState = new WinnerState(this);
		if (count > 0) {
			this.count = count;
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void releaseBall() {
		System.out.println("Gum rolling out of the slot ..");
		if (count > 0) {
			count = count - 1;
		}
	}

	public void refil(int count) {
		state = getNoQuarterState();
		this.count = this.count + count;
	}

	public void inventory() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "MachineGum [Gums=" + count + ", State=" + state.getClass().getName() + "]";
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	
	public State getWinnerState() {
		return winnerState;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getCount() {
		return count;
	}

}
