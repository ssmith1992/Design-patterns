package design_2.Decorator;

public class WithMilkAndPumpkin extends DecoratorCoffee {
    public WithMilkAndPumpkin(Coffee coffee) {
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


    public void printWithMilkAndPumkin(){
        System.out.println("this is a test for Milk and pumpkin");
    }


}
