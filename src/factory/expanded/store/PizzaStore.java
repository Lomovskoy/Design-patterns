package factory.expanded.store;

import factory.expanded.abstracts.Pizza;
import factory.expanded.enums.ListingPizza;
import factory.expanded.factory.AbstractPizzaFactory;

public abstract class PizzaStore {

    public Pizza orderPizza(ListingPizza type){

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(ListingPizza type);
}
