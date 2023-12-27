package class18;
/* 2)Online Shopping Cart:

Construct a class Product with attributes like product_name, price, and quantity.
Create a subclass DiscountedProduct that extends Product and includes an additional discount_rate attribute.
Override a method in DiscountedProduct to calculate the price after applying the discount.
Create instances of both classes and show how prices are calculated */
public class Product {

String productName;
int price;
int quantity;

public Product(String productName, int price, int quantity){
    this.productName=productName;
    this.price=price;
    this.quantity=quantity;
}
public void printInfo(){
    System.out.println(productName+" "+price+" "+quantity);
}
public void calculatePrice(int price, int quantity){
    int totalPrice=price*quantity;
    System.out.println("The price is "+totalPrice);
}
}
class DiscountedProduct extends Product{
    private double discount;
    public DiscountedProduct(String productName, int price, int quantity, double discount){
        super(productName, price, quantity);
        this.discount=discount;
    }
public void calculatePrice(int price, int quantity, double discount){
        double totalDiscountPrice=price*quantity*discount;
    System.out.println("The discounted price is "+ totalDiscountPrice);

}
}