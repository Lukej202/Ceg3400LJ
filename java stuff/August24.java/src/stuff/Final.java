package stuff;
import java.util.*;
public class Final {
    public static truck checkTrucks(String truckName, ArrayList<truck> tr){
        for(int i = 0; i < tr.size(); i++){
            String currentTruckName = tr.get(i).getName();
            if(currentTruckName.equalsIgnoreCase(truckName)){
                return tr.get(i);
            }
        }
        return null;
    }
    public static void printTruck(String truckName, ArrayList<truck> tr){
        for(int i = 0; i < tr.size(); i++){
            String currentTruckName = tr.get(i).getName();
            if(currentTruckName.equalsIgnoreCase(truckName)){
                System.out.println("Truck: " + tr.get(i).getName());
                System.out.println("current Fuel: " + tr.get(i).getCurrentFuel());
                System.out.println("maximum Fuel: " + tr.get(i).getMaxFuel());
            }
        }
    }
    public static void reFuel(String truckName, ArrayList<truck> tr){
        for(int i = 0; i < tr.size(); i++){
            String currentTruckName = tr.get(i).getName();
            if(currentTruckName.equalsIgnoreCase(truckName)){
                tr.get(i).setCurrentFuel();
            }
        }
    }
    public static void job(String truckName, int fuel, ArrayList<truck> tr){
        for(int i = 0; i < tr.size(); i++){
            String currentTruckName = tr.get(i).getName();
            if(currentTruckName.equalsIgnoreCase(truckName)){
                tr.get(i).spendFuel(fuel);;
            }
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<truck> trucks = new ArrayList<>();
        trucks.add(new truck("Scoop", 5, 10));
        trucks.add(new truck("Muck", 2, 8));
        trucks.add(new truck("Dizzy", 4, 20));
        while(true){
            System.out.println("1 - veiw truck status ");
            System.out.println("2 - assign job to truck");
            System.out.println("3 - refuel truck ");
            System.out.println("4 - end program ");
        int option = sc.nextInt();
            if(option == 1){
                System.out.println("Which truck would you like to veiw? ");
                String truck = sc.next();
                if(checkTrucks(truck, trucks) != null){
                    printTruck(truck, trucks);
                }
            }
            else if(option == 2){
                System.out.println("what truck is going for the job? ");
                String truck = sc.next();
                if(checkTrucks(truck, trucks) != null){
                    System.out.println("How much fuel is needed for the job? ");
                    int fuel = sc.nextInt();
                    job(truck, fuel, trucks);
                }
            }
            else if(option == 3){
                System.out.println("what truck is getting refueled? ");
                String truck = sc.next();
                if(checkTrucks(truck, trucks) != null){
                    reFuel(truck, trucks);
                }
            }
            else if(option == 4){
                break;
            }
            else{
                System.out.println("bad input");
            }
        }
    }
}
