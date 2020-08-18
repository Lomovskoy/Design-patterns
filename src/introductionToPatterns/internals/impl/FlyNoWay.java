package introductionToPatterns.internals.impl;

import introductionToPatterns.internals.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Я не летаю");
    }
}
