package ie.atu.week7;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ProductApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List <Product> ProductApp = new ArrayList <>();
        while (true) {
            int i = 0, y = 0;

            System.out.print("===== Inventory Managment System =====\n1) Add Product\n2) Update Product\n3) List Products\n4) Exit\n");
            System.out.print("Enter Choice");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID");
                    String productID = input.next();
                    System.out.print("Enter Product Name");
                    String productName = input.next();
                    System.out.print("Enter Product Price");
                    String productPrice = input.next();
                    System.out.print("Enter Product Quantity");
                    String productQuantity = input.next();
                    Product product = new Product(productID, productName, Double.parseDouble(productPrice), Integer.parseInt(productQuantity));
                    product.getproductID();
                    product.getproductName();
                    product.getproductPrice();
                    product.getproductQuantity();
                    ProductApp.add(product);
                    y++;
                    break;

                case 2:
                    System.out.print("Please enter the product ID to update");
                    String productID1 = input.next();
                    System.out.print("Enter new product name");
                    String productName1 = input.next();
                    System.out.print("Enter new product price");
                    String productPrice1 = input.next();
                    System.out.print("Enter new product quantity");
                    String productQuantity1 = input.next();
                    break;

                case 3:
                    while (i <= y) {
                        for (Product product1 : ProductApp) {
                            System.out.println(product1);
                        }
                        i++;
                    }
                    break;
                    case 4:
                    System.exit(0);
                    break;

                    default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
