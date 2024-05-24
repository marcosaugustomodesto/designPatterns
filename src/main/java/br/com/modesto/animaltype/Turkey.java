package br.com.modesto.animaltype;

import br.com.modesto.behavior.FlyBehavior;
import br.com.modesto.behavior.GobbleBehavior;

abstract public class Turkey {
    protected FlyBehavior flyBehavior;
    protected GobbleBehavior gobbleBehavior;

    public void performFly(){
        flyBehavior.fly();
    }

    public void performGobble(){
    	gobbleBehavior.gobble();
    }

    public void swim(){
        System.out.println("not swim");
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setGobbleBehavior(GobbleBehavior gobbleBehavior) {
        this.gobbleBehavior = gobbleBehavior;
    }
}
