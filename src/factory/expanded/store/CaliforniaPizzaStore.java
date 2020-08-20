package factory.expanded.store;

import factory.expanded.abstracts.Pizza;
import factory.expanded.enums.ListingPizza;
import factory.expanded.factory.CaliforniaPizzaFactory;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(ListingPizza type) {
        CaliforniaPizzaFactory chicagoPizzaFactory = new CaliforniaPizzaFactory();
        return chicagoPizzaFactory.createPizza(type);
    }
}
