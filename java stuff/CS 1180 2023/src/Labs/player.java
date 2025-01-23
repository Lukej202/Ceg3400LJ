package Labs;
import java.util.Random;
public class player {
    private String name;
    private int health;
    private int maxDamage;
    public player(String name, int health, int maxDamge){
        this.name = name;
        this.health = health;
        this.maxDamage = maxDamge;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth(){
        return health;
    }

    public void setMaxDamage(int maxDamage){
        this.maxDamage = maxDamage;
    }

    public int getMaxDamage(){
        return this.maxDamage;
    }

    public void dealDmage(int damage){
        Random rand = new Random();
        int randNum = rand.nextInt(damage);
        setHealth(health - randNum);
    }
    public String toString(){
        return name + ": " + "HP: " + health;
    }
}
