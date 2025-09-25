package matter.ex1;

public class Album extends Product{
    private String artist;

    public Album(String name, int price , String artist) {
        super(name, price);
        this.artist = artist;
    }
    @Override
    public void getInfo(){
        System.out.println("앨범 : " + getName() + " 가격 : " + getPrice() + " 가수 : " + artist);
    }

    public String getArtist() {
        return artist;
    }
}
