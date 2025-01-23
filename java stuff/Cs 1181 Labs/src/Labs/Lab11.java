package Labs;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) throws InterruptedException {
        //holds the start time of the program
        long startTime = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of threads");
        //the number of threads
        int numThreads = sc.nextInt();
        System.out.println("enter number the max number");
         //how many numbers to count to
        int n = sc.nextInt();
        //the number of primes
        int result = 0;

        //the first number each thread is going to start at
        Integer start = 1;
        //how much the first number of the next thread is going to increase
        int change = (n/numThreads);
        //the end number for each thread
        int end = change;
        //holds each thread to acess them later
        ArrayList<PrimeThread> threadList = new ArrayList<>();
        //increment by the change to get new start and end
        for(int i = start; i <= n; i += change){
            threadList.add(new PrimeThread(i, end));
            end += change;
        }

        //goes through the arraylist and starts each thread
        for(Thread t: threadList){
            t.start();
        }
        //goes through the arraylist and joins all the threads so main waits untill all of them are done
        for(Thread t: threadList){
            t.join();
        }
        //goes through the arraylist and adds the number of primes each thread found to make the total number of primes
        for(PrimeThread t: threadList){
            result += t.getResult();
        }
        //holds the endtime of the program
        long endTime = System.currentTimeMillis();
        //prints the result
        System.out.println("number of primes " + result);
        //prints the total time took for the program ran
        System.out.println("The program took " + (endTime - startTime) + " miliseconds");
    }
}
