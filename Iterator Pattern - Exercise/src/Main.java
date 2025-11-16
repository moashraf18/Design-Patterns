public class Main {
    public static void main(String[] args) {

        BookCollection library = new BookCollection();

        library.addBook(new Book("Title1", "Author1"));
        library.addBook(new Book("Title2", "Author2"));
        library.addBook(new Book("Title3", "Author3"));
        library.addBook(new Book("Title4", "Author4"));
        library.addBook(new Book("Title5", "Author5"));

        Iterator iterator = library.createIterator();

        while (iterator.hasNext()) {
            Book b = (Book) iterator.next();
            System.out.println("Book: " + b.getTitle() + ", Author: " + b.getAuthor());
        }
    }
}