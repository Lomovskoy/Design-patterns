package introductionToPatterns;

import introductionToPatterns.classes.Duck;
import introductionToPatterns.classes.MallardDuck;
import introductionToPatterns.classes.ModelDuck;
import introductionToPatterns.internals.impl.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        System.out.println("----------");
        
        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
