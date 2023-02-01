package VendingMachine.src;

public enum Product {
    TWIX(1,100),
    COKE(2, 50),
    WATER(3,75),
    SANDWICH(4,150),
    PROTEIN_BAR (5,200);

    private int id;
    private int price;

    Product(int id, int price){
        this.id = id;
        this.price = price;
    }

    public int getId(){
        return this.id;
    }

    public int getPrice(){
        return this.price;
    }

    public static Product valueOf(int productSelected){
        for(Product product: Product.values()){
            if(productSelected == product.getId()){
                return product;
            }
        }
        return null;
    }
}
