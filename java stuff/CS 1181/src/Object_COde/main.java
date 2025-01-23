package Object_COde;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) { 

        student t = new student("Raymer", "Mike", 123, 3.8); 
        employee e = new employee("Raymer", "Delia", 456); 
        ArrayList<raider> attendees = new ArrayList<>(); 
        
        attendees.add(t); 
        
        attendees.add(e); 
        
        raider r = new student("Doe", "John", 345, 3.6); 
        
        System.out.println(r); 
        
        } 
}
