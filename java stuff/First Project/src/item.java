public class item {
    private String itemName;
    private int itemValue;
    
    public item(String itemName, int itemValue){
        this.itemName = itemName;
        this.itemValue = itemValue;
    }
    public void setItemName(String n){
        itemName = n;
    }
    public String getItemName(){
        return itemName;
    }
    public void setItemValue(int v){
        itemValue = v;
    }
    public int getItemValue(){
        return itemValue;
    }
    
}
