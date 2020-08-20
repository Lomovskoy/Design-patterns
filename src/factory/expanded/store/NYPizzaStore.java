package factory.expanded.store;

import factory.expanded.abstracts.Pizza;
import factory.expanded.enums.ListingPizza;
import factory.expanded.factory.NYPizzaFactory;

public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(ListingPizza type) {
        NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
        return nyPizzaFactory.createPizza(type);
    }
}
