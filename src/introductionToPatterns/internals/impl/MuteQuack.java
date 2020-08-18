package introductionToPatterns.internals.impl;

import introductionToPatterns.internals.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Тишина");
    }
}
