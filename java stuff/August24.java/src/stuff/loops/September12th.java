package stuff.loops;
import java.util.Scanner;
public class September12th {
    public static void main(String[]args){
       // int i = 0;
        /*for (i = 0; i <= 10; i = i + 1){
            System.out.println(i);
        }*/
        /*for (i = 0; i <= 100; i = i + 5 ){
            System.out.println(i);
        }*/
        /*for (i = 11; i <= 22; i = i + 1 ){
            System.out.println(i);
        }*/
        /*for (i = 10; i >= 1; --i){
            System.out.println(i);
        }*/
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int biggest = 0;
        while(i <= 0){
            System.out.println("give me a number ");
            int userNum = sc.nextInt();
            if (userNum > biggest){
                System.out.println("the biggest number ive seen so far is " + biggest);
                biggest = userNum;
            }
        }
        System.out.println("the biggest number was " + biggest);
    }  
}
