package factory.simple.varieties;

import factory.simple.enums.ListingPizza;
import factory.simple.abstracts.Pizza;

public class CheesePizza extends Pizza {

    @Override
    public String description() {
        return ListingPizza.CHEESE.name().toLowerCase();
    }
}
