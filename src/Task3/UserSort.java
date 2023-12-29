package Task3;

import java.util.*;

public class UserSort {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<User> userList = new ArrayList<>();

            System.out.print("Введите количество пользователей: ");
            int numUsers = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numUsers; i++) {
                System.out.print("Введите имя пользователя: ");
                String name = scanner.nextLine();

                System.out.print("Введите возраст пользователя: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                userList.add(new User(name, age));
            }

            userList.sort(Comparator.comparingInt(User::getAge).thenComparing(User::getName));

            System.out.println("Отсортированный список пользователей:");
            for (User user : userList) {
                System.out.println(user);
            }

        }
    }






