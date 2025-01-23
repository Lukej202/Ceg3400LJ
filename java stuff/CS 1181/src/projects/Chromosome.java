package projects;

import java.util.ArrayList;
import java.util.Random;
public class Chromosome extends ArrayList<Item> implements Comparable<Chromosome>{
    public static Random rng;
    /**
     * empty constructor for the chromosome class
     */
    public Chromosome(){

    }
    /**
     * sort of constructor for the Chromosome class
     * makes a new Chromosome and copys the items from an ArrayList of items and puts them int a Chromosome object
     * after that it randomly generates a number to state whether an item is include or not
     * @param items an ArrayList of items 
     */
    public Chromosome(ArrayList<Item> items){
        Random rand = new Random();
        for(Item i: items){
            add(new Item(i));
        }
        for(int i = 0; i < size(); i++){
            int j = rand.nextInt(2);
            if(j == 1){
                get(i).setIncluded(true);
            }else{
                get(i).setIncluded(false);
            }
        }
    }
    /**
     * creates a child chromosome from 2 parents that randomly gets one of the parents traits 
     * @param other one of the parent Chromosomes
     * @return returns the child chromosome
     */
    public Chromosome crossOver(Chromosome other){
        Random rand = new Random();
        Chromosome child = new Chromosome();
        for(Item i: other){
            child.add(new Item(i));
        }
        for(int i = 0; i < child.size(); i++){
            int randNum = rand.nextInt(2);
            if(randNum == 1){
                child.get(i).setIncluded(other.get(i).isIncluded());;
            }else{
                child.get(i).setIncluded(get(i).isIncluded());
            }
        }
        return child;
    }
    /**
     * mutates a chromosome it goes through each item in the chromosome and has a random chance to flip if it is included or not
     * if the item is inclided then it has a chance to be uninclude and vice-versa
     */
    public void mutate(){
        Random rand = new Random();
        for(int i = 0; i < size(); i++){
            int num = rand.nextInt(2);
            if(num == 1){
                if(get(i).isIncluded() == true){
                    get(i).setIncluded(false);
                }else if(get(i).isIncluded() == false){
                    get(i).setIncluded(true);
                }
            }else{
                continue;
            }
        }
    }
    /**
     * gets the fitness of the chromosome
     * the fitness is the the included items in a chromosome values summed
     * if the total weight of the included items is greater than 10 lbs than the fitness is = 0
     * @return returns the fitness of the chromosome
     */
    public int getFitness(){
        int fitness = 0;
        double totalWeight = 0.0;
        for(int i = 0; i < size(); i++){
            if(get(i).isIncluded()){
            fitness += get(i).getValue();
            totalWeight += get(i).getWeight();
            }
        }
        if(totalWeight <= 10.0){
            return fitness;
        }else{
            return 0;
        }
    }
    /**
     * compareTo method for the Chromosome class
     * if the fitness of one chromosome is greater than the other than it will be higher than the other item when the list is sorted
     */
    public int compareTo(Chromosome other){
        if(getFitness() > other.getFitness()){
            return -1;
        }else if(getFitness() < other.getFitness()){
            return 1;
        }
        return 0;
    }
    /**
     * toString method for the Chromosome class
     * prints each item in a chromosome if it is included uses the toString method from the item class to print the name weight 
     * and value of eaach item as well as the fitness of each chromosome
     */
    public String toString(){
        String s = "";
        for(int i = 0; i < size(); i++){
            if(get(i).isIncluded() == true){
            s += get(i).toString(); 
            }
        }
        return s  + " Chromosomes Fitness: " + getFitness();
    } 
}
