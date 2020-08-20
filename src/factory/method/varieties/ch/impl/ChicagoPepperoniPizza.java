package factory.method.varieties.ch.impl;

import factory.method.abstracts.Pizza;
import factory.method.enums.ListingPizza;
import factory.method.varieties.ch.ChicagoPizza;

public class ChicagoPepperoniPizza extends Pizza implements ChicagoPizza {

    @Override
    public String description() {
        return STILE + ListingPizza.PEPPERONI.name().toLowerCase();
    }
}
