package matter.ex0;

public class Circle extends Shape{

    private int radius;

    Circle(String name , int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("원의 넓이 : " + Math.PI * radius * radius);
    }
    public void printInfo(){
        System.out.println("반지름 길이 : " + radius);
    }
}
