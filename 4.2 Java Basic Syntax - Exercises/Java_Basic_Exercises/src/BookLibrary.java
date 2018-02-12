import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookLibrary {

    static class Book{
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public Date getPublishingDate() {
            return publishingDate;
        }

        public void setPublishingDate(Date publishingDate) {
            this.publishingDate = publishingDate;
        }

        public String getIsbn() {
            return Isbn;
        }

        public void setIsbn(String isbn) {
            Isbn = isbn;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        private String title;
        private String author;
        private String publisher;
        private Date publishingDate;
        private String Isbn;
        private double price;

    }

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<Book>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] bookData = scanner.nextLine().split("\\s+");
            String bookTitle = bookData[0];
            String bookAuthor = bookData[1];
            String bookPublisher = bookData[2];
            String dateAsString = bookData[3];
            SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
            Date bookDate = df.parse(dateAsString);
            String bookIsbn = bookData[4];
            Double bookPrice = Double.parseDouble(bookData[5]);
            Book book = new Book();
            book.setTitle(bookTitle);
            book.setAuthor(bookAuthor);
            book.setPublisher(bookPublisher);
            book.setPublishingDate(bookDate);
            book.setIsbn(bookIsbn);
            book.setPrice(bookPrice);
            boolean noBook = true;
            for(Book thisBook:library){
                if(thisBook.author.equals(bookAuthor)){
                    thisBook.price += bookPrice;
                    noBook = false;
                    break;
                }
            }
            if(noBook){
                library.add(book);
            }
        }

        library.sort((x1, x2) -> {
             if (x2.price - (x1.price) == 0) {
                 return (x1.author.compareTo(x2.author));
             }
            return Double.compare(x2.price, x1.price);
        });
        for(Book book:library){
            System.out.printf("%s -> %.2f\n", book.author, book.price);
        }
    }
}
