package Search;

public class search {
    public static void main(String[] args) {
        int[] values = {1,9,52,17,38,45,12,189,220,67};
        System.out.println(searching(values, 52));
        System.out.println(searching(values, 7));
    }

    public static boolean searching(int[] values, int target){
        for(int i =0; i < values.length; i++){
            if(values[i] == target){
                return true;
            }
        }
        return false;
    }
}
