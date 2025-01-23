package projects;

public class CrossingEvent extends Event{
    /**
     * Constructo for CrossingEvent
     * @param truckNum the Truck Number
     * @param time time of the event
     */
    public CrossingEvent(int truckNum, double time){
        super(truckNum, time);
    }
    /**
     * toString method for CrossingEvent
     */
    public String toString(){
        return time + " Truck " +  truckNum + " is now crossing the railroad";
    }
}
