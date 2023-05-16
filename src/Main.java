public class Main {
    public static void main(String[] args) {
        int account = 100;
        int amount = 1400;// сумма пополнения
        int bonuse;
        if (amount < 1000) {
            System.out.println(account + amount);
        } else {
            System.out.println((bonuse = amount / 100)+account+amount);
            System.out.println(bonuse + "Бонусов");
        }

    }
}

