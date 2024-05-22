package br.com.modesto.behavior.impl;

import br.com.modesto.behavior.FlyBehavior;

public class FlyWithRockets implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with rockets");
    }
}
