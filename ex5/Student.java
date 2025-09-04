package CoadingMatter.ex5;

public class Student {

    private final String name;
    private final Course course;

   public Student(String name , Course course){
        this.name = name;
        this.course = course;
    }

    public void study(){
        System.out.println(name + " 님이 공부를 시작합니다");
        course.start();

        if(course instanceof JavaCourse){
            System.out.println("객체지향 중요!");
        }
    }
}
