package NERL;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class TestFFonGrid {
	
	
	@Test
	public WebDriver Grid() throws MalformedURLException, InterruptedException
	
	{
		
		Thread.sleep(2000);
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		
		//DesiredCapabilities cap=DesiredCapabilities.firefox();
		
		//DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
		
		cap.setPlatform(Platform.WINDOWS);
		
		URL url=new URL("http://localhost:4444/wd/hub");
		
		WebDriver driver=new RemoteWebDriver(url, cap);
		
		return driver;
		
       
	}

}