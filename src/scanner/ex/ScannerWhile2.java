package scanner.ex;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("상품 가격을 입력하세요 (-1 입력시 종료): ");
            int price = sc.nextInt();

            if(price == -1) {
                System.out.println("프로그램 종료");
                break;
            }
            System.out.print("상품 개수 입력 : ");
            int quantity = sc.nextInt();
            sc.nextLine();

            System.out.println("총 비용 : " + (price*quantity));


        }
    }
}
