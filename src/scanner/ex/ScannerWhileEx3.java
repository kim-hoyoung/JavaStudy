package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.println("숫자를 입력하세요. \"-1\" 입력시 종료 : ");
/*
        while (true) {
            input = sc.nextInt();
            if (input == -1) {
                break;
            }
            sum += input;
            count++;
        }
        */

        while ((input = sc.nextInt()) != -1) {
            sum += input;
            count++;

        }


        double avg = (double)sum / count;
        System.out.println("합 : " +sum);
        System.out.println("평균 : " + avg);




    }
}
