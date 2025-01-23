import java.util.ArrayList;

public class ThreeLetterPassWord {
    static int count = 0;
    public static void main(String[] args) {
        //holds the start time of the program
        Long startTime = System.currentTimeMillis();
        //holds the alphabet
        String s = "abcdefghijklmnopqrstuvwxyz";
        //makes a new arrayList the calls the passwordGen method to fill it with all possible three letter passwords
        ArrayList<String> passWords = new ArrayList<>(passwrdGen(s));
        //creates a single thread to find the password
        Thread t = new PasswordThread(passWords, "protected3.zip", 1);
        //starts the thread
        t.start();
        try {
            //pauses main until the thread is done running
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //holds the endtime of the program
        Long endTime = System.currentTimeMillis();
        //prints the total time it took for the program to end
        System.out.println("The Prgram took " + (endTime-startTime) + " miliseconds");
    }
    /**
     * Generatea all possible 3 letter combanations in the alphabet using nested for loops
     * @param theString the alphabet
     * @return returns an arraylist with all the possible passwords
     */
    public static ArrayList<String> passwrdGen(String theString){
        ArrayList<String> pssWrds = new ArrayList<>();
        for(int i = 0; i < theString.length(); i++){
            for(int j = 0; j < theString.length(); j++){
                for(int k = 0; k < theString.length(); k++){
                    pssWrds.add(theString.substring(i, i+1) + theString.substring(j, j+1) + theString.substring(k, k+1));
                }
            }
        }
        return pssWrds;
    }
    
}


