package introductionToPatterns.internals.impl;

import introductionToPatterns.internals.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Писк");
    }
}
