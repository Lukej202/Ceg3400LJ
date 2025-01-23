package Object_COde;

public class employee extends raider { 

    private int uid; 
    
    public employee(){ 
        super(); 
        uid = 0; 
    } 
    
    public employee(String lastName, String firstName, int uid){ 
        super(lastName, firstName); 
        // Check for valid uid 
        this.uid = uid; 
    } 
    @Override 
    public String toString(){ 
        return super.toString() + " (u" + uid + ")"; 
    }  
    
    } 