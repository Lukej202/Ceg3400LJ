package stuff.classes;

import java.util.HashMap;

public class hello {
    public static void main(String[]args){
    book bk = new book();
    book myBook = new book("book Title", 1998);
    HashMap<book ,String> checkout = new HashMap<>();
    checkout.put(new book("Cheese", 1994), "Chase");
    checkout.put(myBook, "Janet");
    checkout.put(new book("1984", 1940), "George");

    String str1 = "George";
    String str2 = "George";
    String str3 = "George";

    System.out.println(str1.hashCode());
    System.out.println(str2.hashCode());
    System.out.println(str3.hashCode());
}
}