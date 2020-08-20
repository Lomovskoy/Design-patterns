package factory.method.store;

import factory.method.abstracts.Pizza;
import factory.method.enums.ListingPizza;
import factory.method.factory.NYPizzaFactory;

public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(ListingPizza type) {
        NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
        return nyPizzaFactory.createPizza(type);
    }
}
