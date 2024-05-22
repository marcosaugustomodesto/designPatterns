package br.com.modesto.behavior.impl;

import br.com.modesto.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("not fly");
    }
}
