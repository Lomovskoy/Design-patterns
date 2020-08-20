package factory.expanded.factory;

import factory.expanded.abstracts.Pizza;
import factory.expanded.enums.ListingPizza;
import factory.expanded.varieties.ny.impl.NYCheesePizza;
import factory.expanded.varieties.ny.impl.NYClamPizza;
import factory.expanded.varieties.ny.impl.NYPepperoniPizza;
import factory.expanded.varieties.ny.impl.NYVeggiePizza;

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
