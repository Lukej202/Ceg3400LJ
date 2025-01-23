import java.util.Scanner;
public class clock {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number for the day of the week");
    int day = sc.nextInt();
    System.out.println("are you on vacation (True or false)");
    Boolean vacation = sc.nextBoolean();
    if(day > 1 && day < 6 && vacation == false){
        System.out.println("Alarm set to 7:00Am");
    }else if(day > 1 && day < 6 && vacation == true){
        System.out.println("Alarm set to 10:00AM");
    }else if(day < 1 && day == 6 && vacation == false){
        System.out.println("Alarm set to 10:00AM");
    }else if(day < 1 && day == 6 && vacation == true){
        System.out.println("Alarm set to off");
    }


    }    
}
