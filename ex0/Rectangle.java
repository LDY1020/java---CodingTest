package matter.ex0;

public class Rectangle extends Shape{

    private int width;
    private int length;

    Rectangle(String name , int width , int length) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println("사각형의 넓이 : " + length * width);
    }
}
