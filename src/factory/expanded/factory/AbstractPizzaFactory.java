package factory.expanded.factory;

import factory.expanded.abstracts.Pizza;
import factory.expanded.enums.ListingPizza;
import factory.expanded.varieties.ny.impl.NYCheesePizza;
import factory.expanded.varieties.ny.impl.NYClamPizza;
import factory.expanded.varieties.ny.impl.NYPepperoniPizza;
import factory.expanded.varieties.ny.impl.NYVeggiePizza;

public abstract class AbstractPizzaFactory {

    public abstract Pizza createPizza(ListingPizza type);
}
