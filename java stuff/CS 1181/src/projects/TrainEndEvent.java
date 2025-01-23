package projects;

public class TrainEndEvent extends Event{
    /**
     * Constructor for trainEndEvent
     * @param time time of the event
     */
    public TrainEndEvent(double time){
        super(time);
    }
    /**
     * toString method for trainEndEvent
     */
    public String toString(){
        return this.time + " Train is now off the tracks"; 
    }
}
