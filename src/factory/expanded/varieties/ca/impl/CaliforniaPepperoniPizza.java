package factory.expanded.varieties.ca.impl;

import factory.expanded.abstracts.Pizza;
import factory.expanded.enums.ListingPizza;
import factory.expanded.varieties.ca.CaliforniaPizza;

public class CaliforniaPepperoniPizza extends Pizza implements CaliforniaPizza {

    @Override
    public String description() {
        return STILE + ListingPizza.PEPPERONI.name().toLowerCase();
    }
}
