package factory.simple.factory;

import factory.simple.enums.ListingPizza;
import factory.simple.abstracts.Pizza;
import factory.simple.varieties.CheesePizza;
import factory.simple.varieties.ClamPizza;
import factory.simple.varieties.PepperoniPizza;
import factory.simple.varieties.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(ListingPizza type){
        Pizza pizza = null;

        switch (type){
            case CHEESE    -> pizza = new CheesePizza();
            case PEPPERONI -> pizza = new PepperoniPizza();
            case CLAM      -> pizza = new ClamPizza();
            case VEGGIE    -> pizza = new VeggiePizza();
        }

        return pizza;
    }
}
