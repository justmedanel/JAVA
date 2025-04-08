package sout;


import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Perimetrul: "+2*(a+b));
        System.out.println("Aria: " +(a*b));
    }
}
