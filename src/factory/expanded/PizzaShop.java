package factory.expanded;

import factory.expanded.abstracts.Pizza;
import factory.expanded.enums.ListingPizza;
import factory.expanded.factory.AbstractPizzaFactory;
import factory.expanded.factory.ChicagoPizzaFactory;
import factory.expanded.factory.NYPizzaFactory;
import factory.expanded.store.ChicagoPizzaStore;
import factory.expanded.store.NYPizzaStore;
import factory.expanded.store.PizzaStore;

public class PizzaShop {

    public static void main(String[] args) {

        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza cheese = pizzaStore.orderPizza(ListingPizza.CHEESE);
        Pizza pepperoni = pizzaStore.orderPizza(ListingPizza.PEPPERONI);
        System.out.println("Pizza " + cheese.description() + " ready");
        System.out.println("Pizza " + pepperoni.description() + " ready");


        pizzaStore = new ChicagoPizzaStore();
        Pizza clam = pizzaStore.orderPizza(ListingPizza.CLAM);
        Pizza veggie = pizzaStore.orderPizza(ListingPizza.VEGGIE);
        System.out.println("Pizza " + clam.description() + " ready");
        System.out.println("Pizza " + veggie.description() + " ready");
    }
}
