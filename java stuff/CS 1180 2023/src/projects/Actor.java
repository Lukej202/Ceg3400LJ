package projects;
import java.util.Random;
public class Actor {
    private String name;
    private int health;
    private int maxDamage = 5;
    private int row;
    private int collum;
    /**
     * Constructor to construct an Actor object with a name and health
     * @param name Actors name 
     * @param health Actors health
     */
    public Actor(String name, int health){
        this.name = name;
        this.health = health;
    }
    /**
     * checks if one Actor object is in a adjacent room from another Actor object
     * @param a Actor object
     * @return returns true if they are in an adjacent room returns false if not
     */
    public boolean inAdjacentRoom(Actor a){
        if((a.getRow() == row + 1 && a.getCollum() == collum) || (a.getRow() == row && a.getCollum() == collum+1) || (a.getRow() == row - 1 && a.getCollum() == collum) || (a.getRow() == row && a.getCollum() == collum-1)){
            return true;
        }else{
            return false;
        }
    }
    /**
     * checks if two Actor objects are in the same room
     * @param a Actor object
     * @return returns true if the Actor object are in the same room returns false if not
     */
    public boolean inSameRoom(Actor a){
        if(a.getRow() == row && a.getCollum() == collum){
            return true;
        }else{
            return false;
        }
    }
    /**
     * checks if an Actor objects health is equal to or less than 0
     * @return returns true if health is less than or equal to 0
     */
    public boolean isAlive(){
        if(health <= 0){
            return false;
        }else{
            return true;
        }
    }
    /**
     * decreases the health of another Actor object by a random number the max being the maxDamage
     * @param a Actor object
     */
    public void hit(Actor a){
        Random rand = new Random();
        int damage = rand.nextInt(maxDamage);
        a.setHealth(a.getHealth() - damage);
    }
    /**
     * checks if the Actor is in the final room of the catacomb
     * @param dungeonSize size of the catacomb
     * @return returns true if in the final room of the catacomb and false if not
     */
    public boolean hasEscaped(int dungeonSize){
        if(row == dungeonSize - 1 && collum == dungeonSize -1){
            return true;
        }
        return false;
    }
    /**
     * sets the max damge of the acto
     * @param maxDamage the maxdamge the actor can do
     */
    public void setMaxDamge(int maxDamage){
        this.maxDamage = maxDamage;
    }
    /**
     * sets the name of the actr
     * @param name the name of the actor
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * get the name of the actor
     * @return returns the name of the actor
     */
    public String getName(){
        return name;
    }
    /**
     * sets the health of the actor
     * @param health the health of the actor
     */
    public void setHealth(int health){
        this.health = health;
    }
    /**
     * gets the health of the actor
     * @return returns the health
     */
    public int getHealth(){
        return health;
    }
    /**
     * sets the row of the catacomb the actor is in
     * @param row the eow the the actor is in
     */
    public void setRow(int row){
        this.row = row;
    }
    /**
     * gets the row of the catacomb the actor iis in
     * @return returns the row
     */
    public int getRow(){
        return this.row;
    }
    /**
     * sets the collum of the catacomb the actor is in
     * @param collum the collum the actor is in
     */
    public void setCollum(int collum){
        this.collum = collum;
    }
    /**
     * gets the collum the actor is in
     * @return returns the collum
     */
    public int getCollum(){
        return this.collum;
    }
    /**
     * sets the whole position of the actor
     * @param row the row the actor is in
     * @param collum the collum the actor is in
     */
    public void setPosition(int row, int collum){
        this.row = row;
        this.collum = collum;
    }
    /**
     * gets and prints the cordinates of the actor in the catacomb
     * @return returns the position of the actor
     */
    public String getPosition(){
        return "(" + this.row + ", " + this.collum + ")";
    }
}
