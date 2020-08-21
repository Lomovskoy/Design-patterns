package factory.abstracts.factory.ingredient.impl;

import factory.abstracts.factory.ingredient.PizzaIngredientFactory;
import factory.abstracts.ingredient.abstracts.*;
import factory.abstracts.ingredient.chicago.FrozenClams;
import factory.abstracts.ingredient.chicago.MozzarellaCheese;
import factory.abstracts.ingredient.chicago.PlumTomatoSauce;
import factory.abstracts.ingredient.chicago.ThickCrustDough;
import factory.abstracts.ingredient.ny.SlicedPepperoni;
import factory.abstracts.ingredient.vegges.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new Spinach(), new BlackOlives() };
    }

    @Override
    public Pepperoni createPepperony() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
