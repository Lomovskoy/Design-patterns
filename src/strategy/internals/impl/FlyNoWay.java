package strategy.internals.impl;

import strategy.internals.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Я не летаю");
    }
}
