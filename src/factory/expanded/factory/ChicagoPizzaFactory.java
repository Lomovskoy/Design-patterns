package factory.expanded.factory;

import factory.expanded.abstracts.Pizza;
import factory.expanded.enums.ListingPizza;
import factory.expanded.varieties.ch.impl.ChicagoCheesePizza;
import factory.expanded.varieties.ch.impl.ChicagoClamPizza;
import factory.expanded.varieties.ch.impl.ChicagoPepperoniPizza;
import factory.expanded.varieties.ch.impl.ChicagoVeggiePizza;

public class ChicagoPizzaFactory extends AbstractPizzaFactory{

    @Override
    public Pizza createPizza(ListingPizza type){
        Pizza pizza = null;

        switch (type){
            case CHEESE    -> pizza = new ChicagoCheesePizza();
            case PEPPERONI -> pizza = new ChicagoPepperoniPizza();
            case CLAM      -> pizza = new ChicagoClamPizza();
            case VEGGIE    -> pizza = new ChicagoVeggiePizza();
        }

        return pizza;
    }
}
