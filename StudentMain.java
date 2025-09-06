package CoadingMatter2;

public class StudentMain {

    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student("도윤" , 90);
        students[1] = new Student("철수" , 80);
        students[2] = new Student("영빈" , 70);


        int sum = 0;
        for (Student student : students) {
            student.setScore(student.getScore());
            sum += student.getScore();
        }

        double avg = (double) sum / students.length;

        System.out.println("평균값 : " + avg);
        System.out.println("총 학생 수 : " + Student.totalStudents);

    }
}
