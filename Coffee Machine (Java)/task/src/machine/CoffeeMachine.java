package machine;
import java.util.Scanner;

public class CoffeeMachine {

    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;

    public static void remaining() {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water\n", water);
        System.out.printf("%d ml of milk\n", milk);
        System.out.printf("%d g of coffee beans\n", beans);
        System.out.printf("%d disposable cups\n", cups);
        System.out.printf("$%d of money\n", money);
    }

    public static void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        int inputW = scanner.nextInt();
        water = water + inputW;
        System.out.println("Write how many ml of milk you want to add:");
        int inputM = scanner.nextInt();
        milk = milk + inputM;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int inputB = scanner.nextInt();
        beans = beans + inputB;
        System.out.println("Write how many disposable cups you want to add:");
        int inputC = scanner.nextInt();
        cups = cups + inputC;
    }

    public static void take() {
        System.out.printf("I gave you $%d\n", money);
        money = 0;
        System.out.println("Write action (buy, fill, take, remaining, exit):");
    }

    public static void espresso() {
        if (water >= 250 && beans >= 16) {
            System.out.println("I have enough resources, making you a coffee!");
            cups = cups - 1;
            water = water - 250;
            beans = beans - 16;
            money = money + 4;
        } else {
            if (water < 250) System.out.println("Sorry, not enough water!");
            else if (beans < 16) System.out.println("Sorry, not enough beans!");
        }

    }

    public static void latte() {
        if (water >= 350 && beans >= 20 && milk >= 75) {
            System.out.println("I have enough resources, making you a coffee!");
            cups = cups - 1;
            water = water - 350;
            milk = milk - 75;
            beans = beans - 20;
            money = money + 7;
        } else {
            if (water < 350) System.out.println("Sorry, not enough water!");
            else if (beans < 20) System.out.println("Sorry, not enough beans!");
            else {
                System.out.println("Sorry, not enough milk!");
            }
        }

    }

    public static void cappuccino() {
        if (water >= 200 && beans >= 12 && milk >= 100) {
            System.out.println("I have enough resources, making you a coffee!");
            cups = cups - 1;
            water = water - 200;
            milk = milk - 100;
            beans = beans - 12;
            money = money + 6;
        } else {
            if (water < 200) System.out.println("Sorry, not enough water!");
            else if (beans < 12) System.out.println("Sorry, not enough beans!");
            else {
                System.out.println("Sorry, not enough milk!");
            }
        }

    }

    public static void buy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String coffee = scanner.nextLine();
        switch (coffee) {
            case "1" -> {
                espresso();
            }
            case "2" -> {
                latte();
            }
            case "3" -> {
                cappuccino();
            }
            default -> {
            }
        }
        System.out.println("Write action (buy, fill, take, remaining, exit):");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scanner.nextLine();
        while (!action.equals("exit")) {
            switch (action) {
                case "remaining" -> {
                    remaining();
                }
                case "buy" -> {
                    buy();
                }
                case "fill" -> {
                    fill();
                }
                case "take" -> {
                    take();
                }
                default -> System.out.println("Write action (buy, fill, take, remaining, exit):");
            }
            action = scanner.nextLine();
        }
    }
}
