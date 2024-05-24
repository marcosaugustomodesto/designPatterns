package br.com.modesto.ducktype.impl;

import br.com.modesto.animaltype.Duck;
import br.com.modesto.behavior.impl.FlyWithWings;
import br.com.modesto.behavior.impl.QuackSound;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackSound();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck duck");
    }
}
