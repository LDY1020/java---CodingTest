package objectmatter;

public class BookMain {

    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석" , 20000);
        Book book2 = new Book("수학의 정석" , 15000);

        System.out.println(book1.toString());
        System.out.println(book2.toString());


    }
}
