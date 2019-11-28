package hw_5.task_1;

public class Book {

    protected String name;
    protected String author;
    protected int date;
    public static String text = "Hello world!";

    public Book(String name, String author, int date) {
        this.name = name;
        this.author = author;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(int date) {
        this.date = date;
    }

    void showBook (){
        System.out.println(this.getName());
        System.out.println(this.getAuthor());
        System.out.println( this.getDate());
    }

}
