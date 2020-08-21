package factory.abstracts.pizza.chicago;


import factory.abstracts.factory.ingredient.PizzaIngredientFactory;
import factory.abstracts.pizza.abstracts.Pizza;

public class ChicagoVeggiePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        setName("ChicagoVeggiePizza");
    }

    @Override
    public void prepare() {
        setDough(pizzaIngredientFactory.createDough());
        setSauce(pizzaIngredientFactory.createSauce());
        setVeggies(pizzaIngredientFactory.createVeggies());
    }
}
