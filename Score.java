package CoadingMatter.ex4;

import java.util.Scanner;

public class Score {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }
        int max = maxNumber(scores);
        double avg = avgNumber(scores);
        printReport(max , avg);
    }

    public static int maxNumber(int[] scores) {
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }

    public static  double avgNumber(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return (double) sum / scores.length;
    }

    public static void printReport(int max , double avg){
        System.out.println("최대값 : " + max);
        System.out.println("평균값 : " + avg);
    }
}
