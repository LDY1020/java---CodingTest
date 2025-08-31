package 메서드;

import java.util.Scanner;

public class 최대최소 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수 5개를 입력하세요 : ");
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int min = findMin(numbers);
        double avg =  findAvg(numbers);
        int max = findMax(numbers);

        System.out.println("최소값 : " + min);
        System.out.println("최대값" + max);
        System.out.println("평균값 : " + avg);


    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];
        numbers[0] = min;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static double findAvg(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }
}


