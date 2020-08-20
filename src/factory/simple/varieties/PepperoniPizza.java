package factory.simple.varieties;

import factory.simple.enums.ListingPizza;
import factory.simple.abstracts.Pizza;

public class PepperoniPizza extends Pizza {

    @Override
    public String description() {
        return ListingPizza.PEPPERONI.name().toLowerCase();
    }
}
