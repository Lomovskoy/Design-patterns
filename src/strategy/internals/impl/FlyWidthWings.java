package strategy.internals.impl;

import strategy.internals.FlyBehavior;

public class FlyWidthWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Я летаю!");
    }
}
