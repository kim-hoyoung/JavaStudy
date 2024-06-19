package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        int num = 0;

        for(int i = 0; i < 10; i++){
            num += 2;
            System.out.println(num);
        }


        System.out.println();
        for(int num1 = 2, count = 1; count <= 10; num1 +=2, count++ ) {
            System.out.println(num1);
        }
    }
}
