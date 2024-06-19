package loop.ex;

public class ForEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int i =0;

        for(int count = 0; count < 100; count++) {
            i++;

            sum = sum+i;
            System.out.println(sum);
        }
    }
}
