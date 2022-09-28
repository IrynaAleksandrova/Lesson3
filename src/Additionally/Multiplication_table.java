package Additionally;

public class Multiplication_table {
    public static void main(String[] args) {
        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= j; i++) {
                int sum = 0;
                sum += i * j;
                System.out.print(i + "*" + j + "=" + sum + "\t");
            }
            System.out.println();
        }
    }
}
