package matter.ex1;

public class Book extends Product{
    private String author;

    public Book(String name, int price , String author) {
        super(name, price);
        this.author = author;
    }
    @Override
    public void getInfo(){
        System.out.println("제목 : " + getName() + " 가격 : " + getPrice() + " 저자 : " + author);
    }

    public String getAuthor() {
        return author;
    }
}
