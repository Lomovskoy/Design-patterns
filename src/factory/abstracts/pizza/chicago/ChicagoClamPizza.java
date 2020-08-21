package factory.abstracts.pizza.chicago;


import factory.abstracts.factory.ingredient.PizzaIngredientFactory;
import factory.abstracts.pizza.abstracts.Pizza;

public class ChicagoClamPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        setName("ChicagoClamPizza");
    }

    @Override
    public void prepare() {
        setDough(pizzaIngredientFactory.createDough());
        setSauce(pizzaIngredientFactory.createSauce());
        setCheese(pizzaIngredientFactory.createCheese());
        setClams(pizzaIngredientFactory.createClams());
    }
}
