package factory.abstracts.pizza.ny;

import factory.abstracts.factory.ingredient.PizzaIngredientFactory;
import factory.abstracts.pizza.abstracts.Pizza;

public class NYPepperoniPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public NYPepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        setName("NYPepperoniPizza");
    }

    @Override
    public void prepare() {
        setDough(pizzaIngredientFactory.createDough());
        setSauce(pizzaIngredientFactory.createSauce());
        setCheese(pizzaIngredientFactory.createCheese());
        setPepperoni(pizzaIngredientFactory.createPepperony());
    }
}
