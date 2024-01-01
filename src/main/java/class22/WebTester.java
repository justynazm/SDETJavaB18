package class22;


public class WebTester {

    public static void main(String[] args) {
        MyWebDriver[] arr={new ChromeDriver(), new FirefoxDriver()};
        for(MyWebDriver t:arr){
            t.openBrowser();
            t.closeBrowser();
            t.maximizeWindow();
        }
    }
}
