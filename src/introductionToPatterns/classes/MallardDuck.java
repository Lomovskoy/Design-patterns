package introductionToPatterns.classes;

import introductionToPatterns.internals.impl.FlyWidthWings;
import introductionToPatterns.internals.impl.Quack;

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
