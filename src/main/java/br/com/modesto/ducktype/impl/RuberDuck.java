package br.com.modesto.ducktype.impl;

import br.com.modesto.behavior.impl.FlyNoWay;
import br.com.modesto.behavior.impl.QuackSound;
import br.com.modesto.ducktype.Duck;

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
