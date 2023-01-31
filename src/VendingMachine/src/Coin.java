package VendingMachine.src;

public enum Coin {
    FIVE_CENT(5),
    TEN_CENT(10),
    TWENTY_CENT(20),
    FIFTY_CENT(50),
    HUNDRED_CENT(100);

    private int value;
    private Coin (int value){
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static int[] parseCoins(String coins){
        String[] numberCoinsInText = coins.split(",");
        int[] result = new int[numberCoinsInText.length];

        for(int index = 0; index < numberCoinsInText.length; index++){
            result[index] = Integer.parseInt(numberCoinsInText[index]);
        }
        return result;
    }
}
