package br.com.modesto.ducktype.impl;

import br.com.modesto.animaltype.Duck;
import br.com.modesto.behavior.impl.FlyNoWay;
import br.com.modesto.behavior.impl.QuackNoWay;
import br.com.modesto.behavior.impl.QuackSound;

public class DecoyDuck  extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackNoWay();
    }

    @Override
    public void display() {
        System.out.println("DecoyDuck duck");
    }
}
