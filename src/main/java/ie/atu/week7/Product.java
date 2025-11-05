package ie.atu.week7;

public class Product {
    String productID, productName;
    double productPrice;
    int productQuantity;

    public Product(String productID, String productName, double productPrice, int productQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }
    public String getproductID() {
        return productID;
    }
    public String getproductName() {
        return productName;
    }
    public double getproductPrice() {
        return productPrice;
    }
    public int getproductQuantity() {
        return productQuantity;
    }
    @Override
    public String toString() {
        return "Product: \n" +
                "Product ID: " + productID + "\n" +
                "Product Name: " + productName + "\n" +
                "Product Price: " + productPrice + "\n" +
                "Product Quantity: " + productQuantity + "\n" +
                "--------------------------------------";
    }
}
