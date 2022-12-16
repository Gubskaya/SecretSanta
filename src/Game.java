import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void addPrice() {
        System.out.println("Введите максимальную стоимость подарка:");
        Scanner scanner = new Scanner(System.in);
        String max = scanner.nextLine();
        Data.maxPriceOfGift = max;
        System.out.println("Введите минимальную стоимость подарка:");
        String min = scanner.nextLine();
        Data.minPriceOfGift = min;
        System.out.println();
    }


    public static void addInstructions() {  //ок
        System.out.println("Добавьте инструкцию: ");
        Scanner scanner = new Scanner(System.in);
        String instruction = scanner.nextLine();
        Data.instructions.add(instruction);
        System.out.println("инструкция добавлена!");
        System.out.println("Хотите добавить еще инструкцию? \n (1) Да \n (2) Нет");
        int command = scanner.nextInt();
        if (command == 1) {
            addInstructions();
        }
        System.out.println();
    }

    public static void showInstructions() {
        if (Data.instructions.size() != 0) {
            System.out.println("Инструкции к игре:");
            for (String instruction : Data.instructions) {
                System.out.println("  - " + instruction);
            }
        } else {
            System.out.println("Администратор игры еще не добавил инструкции :(");
        }
        System.out.println();
    }

    public static void sendGreetings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите свои поздравления или пожелания, они будут видны всем игрокам :3");
        String greeting = scanner.nextLine();
        Data.greetings.add(greeting);
        System.out.println();
    }

    public static void printGreetings() {
        if (Data.greetings.size() != 0) {
            for (String greetings : Data.greetings) {
                System.out.println("  * " + greetings);
            }
        } else {
            System.out.println("К сожалению, поздравлений еще нет :( но вы можете стать первым!");
        }
        System.out.println();
    }

    public static User logIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше ФИО:");
        String name = scanner.nextLine();
        System.out.println("Введите ваш пароль:");
        String password = scanner.nextLine();
        for (User gamer : Data.gamers) {
            if ((gamer.getPassword().equals(password)) && (gamer.getName()).equals(name)) {
                return gamer;
            }
        }
        System.out.println("Неправильный ввод");
        System.out.println();
        return null;
    }

    public static void getDate() {
        System.out.println("Введите дату вручения подарков");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        Data.dateEnd = date;
        System.out.println();
    }

    public static void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше ФИО:");
        String name = scanner.nextLine();
        User user = new User(name);
        Data.gamers.add(user);

        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        user.setPassword(password);

        System.out.println("Укажите, какой подарок Вы бы хотели получить:");
        if (Data.count != 0) {
            System.out.println("*минимальная стоимость подарка- " + Data.minPriceOfGift + "\n*максимальная стоимость подарка- " + Data.maxPriceOfGift);
        }
        String gift = scanner.nextLine();
        user.setGift(gift);

        System.out.println("Игрок " + user.getName() + " успешно зарегистрирован");
        System.out.println();
    }

    public static void startGame(ArrayList<User> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == arrayList.size() - 1) {
                (arrayList.get(i)).setRecipient(arrayList.get(0));
            } else {
                (arrayList.get(i)).setRecipient(arrayList.get(i + 1));
            }
        }
        for (int j = 0; j < arrayList.size(); j++) {
            if (j == 0) {
                (arrayList.get(j)).setSanta(arrayList.get(arrayList.size() - 1));
            } else {
                (arrayList.get(j)).setSanta(arrayList.get(j - 1));
            }
        }
        Data.count++;
        System.out.println("ИГРА НАЧАЛАСЬ");
    }

    public static void printInfoGame() {
        if (Data.count != 0) {
            for (int k = 0; k < Data.gamers.size(); k++) {
                System.out.println((Data.gamers.get(k)).getName() + " дарит подарок --> " + (Data.gamers.get(k)).getRecipient().getName());
                System.out.println((Data.gamers.get(k)).getName() + " получает подарок от <-- " + (Data.gamers.get(k)).getSanta().getName());
                System.out.println();
            }
        } else {
            System.out.println("Для начала запустите игру");
        }
        System.out.println();
    }
}



