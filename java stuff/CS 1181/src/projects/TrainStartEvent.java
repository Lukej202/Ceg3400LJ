package projects;


public class TrainStartEvent extends Event{
    double length;
    /**
     * Constructor for TrainStartEvent
     * @param time the time of the event
     */
    public TrainStartEvent(double time) {
        super(time);
    }
    /**
     * setter for the length of the train
     * @param length the length of the train
     */
    public void setLength(double length){
        this.length = length;
    }
    /**
     * getter for the length of the train
     * @return returns the length of the train
     */
    public double getLength(){
        return length;
    }
    /**
     * toString method for trainStartEvent
     */
    public String toString(){
        return time + " A Train is now on the tracks.";   
    }
}
