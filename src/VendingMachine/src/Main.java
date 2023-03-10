package VendingMachine.src;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        VendingMachine vendingMachine = new TextBasedVendingMachine();

        vendingMachine.displayProducts();

        String selectedProduct = sc.nextLine();
        int selectProductNumber = Integer.parseInt(selectedProduct);

        vendingMachine.selectProduct(selectProductNumber);

        vendingMachine.displayEnterCoinsMessage();

        String userEnteredCoins = sc.nextLine();


        int[] enteredCoins = Coin.parseCoins(userEnteredCoins);

        vendingMachine.enterCoins(enteredCoins);
        vendingMachine.displayChangeMessage();
        
    }
}
