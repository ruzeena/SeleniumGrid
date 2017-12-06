package grid;
import java.net.MalformedURLException;

import java.net.URL;
 
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
 
public class GridExample 
{
	
@Test
public void runFirefox() throws MalformedURLException
{
 

//System.setProperty("webdriver.gecko.driver", "C:\\Users\\alam\\geckodriver.exe");
	 

DesiredCapabilities cap=DesiredCapabilities.firefox();
cap.setPlatform(Platform.WINDOWS);
 
URL url=new URL("http://192.168.1.3:4440/wd/hub");
 
RemoteWebDriver driver=new RemoteWebDriver(url, cap);
 
// start application
driver.get("http://www.facebook.com/");
 
// get the title and print the same
System.out.println("page title is "+driver.getTitle());
 
driver.close();
 
}
 
}