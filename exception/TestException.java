package exception;

public class TestException {
    public static void main(String[] args) {
        int num = 5;
        for (int i = -2; i < 3; i++) {
            System.out.println(div(num, i));
        }
    }

    public static int div(int num, int i) {
        try {
            return num / i;
        } catch (Exception e) {
            System.out.print("Error :");
            return 0;
        } finally {
            System.out.println("hi how are you");
        }
    }
}
