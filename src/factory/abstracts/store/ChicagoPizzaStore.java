package factory.abstracts.store;

import factory.abstracts.factory.ingredient.PizzaIngredientFactory;
import factory.abstracts.factory.pizza.ChicagoPizzaFactory;
import factory.abstracts.pizza.abstracts.Pizza;
import factory.abstracts.enums.ListingPizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(ListingPizza type, PizzaIngredientFactory pizzaIngredientFactory) {
        ChicagoPizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();
        return chicagoPizzaFactory.createPizza(type, pizzaIngredientFactory);
    }
}
