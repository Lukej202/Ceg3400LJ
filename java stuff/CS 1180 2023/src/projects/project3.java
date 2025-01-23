//Luke Jennings
package projects;
import java.io.FileInputStream;
import java.util.*;
public class project3 {
    /**
     * this method takes in a string and checks to make sure its greater than 4 characters and checks how many points the string is worth
     * @param s String 
     * @return returns the number of points the word is worth
     */
    public static int checkPoints(String s){
        if(s.length() == 4){
            return 1;
        }else if(s.length() == 5){
            return 2;
        }else if(s.length() == 6){
            return 3;
        }else if(s.length() < 4) {
            return 0;
        }else{
            return 4;
        }
        
    }
    /**
     * this method prints an Array list of character
     * @param c ArrayList<Character>
     */
    public static void printCharArray(ArrayList<Character> c){
        for(int i = 0; i <= c.size() -1; i++){
            System.out.print(c.get(i) + " ");
        }
    }
    /**
     * this method checks to see if the word has 7 unique characters
     * @param s String
     * @return returns false if there is a character found that equals another character in the string returns true if the string has 7 unique letter
     */
    public static boolean checkWord(String s){
        char[] charArray = s.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            for(int j = i +1; j < charArray.length; j++){
                if(charArray[i] == charArray[j]){
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * This method takes the game word and the users guess and checks if the letters of the guessed word are all part of the game word
     * @param s String
     * @param s2 String
     * @return returns false if a character found in the users guess is not equal to a character in the game word and returns true if all characters in the guessed word are equal to characters in the game word
     */
    public static boolean checkChars(String s ,String s2){
        char[] c1 = s.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
    public static void main(String[]args)throws Exception{
        FileInputStream infs = new FileInputStream("words.txt");
        Scanner fileSc = new Scanner(infs);
        Scanner sc = new Scanner(System.in);
        int score = 0;
        //this array list stores all of the words from words.txt
        ArrayList<String> words = new ArrayList<>();
        //this loop adds each word from words.txt to the words ArrayList
        while(fileSc.hasNextLine()){
        
            words.add(fileSc.next());
            
        }
        fileSc.close();
        infs.close();
        //shuffles words so there is a different word everytime
        Collections.shuffle(words);
        String word = "";
        //checks that the word in the ArrayList words and has 7 unique letters it adds that to word
        for(int i = 0; i < words.size(); i++){
            if(words.get(i).length() == 7){
                word = words.get(i);
                if(checkWord(word) == true){
                break;
                }
            }
            
    }
        System.out.println(word);
        //this array list holds the characters of the game word to make it easier to scramble it
        ArrayList<Character> scrambledWord = new ArrayList<>();
        for(char i: word.toCharArray()){
            scrambledWord.add(i);
        }
        //scrambles the arraylist 
        Collections.shuffle(scrambledWord); 
        //calls the printCharArray method to print out the scrambled word
        printCharArray(scrambledWord);
        System.out.println();
        // this array list holds the words the user got correct
        ArrayList<String> correctWords = new ArrayList<>();
            while(true){
                String guess = sc.nextLine();
            //if the user types mix it reshuffles the word
            if(guess.equals("mix")){
                Collections.shuffle(scrambledWord);
                printCharArray(scrambledWord);
                System.out.println();
                //if the user tyes ls it lists the words the user got correct
            }else if(guess.equals("ls")){
                for(int i = 0; i <= correctWords.size()-1; i++){
                    System.out.println(correctWords.get(i));
                }
                //this else if quits if the user enters bye
            }else if(guess.equals("bye")){
                System.out.println("final score: " + score);
                break;
                //checks if the word entered is a part of words.txt by checking the array list that the words were inputed into.
            }else{
                for(int i = 0; i < words.size(); i++){
                    if(guess.equals(words.get(i))){
                        if(checkChars(word, guess) == true){
                        correctWords.add(guess);
                        score += checkPoints(guess);
                        break;
                        }
                    }
                }
            }
            System.out.println("Score: " + score);
        }
    }
}