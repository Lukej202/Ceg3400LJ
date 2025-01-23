package projects;

public class TruckAtCrossing extends Event{
    /** */
    public TruckAtCrossing(int truckNum, double time){
        super(truckNum, time);
    }

    public String toString(){
        return time + " Truck " + truckNum + " is now at the crossing";
    }
}
