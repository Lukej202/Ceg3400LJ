package Class_code;
/**
 * 
 * @author Luke Jennings
 * @since 1/12/2024
 * @reference
 */
public class song {
    private String title;
/**
 * 
 * @param newTitle
 */
    public song(String newTitle){
        title = newTitle;
    }
/**
 * 
 * @param title
 */
    public void setTitle(String title){
        this.title = title;
    }
/**
 * 
 * @return
 */
    public String getTitle(){
        return title;
    }
}
