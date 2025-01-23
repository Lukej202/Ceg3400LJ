package projects;

public class FinishEvent extends Event{
    /**
     * constructor for a FInishEvent
     * @param truckNum the Truck Number
     * @param time time of the event 
     */
    public FinishEvent(int truckNum, double time){
        super(truckNum, time);
    }
    /**
     * toString method for FInishEvent
     */
    public String toString(){
        return time + " Truck " + truckNum + " has finished thier journey";
    }
}
