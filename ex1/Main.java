package matter.ex1;

public class Main {

    public static void main(String[] args) {
        Product[] product = {new Book("자바의 정석" , 30000 , "남궁석") , new Movie("인셉션" , 18000 , "크리스토퍼 놀란") , new Album("Proof" , 25000 , "BTS")};

        int sum = 0;
        for (Product product1 : product) {
            product1.getInfo();
            if(product1 instanceof Book){
                Book b = (Book) product1;
                System.out.println("[Book] 저자 목록 : " + b.getAuthor());
            }
            sum += product1.getPrice();
        }
        System.out.println("[총합 가격] : " + sum);

    }
}
