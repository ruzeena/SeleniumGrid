package grid;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class JavaSample {

  public static final String USERNAME = "ruzeenabhat1";
  public static final String AUTOMATE_KEY = "UyqwUKo89Ny5NGAfFqpM";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

  public static void main(String[] args) throws Exception {

    DesiredCapabilities caps = DesiredCapabilities.firefox();
    caps.setPlatform(Platform.MAC);
    caps.setCapability("browserstack.debug", "true");
    RemoteWebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://www.facebook.com");
    

    System.out.println(driver.getTitle());
    driver.findElementByName("firstname").sendKeys("Hi");
    driver.findElementByName("reg_email__").sendKeys("Hi");
    driver.quit();

  }
}