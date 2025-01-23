package Labs;
import java.util.Comparator;
public class ComparatorClass implements Comparator<Athlete<Integer>>{
    /**
     * compare method for the comparatorClass
     * @Param A1 Athlete 1 to compare
     * @param A2 Athletete to compare Athlete 1 with
     * @return returns an int depending on how the two athletes compare which is by sport and then ranking
     */
    public int compare(Athlete<Integer> A1, Athlete<Integer> A2){
        if(A1.getSport().compareToIgnoreCase(A2.getSport()) != 0){
            return A1.getSport().compareToIgnoreCase(A2.getSport());
        }else return A1.getRanking().compareTo(A2.getRanking());
    }


}
