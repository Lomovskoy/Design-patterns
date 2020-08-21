package factory.abstracts.factory.pizza;

import factory.abstracts.factory.ingredient.PizzaIngredientFactory;
import factory.abstracts.pizza.abstracts.Pizza;
import factory.abstracts.enums.ListingPizza;
import factory.abstracts.pizza.ny.NYCheesePizza;
import factory.abstracts.pizza.ny.NYClamPizza;
import factory.abstracts.pizza.ny.NYPepperoniPizza;
import factory.abstracts.pizza.ny.NYVeggiePizza;

public class NYPizzaFactory extends AbstractPizzaFactory {

    @Override
    public Pizza createPizza(ListingPizza type, PizzaIngredientFactory pizzaIngredientFactory){
        Pizza pizza = null;

        switch (type){
            case CHEESE    -> pizza = new NYCheesePizza(pizzaIngredientFactory);
            case PEPPERONI -> pizza = new NYPepperoniPizza(pizzaIngredientFactory);
            case CLAM      -> pizza = new NYClamPizza(pizzaIngredientFactory);
            case VEGGIE    -> pizza = new NYVeggiePizza(pizzaIngredientFactory);
        }

        return pizza;
    }

}
