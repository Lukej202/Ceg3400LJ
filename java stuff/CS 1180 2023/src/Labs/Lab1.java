package Labs;
import java.util.Scanner;
import java.lang.Math;
public class Lab1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("what is the radis of your sphere?"); 
        int radius = sc.nextInt();
        double area = (((4)*(Math.PI)/3)*Math.pow(radius, 3));
        
        System.out.print("the area of the spherem is ");
        System.out.printf("%.2f", + area);
    }
}
