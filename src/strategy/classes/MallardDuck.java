package strategy.classes;

import strategy.internals.impl.FlyWidthWings;
import strategy.internals.impl.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWidthWings();
    }

    @Override
    public void display() {
        System.out.println("Я настоящая кряква");
    }
}
