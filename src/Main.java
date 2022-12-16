import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user = new User("Даша", "Ноутбук", "111", TypeOfUser.ADMIN);
        User user1 = new User("Гулкайыр", "Телефон", "222", TypeOfUser.GAMER);
        User user2 = new User("Максим", "Автомобиль", "333", TypeOfUser.GAMER);
        User user3 = new User("Атай", "Квартира", "666", TypeOfUser.GAMER);
        User user4 = new User("Джеймс Гослинг", "Новый ПК", "555", TypeOfUser.GAMER);
        User user5 = new User("Марк Цукерберг", "Самолет", "666", TypeOfUser.GAMER);
        User user6 = new User("Илон Маск", "Яхта", "777", TypeOfUser.GAMER);
        User user7 = new User("Билл Гейтс", "Книга", "888", TypeOfUser.GAMER);

        Data.gamers.add(user3);
        Data.gamers.add(user1);
        Data.gamers.add(user2);
        Data.gamers.add(user);
        Data.gamers.add(user4);
        Data.gamers.add(user5);
        Data.gamers.add(user6);
        Data.gamers.add(user7);

        Data.instructions.add("Красиво упаковать подарок");
        Data.instructions.add("Не говорить никому, кто ваш подопечный");
        Data.instructions.add("Подготовить подарок к дате окончания игры");

        Data.minPriceOfGift = "5000 сом";
        Data.maxPriceOfGift = "10000 сом";

        Data.dateEnd = "30 декабря";

        Scanner sc = new Scanner(System.in);

        MainMenu.start();
    }
}
