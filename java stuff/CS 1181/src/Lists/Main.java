package Lists;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList<String> myList = new SingleLinkedList<>();
        myList.addFirst("One");
        myList.addFirst("two");
        myList.addFirst("Three");
        myList.addLast("Four");
        myList.add(3, "two again");
        
        for(String s: myList){
            System.out.println(s + " ");
        }
    }
}