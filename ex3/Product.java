package CoadingMatter2.ex3;

public abstract class Product {

    private String name;
    private int price;

    public Product(String name , int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public void printInfo(){
        System.out.println("상품명: " + name + " 가격 : " + price);
    }

}
