package factory.method.store;

import factory.method.abstracts.Pizza;
import factory.method.enums.ListingPizza;

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
