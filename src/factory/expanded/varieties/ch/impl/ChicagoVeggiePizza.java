package factory.expanded.varieties.ch.impl;

import factory.expanded.abstracts.Pizza;
import factory.expanded.enums.ListingPizza;
import factory.expanded.varieties.ch.ChicagoPizza;

public class ChicagoVeggiePizza extends Pizza implements ChicagoPizza {

    @Override
    public String description() {
        return STILE + ListingPizza.VEGGIE.name().toLowerCase();
    }

}
