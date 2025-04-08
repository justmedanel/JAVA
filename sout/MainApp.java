package sout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class MainApp {
    public static void main(String[] args) {
        String[] judete = new String[0];
    try(Scanner scanner = new Scanner(new File("judete_in.txt"))) {
        judete = new String[100];
        int i = 0;
        while(scanner.hasNextLine()) {
            judete[i++] = scanner.nextLine();
        }
        judete = Arrays.copyOf(judete, i);

    }catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    Arrays.sort(judete);
        System.out.println(Arrays.toString(judete));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu judetul de cautat: ");
        String judetcautat = scanner.nextLine();

        int pozitie = Arrays.binarySearch(judete, judetcautat);
        if(pozitie >= 0) {
            System.out.println("Judetul " + judetcautat+ " se afla pe poz " +pozitie);
        }else{
            System.out.println("Judetul " +judetcautat+ " nu a fost gasit");
        }
        scanner.close();
    }
}