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
        int lengthRoom = scanner.nextInt();

        System.out.println("Введите ширину комнаты в см:");
        int widthRoom = scanner.nextInt();

        System.out.println("Введите колличество ящиков с плиткой:");
        int drawerTiles = scanner.nextInt();

        System.out.println("Введите колличество плиток в ящике:");
        int numberOfTiles = scanner.nextInt();

        System.out.println("Введите длинну плитки в см:");
        int lengthTiles = scanner.nextInt();

        System.out.println("Введите ширину плитки в см:");
        int widthTiles = scanner.nextInt();

        int roomSquare = lengthRoom * widthRoom;
        int tilesSquare = lengthTiles * widthTiles;
        int allTilesSquare = numberOfTiles * drawerTiles * tilesSquare;
        boolean doWeNeedMoreTiles = roomSquare > allTilesSquare;

//        int finalTilesAmount = numberOfTiles * drawerTiles;
//        int lengthRoomTiles = lengthRoom / lengthTiles;
//        int widthRoomTiles = widthRoom / widthTiles;
//        int roomsSquare = lengthRoomTiles * widthRoomTiles;
//        int result3 = finalTilesAmount - roomsSquare;
//        System.out.println("В наличие плиток:" + finalTilesAmount + ", всего нужно:" + roomsSquare );


//        boolean finalResult = roomsSquare <= finalTilesAmount;

        if (!doWeNeedMoreTiles) {
            System.out.println("В магазин идти не нужно.");
        } else {
            System.out.println("Нужно идти в магазин.");
        }

        scanner.close();
    }
}