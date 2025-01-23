package stuff;
public class September2nd {
    public static void main(String[]args){
        char myChar = 'g';
        char otherChar = 'G';
        String myString = "hello";
        String otherString = "Hello";
        String otherString2 = "HeLLo";
        String newString = myString.toUpperCase();
        String rick = ("Never gonna give you up never gonna let you down");
        char firstLetter = myString.charAt(0);
        firstLetter = Character.toUpperCase(firstLetter);
        System.out.println(newString);
        System.out.println(myString.charAt(4));
        System.out.println(myString.indexOf(4));
        System.out.println(rick.indexOf("n"));
        int indexOfl = rick.indexOf("l");
        System.out.println(rick.substring(indexOfl, 37  ));
        
    }
}