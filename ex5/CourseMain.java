package CoadingMatter.ex5;

public class CourseMain {

    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student("도윤" , new JavaCourse());
        students[1] = new Student("철수" , new SqlCourse());
        students[2] = new Student("유리" , new SqlCourse());

        for (Student student : students) {
            student.study();
        }
    }
}
