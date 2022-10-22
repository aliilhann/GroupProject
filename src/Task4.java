public class Task4 {
}
interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface Screenshot {
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, Screenshot {
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Open the Chrome driver");
    }
    @Override
    public void close() {
        System.out.println("Close the Chrome driver");
    }
    @Override
    public String getTitle() {
        return "Chrome";
    }
    @Override
    public void getScreenshot() {
        System.out.println("Get screenshot of the Chrome driver");
    }
    @Override
    public void navigate() {
        System.out.println("Navigate the Chrome driver");
    }

}
class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open the Firefox driver");
    }

    @Override
    public void close() {
        System.out.println("Close the Firefox driver");
    }

    @Override
    public String getTitle() {
        return "Firefox";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Get screenshot of the Firefox driver");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate the Firefox driver");
    }
}
class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Open the Safari driver");
    }

    @Override
    public void close() {
        System.out.println("Close the Safari driver");
    }

    @Override
    public String getTitle() {
        return "Safari";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Get screenshot of the Safari driver");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate the Safari driver");
    }
}
class WebDriverTest {
    public static void main(String[] args) {

        RemoteWebDriver []remoteWebDrivers={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
        for(RemoteWebDriver drivers:remoteWebDrivers) {
            drivers.open();
            drivers.close();
            drivers.getTitle();
            drivers.navigate();
            drivers.getScreenshot();
        }

    }
}
