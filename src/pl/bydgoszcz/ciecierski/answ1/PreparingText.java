package pl.bydgoszcz.ciecierski.answ1;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import static pl.bydgoszcz.ciecierski.answ1.Main.INPUT_FILE;
import static pl.bydgoszcz.ciecierski.answ1.Main.OUTPUT_FILE;

public class PreparingText {
    FileReader fileInputRead;
    FileWriter fileOutputWrite;


    public List<String> ReadFileToList(String inputFileName) {
        List<String> in = new LinkedList<>();
        int i;

        try {
            fileInputRead = new FileReader(INPUT_FILE);
            System.out.println("Otwieranie pliku z danymi "+INPUT_FILE);
        } catch (FileNotFoundException e) {
            System.out.println("Nie można otworzyć pliku");
            return null;
        }

        try {

            do {
                i = fileInputRead.read();
                if (i != -1 && i > 47 && i < 91) { // znaki od '0' do 'Z'
                    char znak;
                    znak = (char) i;
                    switch (znak) {
                        case 'A':
                            in.add("" + znak);
//                            myString +=  znak;
                            break;
                        case 'C':
                            in.add("" + znak);
//                            myString +=  znak;
                            break;
                        case 'G':
                            in.add("" + znak);
//                            myString +=  znak;
                            break;
                        case 'T':
                            in.add("" + znak);
//                            myString +=  znak;
                            break;
                        default:
                            in.add("" + (char) (++i));
//                            myString+=myString+ (char)(++i);
                            break;
                    }
                }
            }
            while (i != -1);

        } catch (IOException e) {
            System.out.println("Błąd otwarcia pliku");
        }

        try {
            fileInputRead.close();
        } catch (IOException e) {
            System.out.println("Błąd zamykania pliku");
        }
        return in;
    }


    public void writeListToFile(String outputFileName, List<String> nitrogenAlkaliOfNucleotides) {

        try {
            fileOutputWrite = new FileWriter(OUTPUT_FILE);
        } catch (IOException e) {
            System.out.println("Błąd we/wy");
        }

        try {
            System.out.println("Obróbka danych..");
            System.out.println("Zapis danych do pliku "+OUTPUT_FILE);
            for (int a = 0; a < nitrogenAlkaliOfNucleotides.size(); a++) {

                switch (nitrogenAlkaliOfNucleotides.get(a)) {
                    case "A":
                        nitrogenAlkaliOfNucleotides.set(a, "T");
                        break;
                    case "C":
                        nitrogenAlkaliOfNucleotides.set(a, "G");
                        break;
                    case "G":
                        nitrogenAlkaliOfNucleotides.set(a, "C");
                        break;
                    case "T":
                        nitrogenAlkaliOfNucleotides.set(a, "A");
                        break;
                }
//                System.out.print(nitrogenAlkaliOfNucleotides.get(a));

                fileOutputWrite.write(nitrogenAlkaliOfNucleotides.get(a));

            }
        } catch (IOException e) {
            System.out.println("Bład wejścia/wyjścia");
        }

        try {
            fileOutputWrite.close();
        } catch (IOException e) {
            System.out.println("Błąd zamykania pliku docelowego");
        }

    }


}