package factory.expanded.store;

import factory.expanded.abstracts.Pizza;
import factory.expanded.enums.ListingPizza;
import factory.expanded.factory.ChicagoPizzaFactory;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(ListingPizza type) {
        ChicagoPizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();
        return chicagoPizzaFactory.createPizza(type);
    }
}
