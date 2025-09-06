package objectmatter;

public class Book {

    private String title;
    private int price;

    Book(String title , int price){
        this.price = price;
        this.title = title;
    }

    @Override
    public String toString(){
        return "제목 : " + title + " 가격 : " + price;
    }
}
