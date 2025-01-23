package Labs;
import java.util.Scanner;
import java.io.*;
public class Lab07 {
    /**
* Creates a file, writes provided string to file, returns File object
* @param filename String that is the name of the file
* @param s The String to be printed to the file 
* @throws throws anyting that has an exception
* @return returns null
*/
public static File writeText(String filename, String s)throws Exception{
    FileOutputStream fileOutStream = new FileOutputStream(filename);
    PrintWriter outFs = new PrintWriter(fileOutStream);
    outFs.println(s);
    outFs.close();
    fileOutStream.close();
    return null;
}
/**
* Counts number of words in file
* A word is any text separated by a whitespace
* @param f the File that is going to be read and the words counted in that FIle
* @throws throws any exception
* @return returns wordCount worCount holds the number of Strings in the file
*/
public static int countWords(File f) throws Exception{
    String data = "";
    int wordCount = 0;
    Scanner fileSc = new Scanner(f);
    while(fileSc.hasNextLine()){
        data += fileSc.nextLine();
    }
    wordCount = data.split(" ").length;
    return wordCount;
    }
    
    public static void main(String[]args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the name of the file? ");
        String file = sc.nextLine();
        System.out.println("what would you like to print to the file? ");
        String text = sc.nextLine();
        writeText(file, text);
        int wordCOunt = countWords(new File(file));
        System.out.println(file + " contains " + wordCOunt + " words" );
    }
}
