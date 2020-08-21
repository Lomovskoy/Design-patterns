package factory.abstracts.pizza.chicago;


import factory.abstracts.factory.ingredient.PizzaIngredientFactory;
import factory.abstracts.pizza.abstracts.Pizza;

public class ChicagoPepperoniPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoPepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        setName("ChicagoPepperoniPizza");
    }

    @Override
    public void prepare() {
        setDough(pizzaIngredientFactory.createDough());
        setSauce(pizzaIngredientFactory.createSauce());
        setCheese(pizzaIngredientFactory.createCheese());
        setPepperoni(pizzaIngredientFactory.createPepperony());
    }
}
