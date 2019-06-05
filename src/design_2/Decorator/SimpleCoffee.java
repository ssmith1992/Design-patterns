package design_2.Decorator;

/*
concrete base
the class that makes the most simple form of the object we want to make changes too.
 */
public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }

    @Override
    public String toString() {
        return "Cost: " + getCost() + "\nIngredients: " + getIngredients();
    }
}