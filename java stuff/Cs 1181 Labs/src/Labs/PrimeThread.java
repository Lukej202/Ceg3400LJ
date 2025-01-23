package Labs;

public class PrimeThread extends Thread{
    private int firstNum;
    private int secondNum;
    private int result;
    /**
     * constructor for the prime thread
     * @param firstNum the first num for the thread
     * @param secondNum the last num for the thread
     */
    public PrimeThread(int firstNum, int secondNum){
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.result = 0;
    }
    /**
     * getter for the result
     * @return returns the number of primes the thread found
     */
    public int getResult(){
        return result;
    }
    /**
     * Checks if a number is prime or not
     * @param n the number to check
     * @return returns false if the number is not prime and true if it is
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i=5; i*i <= n; i+=6)
        if (n % i == 0 || n % (i+2) == 0)
        return false;
        return true;
    }
    /**
     * This threads run method loops through
     * each number inbetween the start number and end number
     * and checks if its prime if it is result is icremented by 1
     */
    @Override
    public void run(){
        for(int i = firstNum; i < secondNum; i++){
            if(isPrime(i)){
                result++;
            }else continue;
        }
    }
}
