package Task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {


        Map<String, String> dictionary = new HashMap<>();
        System.out.print("Введите слово на английском: ");

        dictionary.put("TV", "телефон");





        Scanner scanner = new Scanner(System.in);
        System.out.println("Список :");


        String wordEnglish = scanner.nextLine();
        scanner.close();
        dictionary.put("Window", "Окно");
        String trans = transl(dictionary, wordEnglish);



        if (trans != null) {
            System.out.println("Translate:" + wordEnglish + trans);
        } else {
            System.out.println("Перевод для слова '" + wordEnglish + " не найден.");
        }






        dictionary.put("Egg ", "Яйцо");
    }
private static String transl(Map<String,

        String> dic, String EngW) {
    return dic.get(EngW);

    }

}