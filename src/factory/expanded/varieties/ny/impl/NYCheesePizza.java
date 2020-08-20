package factory.expanded.varieties.ny.impl;

import factory.expanded.abstracts.Pizza;
import factory.expanded.enums.ListingPizza;
import factory.expanded.varieties.ch.ChicagoPizza;

public class NYCheesePizza extends Pizza implements ChicagoPizza {

    @Override
    public String description() {
        return STILE + ListingPizza.CHEESE.name().toLowerCase();
    }
}
