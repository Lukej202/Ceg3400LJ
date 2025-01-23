//Luke Jenning
import java.util.Scanner;
public class Lab5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value for n (must be greater than 3 and an odd number)");
        int n = sc.nextInt();
        //checks if the users number is an even number or if its less than or equal to 3
        if(n % 2 == 0 || n <= 3){
            System.out.println("ERROR: n must be an odd number greater than 3");
        }
        //if the conditions are met prints the star
        else{
            for(int i = 0; i <= n ; i++){
                for(int j = 0; j <= n - 1 ; j++ ){
                    if(i == j || i + j == n - 1 ){
                    System.out.print("*"); 
                    }else{
                        System.out.print(" ");
                    }
                }
                    System.out.println();
            }    
        }
    }
}
