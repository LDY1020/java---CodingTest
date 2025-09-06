package CoadingMatter2.ex3;

public class Album extends Product{

    private String aritst;

    public Album(String name, int price , String aritst) {
        super(name, price);
        this.aritst = aritst;
    }

    @Override
    public void printInfo(){
        System.out.println("앨범 - 제목 : " + getName() + " 가수 : " + aritst + " 가격 : " + getPrice());
    }
}
