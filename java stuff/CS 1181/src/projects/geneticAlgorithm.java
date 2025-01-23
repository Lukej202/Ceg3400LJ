package projects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class geneticAlgorithm {
    /**
     * reads in items from a file and adds them into an arraylist
     * @param fileName the name of the file wher the items are
     * @return returns an ArrayList of items 
     * @throws FileNotFoundException this method might throw a FileNotFoundException since files are involved
     */
    public static ArrayList<Item> readData(String fileName)throws FileNotFoundException{
        
        ArrayList<Item> items = new ArrayList<>();
        FileInputStream inFs = new FileInputStream(fileName);
        Scanner fileSc = new Scanner(inFs);
        while(fileSc.hasNextLine()){
            //splits the string that has the name, weight, and value of each item and adds it to an array
            String[] s = fileSc.nextLine().split(", ");
            //turns the string that holds the weight of the item into a double
            double weight = Double.parseDouble(s[1]);
            //turns the string that holds the items value into an int
            int value = Integer.parseInt(s[2]);
            //creates the item with thos values
            Item i = new Item(s[0], weight, value);
            items.add(i);
        }
        return items;
    }
    /**
     * Initializes the population for the algorithm
     * @param items ArrayList of items
     * @param populationSize the size of the initial population i.e. the size of the Chromosome ArrayList
     * @return returns an ArrayList of Chromosomes which is the initial population
     */
    public static ArrayList<Chromosome> initializePopulation(ArrayList<Item> items, int populationSize){
        ArrayList<Chromosome> c = new ArrayList<>();
        for(int i = 0; i < populationSize; i++){
            Chromosome ch = new Chromosome(items);
            c.add(ch);
        }
        return c;
    }
    
    public static void main(String[]args) throws FileNotFoundException{
        Random rand = new Random();
        ArrayList<Item> items = readData("items.txt");
        System.out.println();
        ArrayList<Chromosome> currentPop = initializePopulation(items, 10);
        
        ArrayList<Chromosome> nextGeneration = new ArrayList<>();
        
        
        for(int i = 0; i < 20; i++){
            for(Chromosome c: currentPop){
                nextGeneration.add(c);
            }
            for(int j = 0; j < currentPop.size(); j+=2){
                nextGeneration.add(nextGeneration.get(j).crossOver(nextGeneration.get(j+1)));
            }
            int k = rand.nextInt(10);
            nextGeneration.get(k).mutate();
            Collections.sort(nextGeneration);
            currentPop.clear();
            for(int l = 0; l < 10; l++){
                currentPop.add(nextGeneration.get(l));
            }
            
        }
        
        //prints the very best Chromosome
        System.out.println(nextGeneration.get(0));
    }
}
