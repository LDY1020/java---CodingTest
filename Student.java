package CoadingMatter2;

public class Student {

    private String name;
    private int score;
    public static int totalStudents;

    public Student(String name , int score){
        this.name = name;
        this.score = score;
        totalStudents++;
    }

    public void setScore(int score){
        if(score < 0 || score > 100){
            System.out.println("잘못된 점수입니다");
        }else{
            this.score = score;
            System.out.println(name + " 의 점수는 " + score + " 입니다");
        }
    }

    public int getScore(){
        return score;
    }
}
