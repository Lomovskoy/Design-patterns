package strategy.internals.impl;

import strategy.internals.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Писк");
    }
}
