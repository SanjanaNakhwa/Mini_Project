
public interface VendingMachine {

     void displayProducts();
     void selectProduct(int product);
     void displayEnEnterCoinsMessage();
     void enterCoins(int... coins);
      void displayChangeMessage();
}