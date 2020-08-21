package factory.abstracts.factory.pizza;

import factory.abstracts.factory.ingredient.PizzaIngredientFactory;
import factory.abstracts.pizza.abstracts.Pizza;
import factory.abstracts.enums.ListingPizza;

public abstract class AbstractPizzaFactory {

    public abstract Pizza createPizza(ListingPizza type, PizzaIngredientFactory pizzaIngredientFactory);
}
