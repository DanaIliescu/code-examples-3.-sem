package OOP.Inheritance;




import java.util.Scanner;

public class MainPrim {
    public static void main (String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar a: ");
        a = scanner.nextInt();
        System.out.println("Introduceti cel de-al doilea numar b: ");
        b = scanner.nextInt();
        if (calculPrimMin(a, b) == 0){
            System.out.println("Nu exista numere prime in intervalul dat.");
        }
        else {
            System.out.println(calculPrimMin(a, b) + " este cel mai mic numar prim.");
        }
    }

    public static int calculPrimMin(int a, int b){
        int prim = 1;
        for (int i = a; i <= b; i++) {
            prim = 1;
            for (int j = 1; i<= i/2; j++) {
                if (i % j == 0) {
                    prim = 0;
                    break;
                }
            }
            if (prim == 1)
                return i;
        }
        return prim;
    }
}
