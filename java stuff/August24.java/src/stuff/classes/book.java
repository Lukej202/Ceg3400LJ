package stuff.classes;

public class book {
    private String name;
    private int published;
    private String content;

    public book(){
        this.name = " ";
        this.published = 1956;
        this.content = "..." ;
    }
    public book(String name, int published){
        this.name = name;
        this.published = published;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getPublished(){
        return published;
    }
    public void setPublished(int published){
        
    }
    public String toString(){
        return this.name + " " + this.published + " " + this.content;
    }
    public boolean equals(){
        return false;
    }
    public int hashCode(){
        
        return 0;
    }
}
