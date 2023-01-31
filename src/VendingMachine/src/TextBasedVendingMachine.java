package VendingMachine.src;

public class TextBasedVendingMachine implements VendingMachine {

    private int selectedProduct;
    private CoinBundle change;

    @Override
    public void displayProducts() {
        System.out.println("     *******************************");
        System.out.println("     WELCOME TO THE VENDING MACHINE");
        System.out.println("     *******************************");

        System.out.println("           PRODUCTS AVAILABLE ");
        System.out.println("                    ");

        for(Product product: Product.values()){
            System.out.println("  Product ID: " + product.getId() + "  " + product.name()+ " - Price:" + product.getPrice() + " cents");
        }
        System.out.println("Enter Product Id of the product you wan to buy!");
    }

    @Override
    public void selectProduct(int product) {
        this.selectedProduct = product;
    }

    @Override
    public void displayEnterCoinsMessage() {
        System.out.println("Please enter coins as follows");
        System.out.println("Number of 5 cent coins, number of 10 cent coins, number of 20 cent coins, number of 50 cent coins, number of 100 cent coins");
        System.out.println("                                                                                                                         ");
        System.out.println("Example: If you would enter 2 ten cent coins: 0,2,0,0,0");
        System.out.println("Please enter coins:");

    }

    @Override
    public void enterCoins(int... coins) {
        Calculator calculator = new SimpleCalculator();
        Product product = Product.valueOf(this.selectedProduct);
        int total = calculator.calculateTotal(new CoinBundle(coins));
        int changeAmount = total - product.getPrice();
        this.change = calculator.calculateChange(changeAmount);
    }

    @Override
    public void displayChangeMessage() {
        System.out.println("                             ");
        System.out.println("Your change is:" + change.getTotal()+ "cents splitted as follows:  ");
        System.out.println(" 100 cents coins " + change.number100CentsCoins);
        System.out.println(" 50 cents coins " + change.number50CentsCoins);
        System.out.println(" 20 cents coins " + change.number20CentsCoins);
        System.out.println(" 10 cents coins " + change.number10CentsCoins);
        System.out.println(" 5 cents coins " + change.number5CentsCoins);

    }
}
