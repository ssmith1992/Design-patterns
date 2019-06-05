package design_2.Decorator;

/*
Concrete decorator
this is the subclass of of Coffee that extends Decorator
 */
public class WithMilk extends DecoratorCoffee {
    public WithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Milk";
    }
}
