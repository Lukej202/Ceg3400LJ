//Luke Jennings
public class Lab9 {
    public static int getMax(char[][] input){
        int max = 0;
        int maxRow = 0;
        int maxColumm = 0;
        int tempColumm = 0;
        int tempRow = 0;
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input[0].length; j++){
            if(input[i][j] == '+'){
                tempRow++;
            }
            if(tempRow > maxRow){
                maxRow = tempRow;
            }
            
        }
        tempRow = 0;
    }
            for(int i = 0; i < input[0].length; i++){
                for(int j = 0; j < input.length; j++){
                if(input[i][j] == '+'){
                    tempColumm++;
                }
                if(tempColumm > maxColumm){
                    maxColumm = tempColumm;
                }
                
            }
            tempColumm = 0;
        }
            
            if(maxRow > maxColumm){
                max = maxRow;
            }else{
                max = maxColumm;
            }
        return max;
    }
    public static void main(String[]args){
        char[][] input = {
            {'+', '-', '-', '-', '+', '-', '-', '-', '-', '-'},
            {'-', '-', '+', '-', '-', '-', '+', '+', '-', '+'},
            {'+', '+', '-', '-', '-', '-', '-', '+', '+', '-'},
            {'+', '-', '-', '+', '-', '+', '-', '+', '-', '+'},
            {'-', '-', '-', '+', '-', '-', '+', '-', '-', '+'},
            {'+', '+', '+', '-', '+', '-', '-', '+', '+', '-'},
            {'-', '-', '+', '+', '-', '-', '+', '+', '-', '+'},
            {'+', '+', '-', '-', '+', '+', '-', '-', '-', '-'},
            {'-', '+', '+', '-', '-', '+', '-', '+', '-', '+'},
            {'-', '+', '+', '+', '-', '-', '-', '-', '-', '-'}
            };
            System.out.println(getMax(input));
    }
}
