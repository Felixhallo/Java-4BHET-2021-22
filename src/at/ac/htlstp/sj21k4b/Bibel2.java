package at.ac.htlstp.sj21k4b;


import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bibel2 {
    public static final String BIBEL="datasrc/bibel02.txt";
    public static void main(String[] args) {
        Vector<String> data = Datei.read(BIBEL);
        if(data!=null) {
            Pattern pattern = Pattern.compile("\\((?<name>(|[^\\(\\)]*[^\\(\\)a-zA-Z])Jo(|[^\\(\\)a-zA-Z][^\\(\\)]*))\\)"); // eckige klammer heißt gruppe, dacherl heißt alles außer dem // Stern sagt er nimmt null oder meherere->gerfräßig
            Matcher m;
            for (String line:data) {
                m = pattern.matcher(line);
                while(m.find()) {
                    for (String part:m.group("name").split("\\s*;\\s*")) {
                        if (part.matches("(|[^a-zA-Z]+)Jo(|[^a-zA-Z]+)"))
                        System.out.println(part.trim());// 0 Gruppe alles, alles in runder klammer, mit dem name treffe ich genau diese Gruppe. //trim löscht auch alle Leerzeichen(vor und nach)
                    }
                }
            }
        } else System.out.println("Datei konnte nicht eingelesen werden!");
    }
}
// Hallo Welt. Informatik ist mein Lieblingsfach