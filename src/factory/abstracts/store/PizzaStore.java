package factory.abstracts.store;

import factory.abstracts.factory.ingredient.PizzaIngredientFactory;
import factory.abstracts.pizza.abstracts.Pizza;
import factory.abstracts.enums.ListingPizza;

public abstract class PizzaStore {

    public Pizza orderPizza(ListingPizza type, PizzaIngredientFactory pizzaIngredientFactory){

        Pizza pizza = createPizza(type, pizzaIngredientFactory);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(ListingPizza type, PizzaIngredientFactory pizzaIngredientFactory);
}
