package factory.abstracts.factory.ingredient.impl;

import factory.abstracts.factory.ingredient.PizzaIngredientFactory;
import factory.abstracts.ingredient.ny.*;
import factory.abstracts.ingredient.vegges.Garlic;
import factory.abstracts.ingredient.vegges.Mushroom;
import factory.abstracts.ingredient.vegges.Onion;
import factory.abstracts.ingredient.vegges.RedPepper;
import factory.abstracts.ingredient.abstracts.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    @Override
    public Pepperoni createPepperony() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
