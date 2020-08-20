package factory.simple.store;

import factory.simple.abstracts.Pizza;
import factory.simple.enums.ListingPizza;
import factory.simple.factory.SimplePizzaFactory;

public class PizzaStore {

    SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(ListingPizza type){

        Pizza pizza = pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
