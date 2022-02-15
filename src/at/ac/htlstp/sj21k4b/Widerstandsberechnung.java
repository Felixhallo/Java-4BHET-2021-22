package at.ac.htlstp.sj21k4b;

import java.util.Scanner;

public class Widerstandsberechnung {

    public static void main(String[] args) {

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

}
