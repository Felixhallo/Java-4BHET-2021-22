package at.ac.htlstp.sj21k4b;

import java.io.*;
import java.util.Vector;

public class DataIO {

    public static final String FILENAME = "data/test.txt";

    public static Vector<String> readFile(String filename) throws IOException {
        // Vektor zum Schreiben der Daten aus der Datei test.txt
        Vector<String> lines = new Vector<String>();
        // Definieren des files test.txt
        File file = new File(filename);
        // Erstellen eines FileReader's
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        // Erstellen eines BufferedReader's
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        // String für die gerade gelesene Zeile
        String line;
        // while - Schleife für das einlesen der Daten
        while((line=bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        // Zurückgeben der engelesenen Daten
        return lines;
    }

    public static void writeFile(Vector<String> data, String filename) {
        // Erstellen eines FileWriter's
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filename);
        } catch (IOException e) {
            System.out.println("File not found");
        }
        // Schreiben der Daten aus dem Vektor data nach Zeilen
        for(int i = 0; i < data.size(); i++) {
            try {
                fileWriter.write(data.get(i) + "\n");
            } catch (IOException e) {
                System.out.println("File not found");
            }
        }
        try {
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("fileWriter not found");
        }
    }

    public static void main(String[] args) {
        // Methode zum Auslesen von Daten einer txt - Datei
        Vector<String> data = null;
        try {
            data = readFile(FILENAME);
        } catch (IOException e) {
            System.out.println("File not found");
        }
        // Ausgeben der Ausgelesenen Dateien in Form eines Vektors
        System.out.println("eingelesener Vektor data:" + data);
        // Methode zum Schreiben eines Vektors in eine txt - Datei
        writeFile(data, FILENAME);
    }
}