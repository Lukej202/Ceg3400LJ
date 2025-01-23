package projects;

public class Event implements Comparable<Event>{
        protected int truckNum;
        protected double time;
        /**
         * constructor 1 for the train events
         * @param time the time for each event
         */
        public Event (double time){
            this.time = time;
        }
        /**
         * Constructor 2 for all of the truck events
         * @param truckNum thruck number
         * @param time time for the event
         */
        public Event(int truckNum, double time){
            this.truckNum = truckNum;
            this.time = time;
        }
        /**
         * getter for the time of the event
         * @return returns the time
         */
        public double getTime(){
            return time;
        }
        /**
         * getter for the truck number
         * @return returns the truck number
         */
        public int getTruckNum(){
            return this.truckNum;
        }
        /**
         * compareTo method for the priority queue in the driver program 
         */
        public int compareTo(Event other){
            if(this.time < other.time){
                return -1;
            }else if(this.time > other.time){
                return 1;
            }else{
                // Events have the same time
            if (this instanceof TruckAtCrossing && other instanceof CrossingEvent) {
                return -1; // Trucks Crossing take priority over trains in priorityQueue
            } else if (this instanceof TrainStartEvent || this instanceof TrainEndEvent) {
                return -1; // Trains take priority over everything else
            } else
                return 1;
        }
            }
        }

