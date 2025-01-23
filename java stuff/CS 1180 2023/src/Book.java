

public class Book {
        private String title;
        private String author;
        private int isbn;
        private boolean avalible = true;
        private int condition = 10;
    
        public Book(String title,String author,int isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }
    
        public String getTitle() {
            // return book title
            return title;
        }
    
        public int getCondition() {
            return condition;
        }
    
        public void setCondition(int num) {
            this.condition = num;
        }
    
        public void checkout() {
            if(avalible == true){
                this.avalible = false;
            }else{
                System.out.println("Title not avalible");
            }
        }
    
        public void checkin() {
            avalible = true;
            condition -= 1;
        }
    
        @Override
        public String toString() {
            /*
             * Converts book to String in format of
             * Title: The Three-Body Problem
             *  Author: Cixin Liu
             *  ISBN: 0765377063
             *  Available for checkout: true
             *  Condition: 10
             */
            return "Title: " + title + "\n Author: " + author + "\n ISBN: " + isbn + "\n Avalible for checkout: " + avalible + "\n condition: " + condition;
        }
    
    }

