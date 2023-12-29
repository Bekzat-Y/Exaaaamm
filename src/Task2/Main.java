package Task2;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public  class Main {


        public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первую строку чисел: ");
            String input1 = scanner.nextLine();

            System.out.print("Введите вторую строку чисел: ");
            String input2 = scanner.nextLine();

            findAndRem(input1, input2);
        }

        private static void findAndRem(String str1, String str2) {
            Set<Integer> set1 = convertStringToSet(str1);
            Set<Integer> set2 = convertStringToSet(str2);

            System.out.print("Общие числа без повторений: ");
            for (int number : set1) {
                if (set2.contains(number)) {
                    System.out.print(number + " ");
                }
            }
        }

        private static Set<Integer> convertStringToSet(String str) {
            Set<Integer> set = new HashSet<>();
            String[] numbers = str.split(" ");

            for (String number : numbers) {
                try {
                    int value = Integer.parseInt(number);
                    set.add(value);
                } catch (NumberFormatException ignored) {
                }
            }

            return set;
        }
    }
