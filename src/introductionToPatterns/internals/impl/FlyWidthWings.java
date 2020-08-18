package introductionToPatterns.internals.impl;

import introductionToPatterns.internals.FlyBehavior;

public class FlyWidthWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Я летаю!");
    }
}
