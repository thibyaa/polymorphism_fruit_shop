import java.util.Scanner;

public class Runner {

    static Customer newCustomer;
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
        newCustomer = new Customer(customerName, 50.00, isMember);
        brightFruit.addCustomerToShop(newCustomer);

        System.out.println("Welcome to Kav's Fruit Shop " + customerName);
        menu();
    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease select an option:");
        System.out.println("1 - See available fruit");
        System.out.println("2 - Checkout");
        int option = scanner.nextInt();
        switch(option){
            case 1:
                listAvailableFruit();
                break;
            case 2:
                checkout();
                break;
            default:
                System.out.println("Please try again");
        }
    }

    public static void listAvailableFruit(){

    }

    public static void checkout(){

    }

}
