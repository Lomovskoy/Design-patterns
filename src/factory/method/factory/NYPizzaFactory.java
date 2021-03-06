package factory.method.factory;

import factory.method.abstracts.Pizza;
import factory.method.enums.ListingPizza;
import factory.method.varieties.ny.impl.NYCheesePizza;
import factory.method.varieties.ny.impl.NYClamPizza;
import factory.method.varieties.ny.impl.NYPepperoniPizza;
import factory.method.varieties.ny.impl.NYVeggiePizza;

public class NYPizzaFactory extends AbstractPizzaFactory{

    @Override
    public Pizza createPizza(ListingPizza type){
        Pizza pizza = null;

        switch (type){
            case CHEESE    -> pizza = new NYCheesePizza();
            case PEPPERONI -> pizza = new NYPepperoniPizza();
            case CLAM      -> pizza = new NYClamPizza();
            case VEGGIE    -> pizza = new NYVeggiePizza();
        }

        return pizza;
    }

}
