package strategy.classes;

import strategy.internals.impl.FlyNoWay;
import strategy.internals.impl.Quack;

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
