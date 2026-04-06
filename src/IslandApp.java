import animal.Duck;
import animal.Rabbit;
import animal.Wolf;
import field.Island;

import java.util.Scanner;

public class IslandApp {


    public static void main(String[] args) {
        Duck duck = new Duck(1,2);
        duck.moving();
        Wolf wolf = new Wolf(3,5);
        wolf.moving();
        Rabbit rabbit = new Rabbit(6,8);
        rabbit.moving();

        Island island = new Island(12,12312);

    }

}
//
//Scanner sc = new Scanner(System.in);
//int x = sc.nextInt();
//int y = sc.nextInt();
//Island island = new Island(x, y);
//        System.out.println("Укажите скорость роста травы от 1 до 3");
//int harvest =  sc.nextInt();