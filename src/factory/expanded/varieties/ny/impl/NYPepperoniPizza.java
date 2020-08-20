package factory.expanded.varieties.ny.impl;

import factory.expanded.abstracts.Pizza;
import factory.expanded.enums.ListingPizza;
import factory.expanded.varieties.ny.NYPizza;

public class NYPepperoniPizza extends Pizza implements NYPizza {

    @Override
    public String description() {
        return STILE + ListingPizza.PEPPERONI.name().toLowerCase();
    }
}
