package cond;

public class If6 {

    public static void main(String[] args) {
        int price = 9000;
        int age = 20;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");

        if (true) System.out.println("if문에서 실행됨"); // 실행하는 문장이 하나일 경우 코드 블럭을 생략해도 됨 ㅋㅋ 근데 권장 ㄴㄴ ㅇㅋ?

    }
}
