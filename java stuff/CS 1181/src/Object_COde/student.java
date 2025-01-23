package Object_COde;
public class student extends raider{
    private int uid; 
    private double gpa; 

    public student(){ 
        super(); 
        uid = 0; 
        gpa = 0.0; 
    } 
    public student(String lastName, String firstName, int uid, double gpa){ 
        super(lastName, firstName); 
        // Check for valid uid 
        this.uid = uid; 
        this.gpa = gpa; 
    } 

@Override 
    public String toString(){ 
        return super.toString() + " (u" + uid + ")" + " GPA = " + gpa; 
    } 
}
