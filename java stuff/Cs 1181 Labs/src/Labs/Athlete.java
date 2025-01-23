package Labs;

public class Athlete<E extends Comparable<E>>implements Comparable<Athlete<E>>{
    private String name;
    private String sport;
    private E ranking;

    /**
     * Constructor for the Athlete class
     * @param name
     * @param sport
     * @param ranking
     */
    public Athlete(String name, String sport, E ranking){
        this.name = name;
        this.sport = sport;
        this.ranking = ranking;
    }
    /**
     * Setter for the name
     * @param name 
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * Getter for the name of the athlete
     * @return the athletes name 
     */
    public String getName(){
        return name;
    }
    /**
     * Setter for the sport
     * @param sport
     */
    public void setSport(String sport){
        this.sport = sport;
    }
    /**
     * Getter for the sport
     * @return returns sport
     */
    public String getSport(){
        return sport;
    }
    /**
     * Setter for the Ranking
     * @param ranking
     */
    public void setRanking(E ranking){
        this.ranking = ranking;
    }
    /**
     * Getter for the ranking
     * @return ranking
     */
    public E getRanking(){
        return ranking;
    }

    /**
     * compareTo method to compare athletes by sport and then Name
     * @param another Athlete to compare with 
     */
    public int compareTo(Athlete<E> other){
        if(this.sport.compareToIgnoreCase(other.sport) != 0){
            return this.sport.compareToIgnoreCase(other.sport);
        }else return(this.name.compareToIgnoreCase(other.name));
    }
    /**
     * toString method for Athlete objects
     * @return prints out the name of the Athlete then the sport then the Ranking
     */
    public String toString(){
        return name + " (" + sport + " - " + ranking + ")";
    }
}
