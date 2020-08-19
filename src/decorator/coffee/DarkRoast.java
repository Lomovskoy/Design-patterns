package decorator.coffee;

import decorator.basic.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        setDescription("DarkRoast");
    }

    @Override
    public double cost() {
        return .99;
    }
}
