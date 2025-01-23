//Luke Jennings
import java.util.*;
import java.io.*;

public class Lab7 {

public static File writeText(String filename, String s) throws Exception {
//this method creates the users file
File newFile = new File(filename);
FileWriter myWriter = new FileWriter(filename);
//creates the file
myWriter.write(s);
myWriter.close();
return newFile;
}
public static int countWords(File f) throws Exception {
    //This method counts how many words are in the users file
    String line;
    int count = 0;
    FileReader file = new FileReader(f);
    BufferedReader br = new BufferedReader(file);
    //this loop actually counts the words
    while((line = br.readLine()) != null) {
            String words[] = line.split(" ");
            count = count + words.length;
        }
    br.close();    
    return count;
}


public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);
    //asks the user for the name of the file
    System.out.print("What is the name of the file? ");
    String name = sc.nextLine();
    //asks the user what they would like the file to say
    System.out.print("What would you like to print to the file? ");
    String fileText = sc.nextLine();
    File filename = writeText(fileText, name);
    sc.close();
    System.out.print(filename + " contains " + countWords(filename) + " words.");

    }
}
// https://www.javatpoint.com/program-to-find-the-number-of-words-in-the-given-text-file