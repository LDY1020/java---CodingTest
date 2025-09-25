package matter.ex1;

public class Movie extends Product{
    private String director;

    public Movie(String name, int price , String director) {
        super(name, price);
        this.director = director;
    }
    @Override
    public void getInfo(){
        System.out.println("제목 : " + getName() + " 가격 : " + getPrice() + " 감독 : " + director);
    }

    public String getDirector() {
        return director;
    }
}
