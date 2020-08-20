package factory.simple.varieties;

import factory.simple.enums.ListingPizza;
import factory.simple.abstracts.Pizza;

public class ClamPizza extends Pizza {

    @Override
    public String description() {
        return ListingPizza.CLAM.name().toLowerCase();
    }
}
