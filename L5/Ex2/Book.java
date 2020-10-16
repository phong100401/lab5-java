package L5.Ex2;

public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qty;

    public Book(String name, Author[] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor(int index) {
        return (index<0 || index>=author.length) ? null : author[index];
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return String.format("Book[name=%s, {\nAuthor(0)[name=%s,email=%s,gender=%c]," +
                        "\nAuthor(1)[name=%s,email=%s,gender=%c] },\nprice=%.2f,qty=%d]",
                this.name, author[0].getName(), author[0].getEmail(),author[0].getGender(),
                author[1].getName(), author[1].getEmail(),author[1].getGender(), price, qty);
    }
}
