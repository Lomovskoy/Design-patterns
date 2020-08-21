package factory.abstracts.pizza.ny;

import factory.abstracts.factory.ingredient.PizzaIngredientFactory;
import factory.abstracts.pizza.abstracts.Pizza;

public class NYVeggiePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public NYVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        setName("NYVeggiePizza");
    }

    @Override
    public void prepare() {
        setDough(pizzaIngredientFactory.createDough());
        setSauce(pizzaIngredientFactory.createSauce());
        setVeggies(pizzaIngredientFactory.createVeggies());
    }
}
