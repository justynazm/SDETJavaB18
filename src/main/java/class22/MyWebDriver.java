package class22;

/* Create a WebDriver Interface that will have the following unimplemented behavior:
openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */

    public interface MyWebDriver {


        void openBrowser();

        void closeBrowser();

        void maximizeWindow();


    }

    class ChromeDriver implements MyWebDriver {

        @Override
        public void openBrowser() {
            System.out.println("Open Browser in Chrome");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Close browser in Chrome");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("Maximize in Chrome");
        }
    }

    class FirefoxDriver implements MyWebDriver {

        @Override
        public void openBrowser() {
            System.out.println("Open Browser in Firefox");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Close browser in Firefox");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("Maximize in Firefox ");
        }
    }

