package Bebra1;

import java.util.Scanner;

public class bebra2 {
    public static void main(String[] args) {
        Scanner Bebra = new Scanner(System.in);
        System.out.print("чило сюда ");
        int a = Bebra.nextInt();
        System.out.print("чило сюда ");
        int b = Bebra.nextInt();
        System.out.println(Math.sqrt(a*a+b*b));
    }
}
