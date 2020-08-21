package factory.abstracts.factory.ingredient;

import factory.abstracts.ingredient.abstracts.*;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperony();
    Clams createClams();
}
