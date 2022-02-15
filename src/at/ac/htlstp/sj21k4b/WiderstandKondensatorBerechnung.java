package at.ac.htlstp.sj21k4b;

import java.util.Scanner;

public class WiderstandKondensatorBerechnung {

    public static void main(String[] args) {

        System.out.println("Für Widerstandsberechnung 1, für Kondensatorberechnung 2:");

        if (sc.nextDouble()==1) {

            // Variablen deklarieren
            double r1,r2,rp,rs;
            Scanner sc = new Scanner(System.in);

            // Werte einlesen
            System.out.println("R1=");
            r1 = sc.nextDouble();
            System.out.println("R2=");
            r2 = sc.nextDouble();

            // Berechnung
            rp = (r1*r2)/(r1+r2);
            rs = (r1+r2);

            System.out.printf("Parallel: %.2f Serie: %f\n", rp, rs);
        }

        if (else)

    }
}
