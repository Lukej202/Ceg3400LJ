package Threads;

public class Manager {
    private static int JOB_COUNT = 1000;
    public static int work[] = new int[JOB_COUNT];
    private volatile static int nextJob = 0;

    public synchronized int getNextJob(){
        if(nextJob >= JOB_COUNT){
            return -1;
        }
        int returnValue = nextJob;
        nextJob++;
        return returnValue;
    }

    public void doWork(int position){
        work[position]++;

    }
}
