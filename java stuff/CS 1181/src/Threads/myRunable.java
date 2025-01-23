package Threads;

public class myRunable {
    public static void main(String[] args) {
        new Thread(() -> {
            for(int i =0; i < 27; i++){
                System.out.println(i);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            for(char c = 'a'; c <= 'z'; c++){
                System.out.println(c);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
