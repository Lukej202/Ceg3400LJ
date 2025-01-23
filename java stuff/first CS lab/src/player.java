mport java.util.Random;
public class player {
    private String name;
    private int health;
    private int maxDamge;

    public player(String name,int health,int maxDamage){
        this.name = name;
        this.health = health;
        this.maxDamge = maxDamage;
    }
    public int hit(player other){
        Random rand = new Random();
        int randNum = rand.nextInt(maxDamge);
        health = health - randNum;
        return health;
    }
    public String toString(){
        String output = name + " " + "(" + health + ")" ;
        return output;
    }
}
