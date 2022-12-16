import java.util.Objects;
import java.util.Scanner;

public class User {
    private String name;
    private String gift;
    private String password;

    private TypeOfUser typeOfUser;
    private User recipient;
    private User santa;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User(String name, String gift, String password) {
        this.name = name;
        this.gift = gift;
        this.password = password;
    }

    public User(String name, String gift, String password, TypeOfUser typeOfUser) {
        this.name = name;
        this.gift = gift;
        this.password = password;
        this.typeOfUser = typeOfUser;
    }

    public User getRecipient() {
        return recipient;
    }

    public User getSanta() {
        return santa;
    }

    public void setSanta(User santa) {
        this.santa = santa;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public TypeOfUser getTypeOfUser() {
        return typeOfUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showProfile() {
        System.out.println("Имя: " + this.name);
        System.out.print("Ваш статус: ");
        if (getTypeOfUser() == TypeOfUser.ADMIN) {
            System.out.println("админ");
        } else {
            System.out.println("игрок");
        }
        System.out.print("Статус игры: ");
        if (Data.count != 0) {
            System.out.println("ИГРА НАЧАЛАСЬ!");
            System.out.println("Ваш подопечный: " + recipient.getName());
            System.out.println("Подарок который хочет подопечный: " + recipient.getGift());
        } else {
            System.out.println("админ еще не запустил игру");
        }
        System.out.print("Максимальная стоимость подарка: ");
        if (Data.maxPriceOfGift != null) {
            System.out.println(Data.maxPriceOfGift);
        } else {
            System.out.println("**");
        }
        System.out.print("Минимальная стоимость подарка: ");
        if (Data.minPriceOfGift != null) {
            System.out.println(Data.minPriceOfGift);
        } else {
            System.out.println("**");
        }
        System.out.print("Дата окончания игры и вручения подарков: ");
        if (Data.dateEnd == null) {
            System.out.println("**");
        } else {
            System.out.println(Data.dateEnd);
        }
        System.out.println();
    }
}

