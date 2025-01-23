package Threads;

import java.util.ArrayList;

public class Worker extends Thread{
    Manager myManager;
    
    public Worker(Manager myManager){
        this.myManager = myManager;
    }
    @Override
    public void run(){
        int nextJob;
        nextJob = myManager.getNextJob();

        while(nextJob != -1){
            myManager.doWork(nextJob);

            try{
                Thread.sleep(50);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            nextJob = myManager.getNextJob();
        }
    }

    public static void main(String[] args) {

        Manager theManager = new Manager();

        ArrayList<Worker> workers = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            Worker myWorker = new Worker(theManager);
            workers.add(myWorker);
            myWorker.start();
        }
        for(Worker myWorker: workers){
            try{
                myWorker.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        for(int i =0; i< 1000; i++){
            System.out.println(theManager.work[i]);
        }
    }
}
