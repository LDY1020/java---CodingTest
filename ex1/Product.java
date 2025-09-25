package matter.ex1;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void getInfo(){
        System.out.println("이름 : " + name + " 가격 : " + price);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
