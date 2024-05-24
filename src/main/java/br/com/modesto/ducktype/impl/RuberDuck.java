package br.com.modesto.ducktype.impl;

import br.com.modesto.animaltype.Duck;
import br.com.modesto.behavior.impl.FlyNoWay;
import br.com.modesto.behavior.impl.QuackSound;

public class RuberDuck extends Duck {
    public RuberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackSound();
    }

    @Override
    public void display() {
        System.out.println("Rubber duck");
    }
}
