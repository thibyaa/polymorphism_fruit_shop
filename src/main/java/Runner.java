import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    static Customer newCustomer;
    static Fruit muskmelon;
    static Fruit cantalope;
    static Fruit watermelon;
    static Fruit grapefruit;
    static Fruit yuzu;
    static Fruit kumquat;
    static Fruit strawberries;
    static FruitShop brightFruit = new FruitShop("Bright Fruit", 0.00);


    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String customerName = scanner.nextLine();

        System.out.println("Would you like to be a member? (Y/N)");
        Scanner scannerTwo = new Scanner(System.in);
        String inputDecision = scannerTwo.nextLine();
        boolean isMember = false;
        if(inputDecision == "Y"){
            isMember = true;
        }
        newCustomer = new Customer(customerName, 10.00, isMember);
//        brightFruit.addCustomerToShop(newCustomer);

        System.out.println("Welcome to Kav's Fruit Shop " + customerName);
        menu();
    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease select an option:");
        System.out.println("1 - See available fruit");
        System.out.println("2 - Add a fruit to your basket");
        System.out.println("3 - Checkout");
        int option = scanner.nextInt();
        switch(option){
            case 1:
                listAvailableFruit();
                break;
            case 2:
                addFruitToBasket();
                break;
            case 3:
                checkout();
                break;
            default:
                System.out.println("Please try again");
        }
    }

    public static void listAvailableFruit(){
        watermelon = new Melon("Watermelon", 4.00, LocalDate.of(2023, 10, 20), 5, true);
        cantalope = new Melon("Cantalope", 6.00, LocalDate.of(2023, 10, 20), 5, true);
        muskmelon = new Melon("Muskmelon", 10.00, LocalDate.of(2023, 10, 20), 5, true);
        grapefruit = new Citrus("Grapefruit", 8.99, LocalDate.of(2023, 10, 18), 5, true);
        yuzu = new Citrus("Yuzu", 5.99, LocalDate.of(2023, 10, 18), 5, true);
        kumquat = new Citrus("Kumquat", 18.99, LocalDate.of(2023, 10, 18), 5, true);
        strawberries = new Berry("Strawberry", 5.99, 20, LocalDate.of(2023, 10, 17), 5);
        brightFruit.addFruitToStock(watermelon);
        brightFruit.addFruitToStock(cantalope);
        brightFruit.addFruitToStock(muskmelon);
        brightFruit.addFruitToStock(grapefruit);
        brightFruit.addFruitToStock(yuzu);
        brightFruit.addFruitToStock(kumquat);
        brightFruit.addFruitToStock(strawberries);

        System.out.println("We currently have:");
        for(Fruit fruit: brightFruit.getFruitStock()){
            System.out.println(fruit.getName() + " cost: " + fruit.getPrice());
        }
        menu();
    }

    public static void addFruitToBasket(){
        System.out.println("What is the name of the fruit would you like to buy?");
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        for(int i = 0; i < brightFruit.getFruitStock().size(); i++){
            if(brightFruit.getFruitStock().get(i).getName().equals(fruit)){
                newCustomer.getBasket().addFruitToBasket(brightFruit.getFruitStock().get(i));
            }
        }

        System.out.println("You have added: ");
        for(Fruit basketFruit: newCustomer.getBasket().getFruits()){
            System.out.println(basketFruit.getName());
        }
        menu();

    }

    public static void checkout(){
        brightFruit.sellFruits(newCustomer);
        System.out.println("Thank you for shopping at Bright Fruit, you have " + newCustomer.getWallet() + " left in your wallet");
    }

}
