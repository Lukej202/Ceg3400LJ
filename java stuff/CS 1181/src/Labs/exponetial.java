package Labs;

public class exponetial {
        public static void main(String[] args){
            int x = 2;
            int x2 = x;
            int y = 4;
            int result = 0;
            for(int i = 0; i <= y; i++){
                for(int j = 0; j <= x2; j++){
                    result += x;
                    x2 = x2 + x;
                }
            }
            System.out.println(result);
        }
    }

