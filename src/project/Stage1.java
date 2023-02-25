package project;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Stage1 {
	public static void main(String args[]) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chrome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//-----------object repository=================
		
		By cross_btn = By.xpath("//button[@class='_2KpZ6l _2doB4z']");
		
		By Search_box = By.xpath("//input[@name='q']");
		
	    By Assured =   (By.xpath("//div[@class='_24_Dny _3tCU7L']"));

	    By Brand_option = (By.xpath("//div[contains(text(),'Brand')]"));		 
	    By Apple_opt =    (By.xpath("(//div[@class='_24_Dny'])[1]"));
		  
		By Display_size =(By.xpath("//div[contains(text(),'Display Size')]"));		
		By Size =         (By.xpath("(//div[@class='_24_Dny'])[1]"));
		
		By connectivity_filter = (By.xpath("//div[contains(text(),'Connectivity')]"));		
	    By select_opt =          (By.xpath("//div[contains(text(),'Wi-Fi+5G')]"));
	    	    
	    By Rom_options = (By.xpath("//div[contains(text(),'Internal Storage')]"));
	    By Rom_select =  (By.xpath("//div[contains(text(),'256 GB')]"));
	    
	    By operating_System = (By.xpath("//div[contains(text(),'Operating System')]"));
	    By select_operatingSystem=(By.xpath("//div[contains(text(),'iPadOS')]"));
	       
	    By Camera_option =     (By.xpath("//div[contains(text(),'Primary Camera')]"));
	    By select_camera_option=(By.xpath("//div[contains(text(),'8MP  Above')]"));
	   
	  //By offer_option = (By.xpath("//div[contains(text(),'Offers')]"));
        By select_offer = (By.xpath("(//div[@class='_3879cV'])[6]"));
	    	    
      //By discount = (By.xpath("//div[contains(text(),'Discount')]"));
	    By select_discount =(By.xpath("//div[contains(text(),'10% or more')]"));
	   
	    By product_select = (By.xpath("//div[@class='_2kHMtA']"));
	    	    
	    By cart_btn = (By.xpath("//span[contains(text(),'Cart')]"));
	    
	    By place_order= (By.xpath("//span[contains(text(),'Place Order')]"));
	   
	    By Enter_email_Mobile_no = (By.xpath("//input[@class='_2IX_2- _17N0em']"));
	    
	    By CONTINUE = (By.xpath("//span[contains(text(),'CONTINUE')]"));
	    
	    By Enter_mobile_no = (By.xpath("//input[@class='_2IX_2- _17N0em']"));
	  //----------Action rep========================
		
		 driver.findElement(cross_btn).click();
		
		 driver.findElement(Search_box).sendKeys("ipad");
		 Thread.sleep(3000);
		
		 WebElement ipad = driver.findElement(By.xpath("(//li[@class='Y5N33s'])[1]"));
		 Actions act = new Actions(driver);
		 act.moveToElement(ipad).click().build().perform();
		 	 
		 driver.findElement(Assured).click();
		 Thread.sleep(2000);
		 driver.findElement(Brand_option).click();
		 driver.findElement(Apple_opt).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(Display_size).click();
		 driver.findElement(Size).click();
		 
		 Thread.sleep(3000);
		 driver.findElement(connectivity_filter).click();
		 driver.findElement(select_opt).click();
		 
		 Thread.sleep(3000);
		 driver.findElement(Rom_options).click();
		 driver.findElement(Rom_select).click();
		 
		 Thread.sleep(3000);
		 driver.findElement(operating_System).click();
		 driver.findElement(select_operatingSystem).click();
		 		 
		 Thread.sleep(3000);
		 driver.findElement(Camera_option).click();
		 driver.findElement(select_camera_option).click();
		 

	//	 driver.findElement(offer_option).click();
		 Thread.sleep(2000);
		 driver.findElement(select_offer).click();
		  
		 
		 Thread.sleep(4000);
	//	 driver.findElement(discount).click();
	     driver.findElement(select_discount).click();
		 
	
		 
		 Thread.sleep(3000);
		 driver.findElement(product_select).click();
		
		 Thread.sleep(3000);
		 String P_id = driver.getWindowHandle();
		 System.out.println(P_id);
		 
		 Set<String> c_id = driver.getWindowHandles();
		 System.out.println(c_id);
		 
		 for(String child:c_id)
		 {
			 System.out.println(child);
			 
			 if(P_id.equals(child))
			 {
				 
			 }
			 else
			 {
				 driver.switchTo().window(child);
				 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
				 Thread.sleep(3000);
				 driver.close();
			 }
		 }
		 driver.switchTo().window(P_id);
		 Thread.sleep(3000);
		 driver.findElement(cart_btn).click();
		 
		 Thread.sleep(4000);
		 driver.findElement(place_order).click();
		 
	   
		Thread.sleep(2000);	 
	    driver.findElement(Enter_email_Mobile_no).sendKeys("dattagolewar12@gmail.com");
        driver.findElement(CONTINUE).click();
        
        Thread.sleep(3000);
        driver.findElement(Enter_mobile_no).sendKeys("8237980296");
        driver.findElement(CONTINUE).click();
}	}