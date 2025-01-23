package stuff.loops;
import java.util.Scanner;
public class midTermReveiew1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What day of the week is it ");
        int day = sc.nextInt();
        System.out.println("are you on vacation");
        String vacation =  sc.next();
        vacation = vacation.toUpperCase();
        String timer = "";
        int w = 0;
        switch(day){
            case 0:
                w = 0;
                break;
            case 6:
                w = 0;

                break;
            }
            switch(day){
            case 1:
                w = 1;
                break;
            case 2:
                w = 1;
                break;
            case 3:
                w = 1;
                break;
            case 4:
                w = 1;
                break;
            case 5:
                w = 1;
                
                break;  
        }
        if(vacation.equals("Yes") && w == 0){
            timer = "off";
        }else if(vacation.equals("No") && w == 0){
            timer = "10:00";
        }else if(vacation.equals("Yes") && w == 1){
            timer = "10:00";
        }else{
            timer = "7:00";
        }
        System.out.println(timer);
    }
    
}
