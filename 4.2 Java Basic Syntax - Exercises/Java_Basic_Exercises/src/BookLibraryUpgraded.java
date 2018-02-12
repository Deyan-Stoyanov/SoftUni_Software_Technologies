import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



public class BookLibraryUpgraded {

    static class Book2{
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

        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        ArrayList<Book2> library = new ArrayList<Book2>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] bookData = scanner.nextLine().split("\\s+");
            String bookTitle = bookData[0];
            String bookAuthor = bookData[1];
            String bookPublisher = bookData[2];
            String dateAsString = bookData[3];
            Date bookDate = df.parse(dateAsString);
            String bookIsbn = bookData[4];
            Double bookPrice = Double.parseDouble(bookData[5]);
            Book2 book = new Book2();
            book.setTitle(bookTitle);
            book.setAuthor(bookAuthor);
            book.setPublisher(bookPublisher);
            book.setPublishingDate(bookDate);
            book.setIsbn(bookIsbn);
            book.setPrice(bookPrice);
            library.add(book);
        }

        String controlDateAsAString = scanner.nextLine();
        Date controlDate = df.parse(controlDateAsAString);

        library.sort((x1, x2) -> {
            if (!x1.publishingDate.after(x2.publishingDate) && !x1.publishingDate.before(x2.publishingDate)) {
                return (x1.title.compareTo(x2.title));
            }
            return (x1.publishingDate.compareTo(x2.publishingDate));
        });
        for(Book2 book:library){
            if(book.publishingDate.after(controlDate)) {
                System.out.println(book.title + " -> " + df.format(book.publishingDate));
            }
        }
    }
}
