package matter.ex0;

public class ShapeMain {

    public static void main(String[] args) {
        Shape[] shapes = {new Circle("원" , 5) , new Rectangle("사각형", 5 , 6)};

        for (Shape shape : shapes) {
            shape.area();
            if(shape instanceof Circle){
                Circle circle = (Circle) shape;
                circle.printInfo();
            }
        }
    }
}
