package sout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        int suma = 0;
        int count = 0;
        int min = 99999999;
        int max = 0;
    try(Scanner scanner = new Scanner(new File("in.txt"))) {
        while(scanner.hasNextInt()) {
            int x = scanner.nextInt();
            System.out.println(x);
            suma += x;
            count++;
            if(x < min) min = x;
            if (x > max) max = x;


        }
    }catch(FileNotFoundException e){
        System.out.println("fisierul nu a fost gasit");
        }
    try(PrintWriter writer = new PrintWriter(new File("out.txt"))) {
        writer.println("Suma= " + suma);
        writer.println("Media aritmetica= " + (suma / (double) count));
        writer.println("Min= " + min);
        writer.println("Max= " + max);
    }catch(FileNotFoundException e){
        System.out.println("fisierul nu a fost gasit");
        }
    }
}
