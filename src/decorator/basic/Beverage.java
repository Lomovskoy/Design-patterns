package decorator.basic;

public abstract class Beverage {

    private String description = "Базовый напиток";

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public abstract double cost();
}
