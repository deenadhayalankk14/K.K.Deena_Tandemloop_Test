public class Problem3 {
    public static void main(String[] args) {
        int a = 5; // 🔁 Change this value to test different inputs
        int limit = (a % 2 == 0) ? a - 1 : a;

        for (int i = 0; i < limit; i++) {
            System.out.print((2 * i + 1));
            if (i < limit - 1) {
                System.out.print(", ");
            }
        }
    }
}
