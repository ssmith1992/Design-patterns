package design_1.Decorator;

/*
decorator base
this is the decorator class. this class deals with how you use the decorator pattern.
 */
public abstract class DecoratorCoffee implements Coffee {
    private Coffee coffee;

    public DecoratorCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients();
    }

    @Override
    public String toString() {
        return "Cost: " + getCost() + "\nIngredients: " + getIngredients();
    }
}