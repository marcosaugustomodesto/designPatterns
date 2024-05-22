package br.com.modesto.behavior.impl;

import br.com.modesto.behavior.QuackBehavior;

public class QuackNoWay implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("No quack");
    }
}
