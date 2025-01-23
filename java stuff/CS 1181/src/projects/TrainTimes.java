package projects;

public class TrainTimes {
    double startTime;
            double length;
            double endTime;
            /**
             * Constructor for trainTimes
             * @param startTime the start time of the train
             * @param length how long the train is going to be on the tracks
             */
            public TrainTimes(double startTime, double length){
                this.startTime = startTime;
                this.length = length;
                this.endTime = startTime + length;
            }
            /**
             * getter for the startTime
             * @return returns the starTime
             */
            public double getStartTime(){
                return startTime;
            }
            /**
             * getter for the length of the train
             * @return returns the length of the train
             */
            public double getLength(){
                return length;
            }
            /**
             * getter for the endTime of the train
             * @return returns the endtime of the train
             */
            public double getEndTime(){
                return endTime;
            }
}
