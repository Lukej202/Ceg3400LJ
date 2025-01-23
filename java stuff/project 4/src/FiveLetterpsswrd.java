//the three and four threaded versions were taking a long time and my laptop felt like it was about to explode
//so im fine with taking the points off for not timing those.
import java.io.IOException;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
public class FiveLetterpsswrd {
    static int threadNumber = 1;
    public static void main(String[] args) throws IOException{
        //holds the satrt time of the program
        Long startTime = System.currentTimeMillis();
        //holds the number of threads to use
        int numThreads = 13;
        //holds the alphabet
        String s = "abcdefghijklmnopqrstuvwxyz";
        //makes a new arrayList the calls the passwordGen method to fill it with all possible three letter passwords
        ArrayList<String> passWords = new ArrayList<>(passwrdGen(s));
        //the amount that the start password for each thread changes 
        int change = passWords.size()/numThreads;
        //the end of each threads own list
        int end = change;
        //an arrayList of password threads to acess them later
        ArrayList<PasswordThread> pt = new ArrayList<>();
        //copies the file numThread times
        copyFiles(numThreads);
        //adds the number of threads to the arraylist and what password in the password list
        //that its going to start on and which password its going to end on
        for(int i = 0; i < passWords.size(); i+=change){
            ArrayList<String> al = new ArrayList<>();
            for(int j = i; j < end; j++){
                al.add(passWords.get(j));
            }
            pt.add(new PasswordThread(al, "protected5" + threadNumber + ".zip", threadNumber));
            threadNumber++;
            end+=change;
        }
        //starts each password thread in the password thread list 
        for(PasswordThread p: pt){
            p.start();
        }
        //pauses main until the password has been found
        for(PasswordThread p: pt){
            try {
                p.join();
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
        //deletes all copied files
        deleteCopys(numThreads);
        //holds the endtime of the program
        Long endTime = System.currentTimeMillis();
        //prints out the time it took for the prgram to finish
        System.out.println("The program took " + (endTime -startTime) + " miliseconds");
    }
    /**
     * copys the file based on how many threads there are so each thread gets its own file
     * @param copys how many copies of the file to make
     * @throws IOException
     */
    public static void copyFiles(int copys) throws IOException{
        for(int i = 1; i <= copys; i++){
            Files.copy(Path.of("protected5.zip"), Path.of("protected5" + i +".zip"));
        }
    }
    /**
     * goes through and deletes all of the copied files
     * @param copys the number of copys that were made
     * @throws IOException
     */
    public static void deleteCopys(int copys) throws IOException{
        for(int i = 1; i <= copys; i++){
            Files.delete(Path.of("protected5" + i + ".zip"));
        }
    }
    /**
     * Generatea all possible 5 letter combanations in the alphabet using nested for loops
     * @param theString the alphabet
     * @return returns an arraylist with all the possible passwords
     */
    public static ArrayList<String> passwrdGen(String theString){
        ArrayList<String> pssWrds = new ArrayList<>();
        for(int i = 0; i < theString.length(); i++){
            for(int j = 0; j < theString.length(); j++){
                for(int k = 0; k < theString.length(); k++){
                    for(int l = 0; l < theString.length(); l++){
                        for(int m = 0; m < theString.length(); m++){
                            pssWrds.add(theString.substring(i, i+1) + theString.substring(j, j+1) + theString.substring(k, k+1)+theString.substring(l, l+1) + theString.substring(m, m+1));
                        }
                    }
                }
            }
        }
        return pssWrds;
    }
}
