package factory.method.varieties.ch.impl;

import factory.method.abstracts.Pizza;
import factory.method.enums.ListingPizza;
import factory.method.varieties.ch.ChicagoPizza;

public class ChicagoClamPizza extends Pizza implements ChicagoPizza {

    @Override
    public String description() {
        return STILE + ListingPizza.CLAM.name().toLowerCase();
    }
}
