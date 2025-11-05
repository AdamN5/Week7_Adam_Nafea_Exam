package ie.atu.week7;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ProductApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List <Product> ProductApp = new ArrayList <>();

        int i = 0;

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

            case 2:
                System.out.print("Under consruction");

            case 3:
                for(Product product1 : ProductApp)
                {
                    System.out.println(product);
                }
        }

    }
}
