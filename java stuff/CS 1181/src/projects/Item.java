package projects;

public class Item {
    private String name;
    private double weight;
    private int value;
    private boolean included;

    /**
     * Construtor for the item class
     * @param name name of item
     * @param weight weight of item
     * @param value value of item
     */
    public Item(String name, double weight, int value){
        this.name = name;
        this.weight = weight;
        this.value = value;
    }
    /**
     * copy construtor for the Item class 
     * @param other the item that the new item is copying
     */
    public Item(Item other){
        name = other.name;
        weight = other.weight;
        value = other.value;
    }
    /**
     * getter for the weight of the item
     * @return returns the weight of the item
     */
    public double getWeight(){
        return weight;
    }
    /**
      * getter for the value of the item
      * @return returns the value of the item
      */
    public int getValue(){
        return value;
    }

    /**
     * getter for Included
     * @return returns whether or not the item is included or not
     */
    public boolean isIncluded(){
        return included;
    }
    /**
     * setter for included
     * @param included sets whether or not the item is included
     */
    public void setIncluded(boolean included){
        this.included = included;
    }

    /**
     * toString method for the item class
     * @return returns the items name weight and value in a string
     */
    public String toString(){
        return this.name + "( " + this.weight + " lbs " + " $" + this.value + " )";
    }
}
