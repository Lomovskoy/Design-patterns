package factory.method.store;

import factory.method.abstracts.Pizza;
import factory.method.enums.ListingPizza;
import factory.method.factory.ChicagoPizzaFactory;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(ListingPizza type) {
        ChicagoPizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();
        return chicagoPizzaFactory.createPizza(type);
    }
}
