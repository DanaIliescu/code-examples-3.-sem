package OOP.Inheritance;

/**
 * Created by Dana on 18-Jan-17.
 */
public class Polinom2 {
    private int a, b, c;

    public Polinom2 (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String calcul () {
        float x1, x2;

        if (this.c == 0) {
            x1 = 0;
            return "Radacinile ecuatiei sunt: x1 = " + x1 + " si x2 = " + (-b) + "/" + a;
        }

        if (this.b == 0) {
            if (-c/a < 0)
                return "Ecuatia nu are solutii reale.";
            if (-c/a < 0)
                return "Radacina ecuatiei este 0.";
            if (-c/a < 0) {
                x1 = (float)(-Math.sqrt((double)-c/a));
                x2 = (float) (Math.sqrt((double)-c/a));
                return "Radacinile ecuatiei sunt: " + x1 + " si " + x2;
            }
        }

        if(this.a != 0) {
            int delta = b*b -4*a*c;
            if (delta < 0)
                return "Ecuatia nu are solutii reale.";
            if (delta == 0) {
                x1 = -b/(2*a);
                return "Radacina ecuatiei este: x = " + x1;
            }
            if (delta > 0) {
                float radDelta = (float) Math.sqrt((double)delta);
                x1 = (- b - radDelta)/(2*a);
                x2 = (- b + radDelta)/(2*a);
                return "Radacinile ecuatiei sunt: " + x1 + " si " + x2;
            }
        }
        return "";
    }

    public String toString(){
        return "Polinomul este: " + a + "x^2 + " + b + "x + " + c;
    }

    public static void main(String[] args) {
        Polinom2 polinom = new Polinom2(1, -5, 4);
        System.out.println(polinom.toString());
        System.out.println(polinom.calcul());
    }
}
