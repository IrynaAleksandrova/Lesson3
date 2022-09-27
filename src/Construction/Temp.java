package Construction;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int t = console.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if ((t <= -5) && (t > -20)) {
            System.out.println("Нормально");
        } else if (t <= -20) {
            System.out.println("Холодно");
        }
        console.close();
    }
}
