package OOP.Inheritance;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainFisier {
    public static void main(String[] args) throws Exception {
        String titlu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele fisierului text");
        titlu = scanner.next();

        PrintWriter out = new PrintWriter(new File(titlu));
        System.out.println("Introduceti text: ");
        String text = scanner.next();
        out.print(text.charAt(1)); //scrie al doilea caracter din text in fisier
        out.close();
    }
}


