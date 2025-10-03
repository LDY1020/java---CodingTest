package Test;

public class WrapperArray {

    public static void main(String[] args) {
        String[] strings = {"10", "20", "30", "40", null};

        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            int value;
            if (strings[i] == null) {
                value = 0; // null은 0으로 처리
            } else {
                value = Integer.parseInt(strings[i]); // 문자열 → int
            }
            sum += value;
        }
        double avg = (double) sum / strings.length;

        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);
    }
}
