package factory.simple.varieties;

import factory.simple.enums.ListingPizza;
import factory.simple.abstracts.Pizza;

public class VeggiePizza extends Pizza {

    @Override
    public String description() {
        return ListingPizza.VEGGIE.name().toLowerCase();
    }

}
