import java.util.Scanner;

public class MainMenu {
    public static void start() {
        while (true) {
            System.out.println("ДОБРО ПОЖАЛОВАТЬ В ИГРУ <Secret Santa>!");
            System.out.println("***************************************");
            System.out.println("Выберите действие:");
            System.out.println(" (1) Войти в аккаунт");
            System.out.println(" (2) Зарегистрироваться");

            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    User gamer = Game.logIn();
                    if (gamer != null) {
                        GameMenu.start(gamer);
                    }
                    break;
                case "2":
                    Game.register();
                    break;
                default:
                    System.out.println("Ошибка! Введите пункт из меню");

            }
        }
    }
}

