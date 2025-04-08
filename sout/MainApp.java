package sout;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // Citirea unui număr natural de la tastatură
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un număr natural: ");
        int n = scanner.nextInt();

        // Verificarea dacă numărul este prim și găsirea divizorilor
        if (n <= 1) {
            System.out.println("Numărul trebuie să fie mai mare decât 1.");
        } else {
            boolean isPrime = true;  // Presupunem că numărul este prim
            System.out.print("Divizorii lui " + n + " sunt: ");

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                    if (i != 1 && i != n) {
                        isPrime = false;  // Dacă găsim un divizor diferit de 1 și n, numărul nu este prim
                    }
                }
            }

            // Dacă numărul este prim, afișăm un mesaj corespunzător
            if (isPrime) {
                System.out.println("\nNumărul este prim.");
            } else {
                System.out.println("\nNu e nr prim");  // Linia goală pentru separare
            }
        }

        scanner.close();  // Închidem scanner-ul
    }
}
