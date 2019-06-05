package design_1.Flyweight;

public class RunFlyweight {

    private static final String rims[] = {"alufælge", "Steelfælge", "fedefælge", "storefælge", "pigefælge", "drengefælge", "mandefælge"};
    private static final String tires[] = {"fededæk", "tyndedæk", "tykkedæk", "storedæk", "pigedæk", "drengedæk", "mandedæk"};

    public static void main(String[] args) {

        Wheel wheel = new Wheel(WheelFactory.getTire(getRandomTire()), WheelFactory.getRim(getRandomRim()));
        wheel.create();
        double startTime = System.nanoTime();

        for (int i = 0 ; i < 1000000 ; i++ ){



            wheel.setRim(WheelFactory.getRim(getRandomRim()));
            wheel.setTire(WheelFactory.getTire(getRandomTire()));
           // System.out.println("Replacing wheel to: Rim: " + wheel.getRim().getName() + " Tire: " + wheel.getTire().getName());
        }

        double endTime = System.nanoTime();
        System.out.println(endTime - startTime);


    }

    private static String getRandomTire(){
        return tires[(int)(Math.random()*tires.length)];
    }

    private static String getRandomRim(){
        return rims[(int)(Math.random()*rims.length)];
    }

}
