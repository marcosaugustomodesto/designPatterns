package br.com.modesto;

import br.com.modesto.adapter.TurkeyAdapter;
import br.com.modesto.animaltype.Duck;
import br.com.modesto.animaltype.Turkey;
import br.com.modesto.behavior.impl.FlyWithRockets;
import br.com.modesto.ducktype.impl.BigTurkey;
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
        
        Turkey t = new BigTurkey();
        Duck d1 = new TurkeyAdapter(t);
        d1.display();
        d1.performFly();
        d1.performQuack();
        d1.swim();
    }
}
