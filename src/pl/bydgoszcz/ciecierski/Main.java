package pl.bydgoszcz.ciecierski;


import java.util.List;

public class Main {

    private List<String> nitrogenBasesOfNucleotides;

    public static final String INPUT_FILE = "zadanie-weryfikacyjne.v3.0.dane.txt";
    public static final String OUTPUT_FILE = "result-of-complementary.txt";

    public static void main(String[] args) {

        PreparingText preparingText = new PreparingText();
//        System.out.print(preparingText.ReadFileToList(INPUT_FILE));

        preparingText.writeListToFile(OUTPUT_FILE, preparingText.ReadFileToList(INPUT_FILE));


    }
}
