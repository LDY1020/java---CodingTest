package CoadingMatter2.ex3;

public class Order {

    private Product[] items = new Product[10]; // 상품 담는 배열
    private int count = 0; // 현재 담긴 개수

    // 상품 추가
    public void addItem(Product item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        } else {
            System.out.println("더 이상 상품을 담을 수 없습니다.");
        }
    }

    // 총 가격 계산
    public int getTotalPrice() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += items[i].getPrice();
        }
        return sum;
    }

    // 주문 내용 출력
    public void printOrder() {
        for (int i = 0; i < count; i++) {
            items[i].printInfo(); // 다형성 → Book, Album, Movie 전부 알아서 출력
        }
        System.out.println("총 주문 금액: " + getTotalPrice() + "원");
    }
}