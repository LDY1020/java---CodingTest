package CoadingMatter2.ex3;

public class Book extends Product{

    private String author;

    public Book(String name, int price , String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public void printInfo(){
        System.out.println("도서 - 제목 : " +  getName() + " 저자 : " + author + " 가격 : " + getPrice());
    }
}
