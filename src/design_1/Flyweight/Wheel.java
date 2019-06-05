package design_1.Flyweight;

public class Wheel implements WheelInterface {

    private Tire tire;
    private Rim rim;

    public Wheel(Tire tire, Rim rim) {
        this.tire = tire;
        this.rim = rim;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public void setRim(Rim rim) {
        this.rim = rim;
    }

    public Tire getTire() {
        return tire;
    }

    public Rim getRim() {
        return rim;
    }

    @Override
    public void create(){

        //System.out.println("Creating new Wheel object with: Tire = " + tire + ", Rim = " + rim);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "tire=" + tire +
                ", rim=" + rim +
                '}';
    }
}
