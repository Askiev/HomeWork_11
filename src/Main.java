public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Albert", "Camus");
        Author author2 = new Author("Marcus", "Zusak");

        Book book = new Book("L'etranger", author1, 1942);
        Book book2 = new Book("The Messenger", author2, 2002);

        book.setYearPublishing(1942);
        System.out.println(book.toString());
        System.out.println(book2.toString());
        System.out.println(book.hashCode());
        System.out.println(book2.hashCode());

        System.out.println(author1.equals(author2));
    }
}
