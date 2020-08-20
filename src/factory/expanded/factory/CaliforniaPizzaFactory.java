package factory.expanded.factory;

import factory.expanded.abstracts.Pizza;
import factory.expanded.enums.ListingPizza;
import factory.expanded.varieties.ca.impl.CaliforniaCheesePizza;
import factory.expanded.varieties.ca.impl.CaliforniaClamPizza;
import factory.expanded.varieties.ca.impl.CaliforniaPepperoniPizza;
import factory.expanded.varieties.ca.impl.CaliforniaVeggiePizza;

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
