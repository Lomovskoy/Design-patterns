package factory.simple;

import factory.simple.abstracts.Pizza;
import factory.simple.enums.ListingPizza;
import factory.simple.factory.SimplePizzaFactory;
import factory.simple.store.PizzaStore;

public class PizzaShop {

    public static void main(String[] args) {

        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);

        Pizza cheese = pizzaStore.orderPizza(ListingPizza.CHEESE);
        Pizza pepperoni = pizzaStore.orderPizza(ListingPizza.PEPPERONI);
        Pizza clam = pizzaStore.orderPizza(ListingPizza.CLAM);
        Pizza veggie = pizzaStore.orderPizza(ListingPizza.VEGGIE);

        System.out.println("Pizza " + cheese.description() + " ready");
        System.out.println("Pizza " + pepperoni.description() + " ready");
        System.out.println("Pizza " + clam.description() + " ready");
        System.out.println("Pizza " + veggie.description() + " ready");
    }
}
