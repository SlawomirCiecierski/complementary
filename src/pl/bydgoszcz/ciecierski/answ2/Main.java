package pl.bydgoszcz.ciecierski.answ2;


import java.util.List;

/*
Rozwiązanie bardziej funkcyjne
 */

public class Main {



    public static final String INPUT_FILE = "zadanie-weryfikacyjne.v3.0.dane.txt";
    public static final String OUTPUT_FILE = "result-of-complementary-answ2.txt";

    public static void main(String[] args) {

        PreparingData preparingData = new PreparingData();

        Complementary<String> stringProcessing = (data1, data2) -> {

            preparingData.writeListToFile(OUTPUT_FILE, preparingData.ReadFileToList(INPUT_FILE));
return "Obliczono dane typu String";
        };


        Complementary<Integer> integerProcessingSum=((data1, data2) ->{
            return data1+data2;
        });

        Complementary<Integer> integerProcessingMax=(Integer::max);

        System.out.println("Wykonanie funkcji pracującej na String: " + stringProcessing.func(INPUT_FILE, OUTPUT_FILE));

        System.out.println("Wykonanie funkcji pracującej na Integer: " + integerProcessingSum.func(4,5));
        System.out.println("Wykonanie funkcji pracującej na Integer: " + integerProcessingSum.func(44,59));
        System.out.println("Wykonanie funkcji pracującej na Integer: " + integerProcessingMax.func(484,590));

    }
}
