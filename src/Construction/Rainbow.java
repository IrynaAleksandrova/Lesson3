package Construction;

import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int color = console.nextInt();
        switch (color) {
            case 1 -> System.out.println("Красный");
            case 2 -> System.out.println("Оранжевый");
            case 3 -> System.out.println("Желтый");
            case 4 -> System.out.println("Зеленый");
            case 5 -> System.out.println("Голубой");
            case 6 -> System.out.println("Синий");
            case 7 -> System.out.println("Фиолетовый");
        }
        console.close();
    }
}
