package objectmatter;

public class Car {

    private String model;
    private int price;
    private String color;

    public Car(String model , int price , String color){
        this.color = color;
        this.model = model;
        this.price = price;
    }
    @Override
    public String toString(){
        return "모델 : " + model + " 색깔 : " + color + " 가격 : " + price;
    }
}
