package VendingMachine;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        VendingMachine vendingMachine = null;

        vendingMachine.displayProducts();

        String selectProduct = sc.nextLine();
        int selectProductNumber = Integer.parseInt(SelectProduct);

        vendingMachine.selectProduct(selectProductNumber);

        vendingMachine.displayEnterCoinsMessage();

        String userEnteredCoins = sc.nextLine();

        int[] enteredCoins = {}; //To do:

        vendingMachine.enterCoins(enteredCoins);
        vendingMachine.displayChangeMessage();
        
    }
}
