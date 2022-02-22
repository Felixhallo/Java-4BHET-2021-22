package at.ac.htlstp.sj21k4b;

import java.util.Scanner;

public class WiderstandKondensatorBerechnung {

    public static void main(String[] args) {
        double m = 1;
        double choose;

        while(m == 1) {     // (c) Renner

            System.out.println("Für Widerstandsberechnung 1, für Kondensatorberechnung 2:");

            Scanner sc = new Scanner(System.in);
            choose = sc.nextDouble();

            if (choose == 1) { // Widerstand

                // Variablen deklarieren
                double r1, r2, rp, rs;

                // Werte einlesen
                System.out.println("R1=");
                r1 = sc.nextDouble();
                System.out.println("R2=");
                r2 = sc.nextDouble();

                // Berechnung
                rp = (r1 * r2) / (r1 + r2);
                rs = (r1 + r2);

                System.out.printf("Parallel: %.2f Serie: %f\n", rp, rs);
                // (c) Schwab
            }

            if (choose == 2) {  // Kondensator

                // Variablen deklarieren
                double c1, c2, cp, cs;

                // Werte einlesen
                System.out.println("C1=");
                c1 = sc.nextDouble();
                System.out.println("C2=");
                c2 = sc.nextDouble();

                // Berechnung
                cp = (c1 + c2);
                cs = (c1 * c2) / (c1 + c2);

                System.out.printf("Parallel: %.2f Serie: %f\n", cp, cs);

            }
            // Variable
            System.out.println("Do want to try again? Yes? Then press 1!");
            m = sc.nextDouble();

        }
        // (c) Schwab
    }

}
