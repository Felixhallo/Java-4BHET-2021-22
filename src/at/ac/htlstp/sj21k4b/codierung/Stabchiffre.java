package at.ac.htlstp.sj21k4b.codierung;

import at.ac.htlstp.sj21k4b.Datei;

import java.nio.CharBuffer;
import java.util.Vector;

public class Stabchiffre {
    public static final String FAUST="datasrc/faust.txt";
    public static void main(String[] args) {
        char[] cb = Datei.readCharBuffer(FAUST).toString().toCharArray();
        for (int i=0;i<cb.length;i++)
            System.out.print(cb[i]);
    }
}
