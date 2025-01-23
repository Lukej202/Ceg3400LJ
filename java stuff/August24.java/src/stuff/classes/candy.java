package stuff.classes;

public class candy {
    private String name;
    private boolean isTasty;
    private int quanity;
    public candy(){
        name = "noName";
        isTasty = false;
        quanity = 0;
    }
    public void setQuanity(int q){
        quanity = q;
    }
    public int getQuanity(){
        return quanity;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setIsTasty(boolean it){
        isTasty = it;
    }
    public boolean getIsTasty(){
        return isTasty;
    }
    
    public void store(String N){
        name = N;
    }
    public void print(){
        System.out.println(name + ": " + quanity + " " + isTasty);
    }
}
