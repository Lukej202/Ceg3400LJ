package Labs;

public class lab09 {
    /**
    * Prints the row and column of the '+' sign given a 2D character array
    * @param map char[][] 2d array of chars
    */
    public static void getCoordinates(char[][] map){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                if(map[i][j] == '+'){
                    System.out.println("Start digging in row " + i + " collumn " + j);
                }
            }
        }
    }
    public static void main(String[]args){
        char[][] map = { 
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '+', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}
        };
        getCoordinates(map);
    }
}
