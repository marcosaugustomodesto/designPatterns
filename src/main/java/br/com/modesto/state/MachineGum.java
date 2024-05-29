package br.com.modesto.state;

public class MachineGum {

	private final int SOLD_OUT = 0;
	private final int NO_QUARTER = 1;
	private final int HAS_QUARTER = 2;
	private final int SOLD = 3;

	private int count = 0;

	private int state = SOLD_OUT;

	public MachineGum(int count) {
		if (count > 0) {
			this.count = count;
			state = NO_QUARTER;
		}
	}

	public void insertQuarter() {
		if (state == NO_QUARTER) {
			System.out.println("you inserted a quarter");
			state = HAS_QUARTER;
		} else if (state == HAS_QUARTER) {
			System.out.println("Can't insert another quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("There's not gum in the machine");
		} else if (state == SOLD) {
			System.out.println("You already bought a gum");
		}
	}

	public void ejectQuarter() {
		if (state == NO_QUARTER) {
			System.out.println("There's not a quarter to eject");
		} else if (state == HAS_QUARTER) {
			System.out.println("Quarter ejected");
			state = NO_QUARTER;
		} else if (state == SOLD_OUT) {
			System.out.println("There's not a quarter to eject");
		} else if (state == SOLD) {
			System.out.println("You already bought a gum, can't eject now");
		}
	}

	public void turnCrank() {
		if (state == NO_QUARTER) {
			System.out.println("You need to insert a quarter");
		} else if (state == HAS_QUARTER) {
			System.out.println("turning the crank ...");
			if (count > 0) {
				state = SOLD;
				count = count - 1;
			} else {
				System.out.println("There's no gum in the machine, eject your quarter");
			}
		} else if (state == SOLD_OUT) {
			System.out.println("operation not allowed");
		} else if (state == SOLD) {
			System.out.println("You already bought a gum");
		}
	}

	public void dispense() {
		if (state == NO_QUARTER) {
			System.out.println("You need to insert a quarter");
		} else if (state == HAS_QUARTER) {
			System.out.println("Eject your quarter ...");
		} else if (state == SOLD_OUT) {
			System.out.println("Operation not allowed");
		} else if (state == SOLD) {
			System.out.println("Rolling the gum ...");
			state = NO_QUARTER;
		}
	}

	public void refil(int count) {
		this.count = this.count + count;
	}

	public void inventory() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "MachineGum [Gums=" + count + ", State=" + state + "]";
	}

}
