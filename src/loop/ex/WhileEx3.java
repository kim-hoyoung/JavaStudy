package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        int count = 0;

        while(count < 100 ) {
            count ++;
            i++;
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
