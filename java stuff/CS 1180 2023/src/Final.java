import java.util.ArrayList;
import java.util.Scanner;
public class Final {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        Book book1 = new Book("The Three-Body Problem", "Cixin Liu",0765377063);
        Book book2 = new Book("Unlikely Animals", "Annie Hartnett", 59316024);
        Book book3 = new Book("Learn Java the Easy Way","Bryson Payne",1593278055);
        library.add(book1);
        library.add(book2);
        library.add(book3);
        for(int i = 0; i < library.size(); i++){
            System.out.println(library.get(i));
        }
        
        System.out.println("What would you like to do?" + "\n 4.Check out a book." + "\n 5.check in a book" + "\n 6.leave");
        int option = sc.nextInt();
        
        if(option == 4){
        System.out.println("Book Title to check out? ");
        String book = sc.next();
        for(int i = 0; i < library.size(); i++){
            if(book.equals(library.get(i).getTitle())){
                library.get(i).checkout();
            }
        }
    }else if(option == 5){
        System.out.println("book title to check in?");
        String returnBook = sc.next();
        for(int i = 0; i < library.size(); i++){
            if(returnBook.equals(library.get(i).getTitle())){
                library.get(i).checkin();
            }
        }
    }
    for(int i = 0; i < library.size(); i++){
        System.out.println(library.get(i));
    }
    }
}
