package class18;

public class ProductTester {

    public static void main(String[] args){
        Product p=new Product("Bread", 5, 2);
        p.printInfo();
        p.calculatePrice(5, 2);
        System.out.println();
        DiscountedProduct dp=new DiscountedProduct("Bread", 5, 2, 0.1);
        dp.printInfo();
        dp.calculatePrice(5,2,0.1);
    }
}
