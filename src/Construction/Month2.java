package Construction;

import java.util.Scanner;

public class Month2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int Month = console.nextInt();
        if ((Month >= 3) && (Month <= 5)) {
            System.out.println("Весна");
        } else if ((Month >= 6) && (Month <= 8)) {
            System.out.println("Лето");
        } else if ((Month >= 9) && (Month <= 11)) {
            System.out.println("Осень");
        } else {
            System.out.println("Зима");
        }
        console.close();
    }
}
