package factory.abstracts.store;


import factory.abstracts.factory.ingredient.PizzaIngredientFactory;
import factory.abstracts.factory.pizza.NYPizzaFactory;
import factory.abstracts.pizza.abstracts.Pizza;
import factory.abstracts.enums.ListingPizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(ListingPizza type, PizzaIngredientFactory pizzaIngredientFactory) {
        NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
        return nyPizzaFactory.createPizza(type, pizzaIngredientFactory);
    }
}
