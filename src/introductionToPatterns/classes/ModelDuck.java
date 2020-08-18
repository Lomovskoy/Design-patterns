package introductionToPatterns.classes;

import introductionToPatterns.internals.impl.FlyNoWay;
import introductionToPatterns.internals.impl.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Я модель утки");
    }
}
