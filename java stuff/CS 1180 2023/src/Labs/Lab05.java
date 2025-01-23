//Luke Jennings
package Labs;
import java.util.Scanner;
public class Lab05 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value for n");  
        int n = sc.nextInt();
        if(n > 3 && n % 2 != 0 ){
            for(int i = 0; i <= n; i++){
                for(int j = 0; j <= n - 1; j++){
                    if(i == j || i + j == n - 1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }else{
            System.out.println("ERROR: n must be an odd number greater than 3");
        } 
    }
}
