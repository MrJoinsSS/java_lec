package hw_5.task_1;

public class Task_1 {
    public static void main(String[] args) {

        Book book = new Book("Java", "Schildt", 2015);
        book.showBook();
        Book book1 = book;
        book1.setAuthor("Khorstman");
        Book book2 = book;
        book2.setAuthor("Pens");
        Book.text = "Goodnight";
        System.out.println(book1.getAuthor());
        System.out.println(book2.getAuthor());
        System.out.println(Book.text);
    }

}
