package design_1.Decorator;

/*
this class runs the objects that we have made possible using decorator pattern.
 */
public class RunDecorator {
    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee);

        coffee = new WithMilk(coffee);
        System.out.println(coffee);

        coffee = new WithPumpkinSpice(coffee);
        System.out.println(coffee);

        coffee = new WithMilk(coffee);
        System.out.println(coffee);

        coffee = new WithFoam(coffee);
        System.out.println(coffee);

        coffee = new WithMilkAndPumpkin(coffee);
        System.out.println(coffee);
    }
}
