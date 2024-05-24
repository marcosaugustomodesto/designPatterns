package br.com.modesto.ducktype.impl;

import br.com.modesto.animaltype.Turkey;
import br.com.modesto.behavior.impl.FlyWithWings;
import br.com.modesto.behavior.impl.GobbleSound;

public class BigTurkey extends Turkey {
    public BigTurkey() {
        flyBehavior = new FlyWithWings();
        gobbleBehavior = new GobbleSound();
    }

    @Override
    public void display() {
        System.out.println("Big turkey");
    }
}
