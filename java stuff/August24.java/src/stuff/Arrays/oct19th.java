package Arrays;

public class oct19th {
    public static void printArray(int[] values){
        for(int i = 0; i < values.length; i++){
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
    public static int[] createLows(int[] values, int reduceBy){
        int[] retArray = new int[values.length];
        for (int i = 0; i < values.length; i++){
            retArray[i] = values[i] - reduceBy;
            
        }
        System.out.println();
        return retArray;
    }
    public static void main(String[]args){
        int[]temps = {23, 45, 67, 90, 90 ,12 ,67};
        String[]days = {"Mon", "tues", "Wed", "Thurs", "Fri", "Sat", "Sun"};
        printArray(temps);
        for(int i = 0; i < temps.length; i++){
            System.out.println(days[i] + " high is " + temps[i]);
        }
            int[] lows = new int [temps.length];
            lows = createLows(temps, 20);
            printArray(lows);
            int lowest = lows[0];
            
            for(int i = 0; i < lows.length; i++){
                lowest = lows[i];
                for(int j = i; j < lows.length; j++ ){
                if(lows[i] < lowest){
                    int temp = lows[i];
                    lows[i] = lows[j];
                    lows[j] = temp;
                    //System.out.println(lows[j]);
                }
                }
            }
    }
}
