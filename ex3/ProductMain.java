package CoadingMatter2.ex3;

public class ProductMain {
    public static void main(String[] args) {
        Order order = new Order();

        Product book = new Book("자바의 정석", 30000, "남궁성");
        Product album = new Album("정규 1집", 20000, "아이유");
        Product movie = new Movie("인셉션", 15000, "놀란", "디카프리오");

        order.addItem(book);
        order.addItem(album);
        order.addItem(movie);

        order.printOrder();
    }
}