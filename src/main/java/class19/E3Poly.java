package class19;

import org.openqa.selenium.firefox.FirefoxDriver;

public class E3Poly {

    public static void main(String[] args) throws InterruptedException {

       /* ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://facebook.com");
        Thread.sleep(2000);
        System.out.println(chromeDriver.getTitle());
        chromeDriver.close();*/

        FirefoxDriver f=new FirefoxDriver();
        f.get("https://amazon.com");
        f.close();






    }
}
