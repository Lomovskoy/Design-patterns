package factory.method.factory;

import factory.method.abstracts.Pizza;
import factory.method.enums.ListingPizza;

public abstract class AbstractPizzaFactory {

    public abstract Pizza createPizza(ListingPizza type);
}
