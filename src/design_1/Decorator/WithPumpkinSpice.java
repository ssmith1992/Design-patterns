package design_1.Decorator;

/*
Concrete decorator
this is the subclass of of Coffee that extends Decorator
 */
public class WithPumpkinSpice extends DecoratorCoffee {
    public WithPumpkinSpice(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.00;
    }

    @Override
    public String getIngredients() {
        printWithPumpkinSpice();
        return super.getIngredients() + ", Pumpkin Spice";
    }

    private void printWithPumpkinSpice() {
        System.out.println("This is an added functionality from printWithPumpkinSpice");
    }
}
