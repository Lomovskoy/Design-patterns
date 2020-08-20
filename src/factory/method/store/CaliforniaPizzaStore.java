package factory.method.store;

import factory.method.abstracts.Pizza;
import factory.method.enums.ListingPizza;
import factory.method.factory.CaliforniaPizzaFactory;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(ListingPizza type) {
        CaliforniaPizzaFactory chicagoPizzaFactory = new CaliforniaPizzaFactory();
        return chicagoPizzaFactory.createPizza(type);
    }
}
