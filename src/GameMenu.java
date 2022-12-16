import java.util.Scanner;

public class GameMenu {
    public static void start(User user) {
        while (true) {
            System.out.println(" (1) Открыть профиль");
            System.out.println(" (2) Просмотреть инструкции");
            System.out.println(" (3) Поздравить с Новым годом других игроков (анонимно) :) ");
            System.out.println(" (4) Посмотреть поздравления");
            if (user.getTypeOfUser() == TypeOfUser.ADMIN) {
                System.out.println("---------------------------");
                System.out.println("  Настройки админа:");
                System.out.println("   (5) Добавить инструкции");
                System.out.println("   (6) Указать стоимость подарка");
                System.out.println("   (7) Указать дату окончания игры");
                System.out.println("   (8) Список Тайных Сант и их получаталей");
                System.out.println("   (9) НАЧАТЬ ИГРУ");
            }
            System.out.println(" (0) Вернуться в главное меню");

            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    user.showProfile();
                    break;
                case "2":
                    Game.showInstructions();
                    break;
                case "3":
                    Game.sendGreetings();
                    break;
                case "4":
                    Game.printGreetings();
                    break;
                case "5":
                    if (user.getTypeOfUser() == TypeOfUser.ADMIN) {
                        Game.addInstructions();
                    }
                    break;
                case "6":
                    if (user.getTypeOfUser() == TypeOfUser.ADMIN) {
                        Game.addPrice();
                    }
                    break;
                case "7":
                    if (user.getTypeOfUser() == TypeOfUser.ADMIN) {
                        Game.getDate();
                    }
                    break;
                case "8":
                    if (user.getTypeOfUser() == TypeOfUser.ADMIN) {
                        Game.printInfoGame();
                    }
                    break;
                case "9":
                    if (user.getTypeOfUser() == TypeOfUser.ADMIN) {
                        Game.startGame(Data.gamers);
                    }
                    break;
                case "0":
                    MainMenu.start();
                    break;
                default:
                    System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }
}

