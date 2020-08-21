package factory.abstracts;

import factory.abstracts.enums.ListingPizza;
import factory.abstracts.factory.ingredient.PizzaIngredientFactory;
import factory.abstracts.factory.ingredient.impl.ChicagoPizzaIngredientFactory;
import factory.abstracts.factory.ingredient.impl.NYPizzaIngredientFactory;
import factory.abstracts.pizza.abstracts.Pizza;
import factory.abstracts.store.ChicagoPizzaStore;
import factory.abstracts.store.NYPizzaStore;
import factory.abstracts.store.PizzaStore;

public class PizzaShop {

    public static void main(String[] args) {

        PizzaStore pizzaStore = new NYPizzaStore();
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        Pizza cheese = pizzaStore.orderPizza(ListingPizza.CHEESE, pizzaIngredientFactory);
        Pizza pepperoni = pizzaStore.orderPizza(ListingPizza.PEPPERONI, pizzaIngredientFactory);
        System.out.println("Pizza " + cheese.description() + " ready");
        System.out.println("Pizza " + pepperoni.description() + " ready");


        pizzaStore = new ChicagoPizzaStore();
        pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        Pizza clam = pizzaStore.orderPizza(ListingPizza.CLAM, pizzaIngredientFactory);
        Pizza veggie = pizzaStore.orderPizza(ListingPizza.VEGGIE, pizzaIngredientFactory);
        System.out.println("Pizza " + clam.description() + " ready");
        System.out.println("Pizza " + veggie.description() + " ready");

    }
}
