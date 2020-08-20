package factory.method.varieties.ny.impl;

import factory.method.abstracts.Pizza;
import factory.method.enums.ListingPizza;
import factory.method.varieties.ny.NYPizza;

public class NYCheesePizza extends Pizza implements NYPizza {

    @Override
    public String description() {
        return STILE + ListingPizza.CHEESE.name().toLowerCase();
    }
}
