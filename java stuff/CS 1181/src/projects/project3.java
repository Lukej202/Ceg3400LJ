package projects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
//the lowest total time from my testing was if precent by drone = 0.0 
public class project3 {
    //Constants
    static int packages = 1500;
    static int distanceToCrossing = 3000;
    static int distanceAfterCrossing = 27000;
    static int droneSpeed = 500;
    int droneCap = 1;
    static int droneDelay = 3;

    static int truckSpeed = 30;
    static int truckCap = 10;
    int truckDelay = 15;
    static double precentByDrone = 0.5;

    static double dronePackages = Math.ceil(packages * precentByDrone);
    static double numTrucks = ((1.0-precentByDrone) * packages)/truckCap;
    static double numDrones = (precentByDrone)*packages;

    public static void main(String[] args) throws FileNotFoundException {
        double time = 0.0;
        boolean isTrain = false;
        ArrayList<TrainTimes> t = trainSchedule();
        ArrayList<StartEvent> startTimes = new ArrayList<>();
        ArrayList<FinishEvent> finishTimes = new ArrayList<>();
        PriorityQueue<Event> e = new PriorityQueue<>();
        Queue<Event> waitingTrucks = new LinkedList<>(); 
        
        System.out.println("With " + (precentByDrone*100) + "% and " + packages + " packages");
        System.out.println("Number of Drones: " + (packages * precentByDrone));
        System.out.println("Number of trucks: " + Math.floor(numTrucks*100)/100);
    //prints the full train schedule
    System.out.println("Train Schedule");
    for(int i = 0; i < t.size(); i++){
        System.out.println(t.get(i).getStartTime() + "--" + t.get(i).getEndTime());
    }
    System.out.println();
        //Creates all of the Train related events and adds them to the priority queue
        for(int j = 0; j < t.size(); j++){
            TrainStartEvent t1 = new TrainStartEvent( t.get(j).getStartTime());
            t1.setLength(t.get(j).getLength());
            e.add(t1);
            e.add(new TrainEndEvent(t.get(j).getEndTime()));
        }
        //Creates all of the truckStartEvents
        for(int i = 0; i < Math.floor(numTrucks*100)/100d; i++){
            Event e1 = new StartEvent(i, time );
            time+=15;
            e.add(e1);

        }
        double trainStartTime = 0.0;
        double trainLength = 0.0;
        //loops through until the priority queue is empty
        while(!e.isEmpty()){
            //holds the first event in the priority queue
            Event currentEvent = e.poll();
            //checks if that event is a StartEvent
            if(currentEvent instanceof StartEvent){
                //prints the event a schedules the next one
                System.out.println(currentEvent);
                //holds the event in an arrayList to acess the time later
                startTimes.add((StartEvent)currentEvent);
                e.add(new TruckAtCrossing(currentEvent.getTruckNum(), currentEvent.getTime() + 100));
                //checks if the event is a Truck at crossing
            }else if(currentEvent instanceof TruckAtCrossing){
                //prints the event and checks if there is a train or if there are trucks waiting at the crossing
                System.out.println(currentEvent);
                if(isTrain == true || !waitingTrucks.isEmpty()){
                    if(waitingTrucks.isEmpty()){
                        waitingTrucks.add(new TruckAtCrossing(currentEvent.getTruckNum(), (trainStartTime+trainLength+1)));
                    }else if(!waitingTrucks.isEmpty()){
                        waitingTrucks.add(new TruckAtCrossing(currentEvent.getTruckNum(), waitingTrucks.peek().getTime() + (waitingTrucks.size())));
                    }
                }else{
                    e.add(new CrossingEvent(currentEvent.getTruckNum(), currentEvent.getTime()));
                }
                //Checks if the event is a CrossingEvent
            }else if(currentEvent instanceof CrossingEvent){
                System.out.println(currentEvent);
                //checks if there is a train
                if(isTrain == true){
                    //if true the truck has to wait 
                    waitingTrucks.add(new TruckAtCrossing(currentEvent.getTruckNum(), currentEvent.getTime()));
                }else{
                    //if not it crosses
                    e.add(new FinishEvent(currentEvent.getTruckNum(), currentEvent.getTime()+900));
                }
                //checks if its a finishEvent
            }else if(currentEvent instanceof FinishEvent){
                System.out.println(currentEvent);
                //adds it to an arrayList to acess the time later
                finishTimes.add((FinishEvent)currentEvent);
                //checks if its a trainStartEvent 
            }else if(currentEvent instanceof TrainStartEvent){
                System.out.println(currentEvent);
                trainStartTime = currentEvent.getTime();
                trainLength = ((TrainStartEvent)currentEvent).getLength();
                //sets isTrain boolean to true
                isTrain = true;
                //checks for the last instance trainEndevent
            }else{
                System.out.println(currentEvent);
                //resets the isTrain boolean
                isTrain = false;
                //clears the waiting trucks queue and converts all of the events into crossing events and puts 
                //them back into the event queue
                while(!waitingTrucks.isEmpty()){
                    Event e1 = waitingTrucks.poll();
                    e.add(new CrossingEvent(e1.getTruckNum(), e1.getTime()+waitingTrucks.size()));
                }
            }
            
        }
        //prints all of the statistics
        System.out.println("\n Statistics \n");
        //anonoymous inner class to sort Finish events by truck number
        Collections.sort(finishTimes, new Comparator<FinishEvent>() {
            public int compare(FinishEvent f1, FinishEvent f2){
                if(f1.getTruckNum() < f2.getTruckNum()){
                    return -1;
                }else return 1;
            }
        });
        
        //prints the time it took each truck to finish
        ArrayList<Double> times = new ArrayList<>();
        for(int i = 0; i < startTimes.size() && i < finishTimes.size(); i++){
            double timeTook = finishTimes.get(i).getTime() - startTimes.get(i).getTime();
            times.add(timeTook);
            System.out.println("Truck " + startTimes.get(i).getTruckNum() + " took " + timeTook + " minutes.");
        }
        //totals up all of the times to average them
        double total = 0;
        for(int i = 0; i < times.size(); i++){
            total += times.get(i);
        }
        
        System.out.println();
        //prints the average truck time
        System.out.println("Average time for all trucks " + Math.round((total/times.size())) + " minutes");
        //prints the total truck time
        System.out.println("Total time for Trucks " + finishTimes.get(finishTimes.size()-1).getTime() + " minutes \n");
        //prints the time for one drone
        System.out.println("Time for one drone: " + ((distanceToCrossing+distanceAfterCrossing)/droneSpeed) + " minutes");
        //prints the total time for the drones
        System.out.println("Total Time for Drones " + ((numDrones*droneDelay)+60) + " minutes \n");
        //porints the the total time of the whole simulation which is the bigger number between the total truck time and total drone time
        if(finishTimes.get(finishTimes.size()-1).getTime() > ((numDrones*droneDelay)+60)){
        System.out.println("Total time " + finishTimes.get(finishTimes.size()-1).getTime() + " minutes");
        }else{
            System.out.println("Total time " + ((numDrones*droneDelay)+60) + " minutes");
        }

    }
    /**
     * takes in the times for each train event and puts them into a Arraylist
     * @return return an ArrayList of Train Times for when a train starts and when it is off the tracks
     * @throws FileNotFoundException
     */
        public static ArrayList<TrainTimes> trainSchedule() throws FileNotFoundException{
            FileInputStream infs = new FileInputStream("trainschedule.txt");
            Scanner fileSc = new Scanner(infs);
            ArrayList<TrainTimes> t = new ArrayList<>();
            while(fileSc.hasNextLine()){
                String[] s = fileSc.nextLine().split(" ");
    
                double startTime = Double.parseDouble(s[0]);
                double length = Double.parseDouble(s[1]);
                TrainTimes tt = new TrainTimes(startTime, length);
                t.add(tt);
            }
            return t;
        }
    }

