package br.com.modesto;

import br.com.modesto.behavior.impl.FlyWithRockets;
import br.com.modesto.ducktype.Duck;
import br.com.modesto.ducktype.impl.MallardDuck;

public class SimUDuck {

    public static void main(String[] args) {
        Duck d = new MallardDuck();
        d.display();
        d.performFly();
        d.performQuack();
        d.swim();
        
        d.setFlyBehavior(new FlyWithRockets());
        d.display();
        d.performFly();
        d.performQuack();
        d.swim();
    }
}
