package apachepoiday1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/");
	//List<WebElement> th	= driver.findElement(By.xpath("//table//thead//th"));
		 //  List<WebElement> tableHeaders =  driver.findElements(By.xpath("//table//thead//th"));
	       
     List<WebElement> ds= driver.findElements(By.xpath("//table//thead//th"));
     for(int i=0;i<ds.size();i++)
     {
    	String headers =ds.get(i).getText();
    	System.out.println("headers of webpages are"+ headers);
     }
    	
    	
    	List<WebElement> ts= driver.findElements(By.xpath("//table//tbody//td"));
    	for(int k=0;k<ts.size();k++)
    	{
    		System.out.println( ts.get(k).getText());
    		
    	}
     
             driver.quit();		
	}

}
