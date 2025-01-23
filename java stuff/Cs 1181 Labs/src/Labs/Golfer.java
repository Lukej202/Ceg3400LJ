package Labs;

public class Golfer implements Comparable<Golfer>{
    private String firstName;
    private String lastName;
    private int thru;
    private int score;
    /**
     * Constructor for the golfer class
     * @param firstName the golfers first name 
     * @param lastName the last name of the golfer
     * @param score the golfers score
     * @param thru the golfers thru
     */
    public Golfer(String firstName, String lastName, int score, int thru){
        this.firstName = firstName;
        this.lastName = lastName;
        this.thru = thru;
        this.score = score;
    }
    /**
     * compares the golfers score, thru, then lexicographically by last name, and lexicographically by first name
     * @param other another golfer object 
     * @return returns a positive vaulue if score is greater than the other golfers score returns a negative value if score is less than the other golfers score
     * if the scores are the same it returns a negative value if the thru is greater than the other golfers thru and returns a positive value if the thru is less than the other
     * golfers thru if the score and thru are the same then it compares the last names lexigraphically if all those are the same then it compares the firt names lexiographically 
     */
    public int compareTo(Golfer other){
        if(this.score > other.score){
            return 1;
        }else if(this.score < other.score){
            return -1;
        }else if(this.thru > other.thru){
            return -1;
        }else if(this.thru < other.thru){
            return 1;
        }else if(this.lastName.compareToIgnoreCase(other.lastName) != 0){
            return this.lastName.compareToIgnoreCase(other.lastName);
        }
        else return(this.firstName.compareToIgnoreCase(other.firstName));
        
        

    }
    /**
     * Prints the golfers last name then first name then the score then finalt the thru
     * @return returns the print statement in the description
     */
    public String toString(){
        return lastName + ", " + firstName + "- " + score + " through " + thru + ", "; 
    }
}
