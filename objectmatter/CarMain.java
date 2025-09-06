package objectmatter;

public class CarMain {

    public static void main(String[] args) {
        Car car1 = new Car("그랜저" , 1000000 , "흰색");
        Car car2 = new Car("소나타" , 200000 , "파란색");

        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}
