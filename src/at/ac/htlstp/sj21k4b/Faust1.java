package at.ac.htlstp.sj21k4b;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Faust1 { // zählt die Anzahl der Worte faust

    public static  final String faust="datasrc/faust.txt";

    public static void main(String[] args) {// regular exceptions verwendet damit man ausdrücke in texten finden kann
        Vector<String> data = Datei.read(faust);
        int a=0;
        int z=0;
        for (String line:data) {
            Pattern pattern = Pattern.compile("(^|[\\s\\,\\.])[Ff]aust([\\s\\,\\.]|$)"); // Dacherl Anfang, Dollar ende
            Matcher matcher = pattern.matcher(line);
            boolean first=true;
            while (matcher.find()) {
                a++;
                if (first) { first=false;z++;}
            }
        }
        System.out.println("founds:"+a+" in "+z+" lines! ");
    }
}
