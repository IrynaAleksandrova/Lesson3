package Construction;

import java.util.Scanner;

public class Month1 {

    public static void main(String[] args) {
        System.out.println("Введите номер месяца: ");
        Scanner console = new Scanner(System.in);
        int Month = console.nextInt();
        switch (Month) {
            case 1, 2, 12 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Неверно введен номер месяца");
        }
        console.close();
    }
}