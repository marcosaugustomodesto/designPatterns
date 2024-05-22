package br.com.modesto.behavior.impl;

import br.com.modesto.behavior.QuackBehavior;

public class QuackSound implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("sound quack");
    }
}
