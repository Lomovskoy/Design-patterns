package factory.abstracts.factory.pizza;

import factory.abstracts.factory.ingredient.PizzaIngredientFactory;
import factory.abstracts.pizza.abstracts.Pizza;
import factory.abstracts.enums.ListingPizza;
import factory.abstracts.pizza.chicago.ChicagoCheesePizza;
import factory.abstracts.pizza.chicago.ChicagoClamPizza;
import factory.abstracts.pizza.chicago.ChicagoPepperoniPizza;
import factory.abstracts.pizza.chicago.ChicagoVeggiePizza;

public class ChicagoPizzaFactory extends AbstractPizzaFactory {

    @Override
    public Pizza createPizza(ListingPizza type, PizzaIngredientFactory pizzaIngredientFactory){
        Pizza pizza = null;

        switch (type){
            case CHEESE    -> pizza = new ChicagoCheesePizza(pizzaIngredientFactory);
            case PEPPERONI -> pizza = new ChicagoPepperoniPizza(pizzaIngredientFactory);
            case CLAM      -> pizza = new ChicagoClamPizza(pizzaIngredientFactory);
            case VEGGIE    -> pizza = new ChicagoVeggiePizza(pizzaIngredientFactory);
        }

        return pizza;
    }
}
