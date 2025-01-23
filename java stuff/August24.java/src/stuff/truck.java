package stuff;
public class truck {
    private String name;
    private int currentFuel;
    private int maxFuel;

    public truck(String name, int currentFuel,int maxFuel){
        this.name = name;
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
    }

    public String getName(){
        return name;
    }

    public int getCurrentFuel(){
        return currentFuel;
    }

    public void setCurrentFuel(){
        currentFuel = maxFuel;
    }

    public int getMaxFuel(){
        return maxFuel;
    }
    public void spendFuel(int fuel){
        if(currentFuel <= fuel){
            currentFuel = currentFuel - fuel;
        }
    }

    public String toString(){
        return null;
    }
}
