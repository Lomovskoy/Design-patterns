package strategy.internals.impl;

import strategy.internals.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Кряк!");
    }
}
