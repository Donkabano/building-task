package by.ilyabychkovski.lineprograms.mathtask3;

/**
 * Peter wants to cover the floor in his room with tile. Length of the room is 4m, width - 3m.
 * Peter has two boxes of tiles. One box contains 16 pieces. Each tile has a size 15x18cm.
 * Does Peter need to go to the hardware store and buy more boxes of tiles?
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длинну комнаты в см:");
        int sizeLengthRoom = scanner.nextInt();

        System.out.println("Введите ширину комнаты в см:");
        int sizeWidthRoom = scanner.nextInt();

        System.out.println("Введите колличество ящиков с плиткой:");
        int drawerTiles = scanner.nextInt();

        System.out.println("Введите колличество плиток в ящике:");
        int numberOfTiles = scanner.nextInt();

        System.out.println("Введите длинну плитки в см:");
        int sizeLengthTiles = scanner.nextInt();

        System.out.println("Введите ширину плитки в см:");
        int sizeWidthTiles = scanner.nextInt();

        int result2 = numberOfTiles * drawerTiles;
        int lengthRoomTiles = sizeLengthRoom / sizeLengthTiles;
        int widthRoomTiles = sizeWidthRoom / sizeWidthTiles;
        int result = lengthRoomTiles * widthRoomTiles;
        int result3 = result2 - result;
        System.out.println("В наличие плиток:" + result2 + ", всего нужно:" + result );


        boolean finalResult = result <= result2;
        if (finalResult) {
            System.out.println("В магазин идти не нужно." + " Осталось плиток: " + result3);
        } else {
            System.out.println("Нужно идти в магазин.");
        }
    }
}