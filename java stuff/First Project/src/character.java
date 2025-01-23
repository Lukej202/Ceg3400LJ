import java.util.ArrayList;
public class character {
    private String name;
    private int credits;
    private ArrayList<item> charactersItems;

    public character(String name, int credits){
        this.name = name;
        this.credits = credits;
    }
    public String getName(){
        return name;
    }
    public int getCredits(){
        return credits;
    }

    public void addItem(String itemName, int itemValue){
        item it = new item(itemName, itemValue);
        charactersItems.add(it);
    }
    public boolean dropItem(String itemName){
        for(int i = 0; i < charactersItems.size(); i++){
            String currentPlayerName = charactersItems.get(i).getItemName();
            if(currentPlayerName.equalsIgnoreCase(itemName)){
                charactersItems.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean sellItemToVender(String itemName){
        for(int i = 0; i < charactersItems.size(); i++){
            String currentPlayerName = charactersItems.get(i).getItemName();
            if(currentPlayerName.equalsIgnoreCase(itemName)){
                charactersItems.remove(i);
                credits += credits + charactersItems.get(i).getItemValue();
                return true;
            }
        }
        return false;
    }
    public boolean sellItemToCharacter(String itemName, character buyer){
        for(int i = 0; i < charactersItems.size(); i++){
            String currentPlayerName = charactersItems.get(i).getItemName();
            if(currentPlayerName.equalsIgnoreCase(itemName)){
                charactersItems.remove(i);
                return true;
            }
        }
        return false;
    }
    public String getItems(){
        for(int i = 0; i < charactersItems.size(); i++){
            return charactersItems.get(i).getItemName() + " (" + charactersItems.get(i).getItemValue() + ")";
        }
        return name;
    }
    public String toString(){
        return name + " (" + credits + ") ";
    }
}
