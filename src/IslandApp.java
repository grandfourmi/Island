import field.Island;

import java.util.Scanner;

public class IslandApp {

    public IslandApp() {
        Scanner scanner = new Scanner(System.in);
    }


    public static void main(String[] args) {
        IslandApp app = new IslandApp();
        app.run();

    }

    private void run() {
        System.out.println("Укажите размер поля");

    }
}
//
//Scanner sc = new Scanner(System.in);
//int x = sc.nextInt();
//int y = sc.nextInt();
//Island island = new Island(x, y);
//        System.out.println("Укажите скорость роста травы от 1 до 3");
//int harvest =  sc.nextInt();