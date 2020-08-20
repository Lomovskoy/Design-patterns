package factory.method;

import factory.method.abstracts.Pizza;
import factory.method.enums.ListingPizza;
import factory.method.store.ChicagoPizzaStore;
import factory.method.store.NYPizzaStore;
import factory.method.store.PizzaStore;

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
