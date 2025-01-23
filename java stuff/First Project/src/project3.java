
//Luke Jennings
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class project3 {
    public static String word() throws Exception{
        ArrayList<String> words = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader("words.txt"));
        String line = br.readLine();
        while(line != null){
            words.add(line);
            line = br.readLine();
        }
        br.close();
        Random rand = new Random();
        String[] array = words.toArray(new String[0]);
        int arrayCount = array.length;
        int ln = (rand.nextInt(arrayCount));
        String str = array[ln];
        return str;    
    }
    public static String scramble()throws Exception {
        
        return null;
    }
    public static void main(String[]args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(word());
    }
}