package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        //덧셈
        System.out.println("a + b = " + sum);

        //뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        //곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        //나눗셈
        double div = a / b;
        System.out.printf("a / b = " + "%.2f" , div);
        System.out.println();

        //나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}
