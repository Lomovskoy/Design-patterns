package factory.method.varieties.ca.impl;

import factory.method.abstracts.Pizza;
import factory.method.enums.ListingPizza;
import factory.method.varieties.ca.CaliforniaPizza;

public class CaliforniaVeggiePizza extends Pizza implements CaliforniaPizza {

    @Override
    public String description() {
        return STILE + ListingPizza.VEGGIE.name().toLowerCase();
    }

}
