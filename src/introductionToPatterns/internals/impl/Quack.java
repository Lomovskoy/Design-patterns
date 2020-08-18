package introductionToPatterns.internals.impl;

import introductionToPatterns.internals.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Кряк!");
    }
}
