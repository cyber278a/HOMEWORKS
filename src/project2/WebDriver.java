package project2;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakesScreenshot {
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver,TakesScreenshot{
    void navigate();

}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("open Chrome");

    }

    @Override
    public void close() {
        System.out.println("close Chrome");


    }

    @Override
    public String getTitle() {
        System.out.println("Chrome title");

        return null;

    }
    @Override
    public void getScreenshot() {
        System.out.println("Chrome Screenshot");

    }

    @Override
    public void navigate() {
        System.out.println("navigate Chrome");

    }
}
class FirefoxDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("open Firefox");

    }

    @Override
    public void close() {
        System.out.println("close Firefox");


    }

    @Override
    public String getTitle() {
        System.out.println(" Firefox title");

        return null;

    }
    @Override
    public void getScreenshot() {
        System.out.println("Firefox Screenshot");

    }

    @Override
    public void navigate() {
        System.out.println("navigate Firefox");

    }

}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("open Safari");

    }

    @Override
    public void close() {
        System.out.println("close Safari");


    }

    @Override
    public String getTitle() {
        System.out.println(" Safari title");

        return null;

    }
    @Override
    public void getScreenshot() {
        System.out.println("Safari Screenshot");

    }

    @Override
    public void navigate() {
        System.out.println("navigate Safari");

    }}


class WebDriverTester{
    public static void main(String[] args) {

       RemoteWebDriver[] remoteWebDrivers={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
       for (RemoteWebDriver a:remoteWebDrivers){a.open();a.close();a.getTitle();a.getScreenshot();a.navigate();

    }
}}