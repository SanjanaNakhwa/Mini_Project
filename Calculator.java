package VendingMachine;
public interface Calculator {

    int calculateTotal(CoinBundle enterCoins);
    CoinBundle calculateChange (int amountMoneyToReturn);
}
