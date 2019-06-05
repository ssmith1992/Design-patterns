package design_1.Flyweight;

import java.util.HashMap;

public class WheelFactory {

    private static final HashMap tirelist = new HashMap();
    private static final HashMap rimlist = new HashMap();

    public static Tire getTire(String name){

        Tire tire = (Tire)tirelist.get(name);

        if (tire == null){
            tire = new Tire(name);
            tirelist.put(name, tire);
            //System.out.println("Creating new tire named: " + tire.getName());
        }
        return tire;
    }


    public static Rim getRim(String name){

        Rim rim =(Rim)rimlist.get(name);

        if (rim == null){
            rim = new Rim(name);
            rimlist.put(name, rim);
           // System.out.println("Creating new Rim named: " + rim.getName());
        }
        return rim;
    }
}


