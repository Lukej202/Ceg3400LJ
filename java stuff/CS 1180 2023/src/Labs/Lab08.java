package Labs;
import java.util.Scanner;
public class Lab08 {
    /**
* Averages the numbers in an array
* @param int [] nums
* @param an array of integers
* @return the calculated average of the numbers in the array
*/
public static int findAverage(int[] nums){
    int sum = 0;
    for(int i = 0; i <= 0; i++){
        sum += nums[i];
    }
    int average = sum/nums.length;
    return average;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days of data? ");
        int days = sc.nextInt();
        int[] morningTemps = new int[days];
        int[] noonTemps = new int[days];
        int[] nightTemps = new int [days];
        for(int i = 0; i <= days-1; i++){
            System.out.println("Day " + (i+1));
            System.out.println("Enter a morning temp: ");
            morningTemps[i] = sc.nextInt();
            System.out.println("Enter a noon temp: ");
            noonTemps[i] = sc.nextInt();
            System.out.println("Enter a night temp: ");
            nightTemps[i] = sc.nextInt();
        }
        System.out.println("---Average Report---");

        for(int i = 0; i <= 0; i++){
            //I did this because I tried making a 4th array and add the 0 - days index to a new array and couldnt get it to work.
            int temps = (morningTemps[i] + noonTemps[i] + nightTemps[i])/3;
            System.out.println("Day " + (i+1) + " average is " + temps);
        }
        System.out.println("Morning average for all days: " + findAverage(morningTemps));
        System.out.println("Average noon temps for all days: " + findAverage(noonTemps));
        System.out.println("Average night temps for all days: " + findAverage(nightTemps));
    }
}
