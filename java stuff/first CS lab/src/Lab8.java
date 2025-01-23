//Luke Jennings
import java.util.Scanner;
public class Lab8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] finalArray = new int[5];
        //prompts the user for a list of 10 numbers
        System.out.println("enter 10 numbers, Seperated by spaces: ");
        //populates the 1st Array with the first 5 user values
        for(int i = 0; i < 5; i++){
            array1[i] = sc.nextInt();
        }
        //populates the 2nd Array with the last 5 user values
        for(int i = 0; i < 5; i++){
            array2[i] = sc.nextInt();
        }
        //creates the first array
        System.out.print("Array 1: ");
        for(int i = 0; i < 5; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.print("Array 2: ");
        //Creates the second array
        for(int i = 0; i < 5; i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        System.out.print("Final Array: ");
        //creates the final array
        for(int i = 0; i < 5; i++){
            finalArray[i] = array1[i] + array2[i];
            System.out.print(finalArray[i] + " ");

        }
    }
}
