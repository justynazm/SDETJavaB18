package class22;

public class ProductTester {
    public static void main(String[] args) {

        Product product = new Product("QX1234", "Office desk", 249.99, 30);


        System.out.println("Product Details:");
        product.printProductDetails();
        System.out.println("******************");


        product.restock(20);
        product.sell(10);


        System.out.println("Product Details After Restocking & Selling:");
        product.printProductDetails();
        System.out.println("*********************");

        product.setProductName("New Product: Office chair");
        product.setPrice(149.99);
        System.out.println("Modified Product Details:");
        product.printProductDetails();
    }


    }

