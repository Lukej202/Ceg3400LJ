//Luke Jennings
import java.util.*;

import javax.security.auth.callback.TextOutputCallback;

import java.io.*;
public class project3 {
    public static String word() throws Exception{
        ArrayList<String> words = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/lukej/OneDrive/Desktop/project/src/words.txt"));
        String line = br.readLine();
        while(line != null){
            if (line.length() == 7)
            words.add(line);
            line = br.readLine();
        }
        br.close();
        Random rand = new Random();
        String[] array = words.toArray(new String[0]);
        int arrayLength = array.length;
        int ln = (rand.nextInt(arrayLength));
        String str = array[ln];
        return str;   
    }
    public static void scramble() throws Exception {
        String str = word();
        char[] chr = str.toCharArray();
        for(int i = 0; i < chr.length; i++){
            System.out.print(chr[i] + " ");
        }
        System.out.println();
        List<Character> ls = new ArrayList<Character>();
        //for(Character c : chr){
          //  ls.add(c);
        //}
        
    }
    public static void main(String[]args) throws Exception {
        ArrayList<String> words = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/lukej/OneDrive/Desktop/project/src/words.txt"));
        String line = br.readLine();
        while(line != null){
            words.add(line);
            line = br.readLine();
        }
        Scanner sc = new Scanner(System.in);
        
        scramble();
        System.out.println();
        int score = 0;
        System.out.println("Score: " + score); 
        String word;
        do{
            word = sc.next(); 
        if(word.length() <= 4){
            if(word.length() == 4){
                score += score + 1;
                System.out.println("Score : " + score);
            }
            if(word.length() == 5){
            score += score + 6;
                System.out.println("Score : " + score);
                
            }
            if(word.length() == 6){
                score += score + 7;
                System.out.println("Score : " + score);
                
            }
            if(word.length() == 7){
                score += score + 8;
                System.out.println("Score : " + score);
                
            }
        }
        if(word == "ls"){
            if(word.length() <= 4){
                for(int j = 0; j <= word.length(); j++){
                    System.out.println(word);
                }
            }
        }
        if(word == "mix"){
            
        }
            
        
    }while(word != "bye");
    }
}
