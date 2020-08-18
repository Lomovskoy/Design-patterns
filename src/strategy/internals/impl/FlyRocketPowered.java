package strategy.internals.impl;

import strategy.internals.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Я реактивно лечу!");
    }
}
