//to find the contents of the zip file go to the file titled contents folowed by the number of the thread that found
//the password which will be printed to the console when finished
import java.util.ArrayList;
import net.lingala.zip4j.core.*;
import net.lingala.zip4j.exception.*;

public class PasswordThread extends Thread{
    //holds a boolean all the threads can see that when is true the password has been found and all threads stop
    public static volatile boolean cracked = false;
    private String fileName;
    private ArrayList<String> pw;
    private int threadNum;
    
    /**
     * constructor for the PassWordThread class
     * @param pw The arrayList that holds the password
     * @param FileName
     */
    public PasswordThread(ArrayList<String> pw, String fileName, int threadNum){
        this.pw = pw;
        this.fileName = fileName;
        this.threadNum = threadNum;
    }
    /**
     * checks a password to see if it is correct 
     * @param s the password
     * @return returns false if the password was incorrect returns true if the password was correct
     */
    public boolean checkPW(String s){
        try{
            ZipFile zipFile = new ZipFile(fileName);
			zipFile.setPassword(s);
            zipFile.extractAll("contents " + threadNum);
            return true;
		} catch (ZipException ze) {
            return false;
		} catch (Exception e){
			e.printStackTrace();
		}
        return false;
    }
    /**
     * the run method for the password thread class
     */
    public void run(){
        //loops through to check the password until it has been found
        while(cracked == false){
            //if the password is correct it sets the cracked boolean to true and prints to the console 
            //the password has been found and what it was as well which thread found it
        if(checkPW(pw.get(0)) == true){
            checkPW(pw.get(0));
            System.out.println("Successfully cracked! password is " + pw.get(0) + " found by thread " + this.threadNum);
            cracked =true;
            //if the password is not correct it removes that password from the list and continues
        }else if(checkPW(pw.get(0)) == false){
            pw.remove(0);
        }
    }
}
}

