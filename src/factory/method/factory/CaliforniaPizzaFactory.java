package factory.method.factory;

import factory.method.abstracts.Pizza;
import factory.method.enums.ListingPizza;
import factory.method.varieties.ca.impl.CaliforniaCheesePizza;
import factory.method.varieties.ca.impl.CaliforniaClamPizza;
import factory.method.varieties.ca.impl.CaliforniaPepperoniPizza;
import factory.method.varieties.ca.impl.CaliforniaVeggiePizza;

public class CaliforniaPizzaFactory extends AbstractPizzaFactory{

    @Override
    public Pizza createPizza(ListingPizza type){
        Pizza pizza = null;

        switch (type){
            case CHEESE    -> pizza = new CaliforniaCheesePizza();
            case PEPPERONI -> pizza = new CaliforniaPepperoniPizza();
            case CLAM      -> pizza = new CaliforniaClamPizza();
            case VEGGIE    -> pizza = new CaliforniaVeggiePizza();
        }

        return pizza;
    }
}
