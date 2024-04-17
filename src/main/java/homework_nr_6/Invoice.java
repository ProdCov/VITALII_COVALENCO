package homework_nr_6;

public class Invoice {
    
    String model;
    String description;
    int purchasedProducts = 0;
    double productPrice = 0.0D;
    
    public Invoice(String model, String description, int purchasedProducts, double productPrice) {
        this.model = model;
        this.description = description;
        this.purchasedProducts = purchasedProducts;
        this.productPrice = productPrice;
    }
    
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getPurchasedProducts() {
        return purchasedProducts;
    }
    
    public void setPurchasedProducts(int purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }
    
    public double getProductPrice() {
        return productPrice;
    }
    
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    
    public void getAmount() {
        double v;
        v = getPurchasedProducts() * getProductPrice();
        System.out.println("Total due for payment : " + v);
    }
}