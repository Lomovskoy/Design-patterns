package strategy.internals.impl;

import strategy.internals.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Тишина");
    }
}
