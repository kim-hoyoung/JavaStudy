package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 0;
        int count = 0;
        while(count < 10) {
            count ++;
            num += 2;
            System.out.println(num);
        }
    }
}
