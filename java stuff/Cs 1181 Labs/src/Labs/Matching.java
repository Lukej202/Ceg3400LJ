package Labs;

public class Matching {
    /**
     * Checks for pairs of Nested Parenthesis
     * @param n The string to check
     * @return returns true if the string contains only pairs of nested parens and returns false if not
     */
    public static boolean nestParen(String n){
        //if the string is an odd length we already no there is one or more incomplete pairs
        if(n.length()%2 != 0){
            return false;
        }
        //base case
        if(n.length() == 0){
            return true;
        }
        
        //splits the string into its first and last characters
        String s1 = n.substring(0, 1);
        String s2 = n.substring(n.length()-1);
        //holds the rest of the string
        String s3 = n.substring(1, n.length()-1);
        //recursive call
        boolean b = nestParen(s3);

        //if that recursive call is ever false it prints it and ends the program
        if(b == false){
            System.out.println(b);
            System.exit(0);
        }
        //checks to see if the first and last characters are both parens
        if(s1.equals("(") && s2.equals(")")){
            return true;
        }else return false;
    }
}
