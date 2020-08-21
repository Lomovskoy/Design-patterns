package factory.abstracts.pizza.ny;

import factory.abstracts.factory.ingredient.PizzaIngredientFactory;
import factory.abstracts.pizza.abstracts.Pizza;

public class NYClamPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public NYClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        setName("NYClamPizza");
    }

    @Override
    public void prepare() {
        setDough(pizzaIngredientFactory.createDough());
        setSauce(pizzaIngredientFactory.createSauce());
        setCheese(pizzaIngredientFactory.createCheese());
        setClams(pizzaIngredientFactory.createClams());
    }
}
