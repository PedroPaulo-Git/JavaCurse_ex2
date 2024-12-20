

import Ex.ex1;
import Ex.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 2 ou 3 ");
        int startEx = sc.nextInt();
        System.out.println("Escolhido:"+ startEx);

        if (startEx == 1 ){
            ex1 game = new ex1();

            System.out.println("Enter a two values of rectangle: ");
            System.out.println("First Value X: " + game.retValueX);
            game.retValueX = sc.nextDouble();
            System.out.println("Second Value Y" + game.retValueY);
            game.retValueY = sc.nextDouble();

            System.out.printf("AREA = %.2f%n", game.area());
            System.out.printf("PERIMETER  = %.2f%n", game.perimeter());
            System.out.printf("DIAGONAL  = %.2f%n", game.diagonal());

        }else if (startEx == 2) {
            ex2 game = new ex2();
            game.showPercentage();
        }else {
            System.out.println("GAME DONT else");
        }

    }
}