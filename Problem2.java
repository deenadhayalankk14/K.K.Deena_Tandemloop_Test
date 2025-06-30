public class Problem2 {
    public static void main(String[] args) {
        int a = 4; // 🔁 Change this value to test other inputs

        for (int i = 0; i < a; i++) {
            System.out.print((2 * i + 1));
            if (i < a - 1) {
                System.out.print(", ");
            }
        }
    }
}
