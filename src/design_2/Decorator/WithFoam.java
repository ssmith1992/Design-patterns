package design_2.Decorator;

/*
Concrete decorator
this is the subclass of of Coffee that extends Decorator
 */
public class WithFoam extends DecoratorCoffee {
    public WithFoam(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.00;
    }

    @Override
    public String getIngredients() {
        printWithFoam();
        return super.getIngredients() + ", with foam";
    }

    private void printWithFoam() {
        System.out.println("This is an added functionality from WithFoam");
    }

}
