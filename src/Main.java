import field.Island;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Укажите размер поля");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Island island = new Island(x, y);


    }
 }
