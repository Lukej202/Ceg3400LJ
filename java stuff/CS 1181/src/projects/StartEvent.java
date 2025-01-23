package projects;

public class StartEvent extends Event{
    /**
     * Constructor for a startEvent 
     * @param truckNum the Truck Number
     * @param time time of the event 
     */
        public StartEvent(int truckNum, double time) {
            super(truckNum, time);
        }
        /**
         * toString method for StartEvent
         */
    public String toString(){
        return this.time + " Truck " + this.truckNum + " is now starting its journey.";
    }
    
}