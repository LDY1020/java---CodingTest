package CoadingMatter2.ex3;

public class Movie extends Product{

    private String director;
    private String actor;


    public Movie(String name, int price , String director , String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void printInfo(){
        System.out.println("영화 - 제목 : " + getName() + " 감독 : " + director + " 배우 : " + actor + " 가격 :" +getPrice());
    }
}
