package factory.method.factory;

import factory.method.abstracts.Pizza;
import factory.method.enums.ListingPizza;
import factory.method.varieties.ch.impl.ChicagoCheesePizza;
import factory.method.varieties.ch.impl.ChicagoClamPizza;
import factory.method.varieties.ch.impl.ChicagoPepperoniPizza;
import factory.method.varieties.ch.impl.ChicagoVeggiePizza;

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
