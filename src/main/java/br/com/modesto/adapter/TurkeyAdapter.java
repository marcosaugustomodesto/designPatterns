package br.com.modesto.adapter;

import br.com.modesto.animaltype.Duck;
import br.com.modesto.animaltype.Turkey;
import br.com.modesto.behavior.QuackBehavior;

public class TurkeyAdapter extends Duck {

	private final Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	public void performFly(){
		turkey.performFly();
    }

    public void performQuack(){
        turkey.performGobble();
    }

    public void swim(){
        turkey.swim();
    }
    
    public void setQuackBehavior(QuackBehavior quackBehavior)  {
    	System.out.println("Turkey can't quack");
    }

	@Override
	public void display() {
		turkey.display();
	}

}
