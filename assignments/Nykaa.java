package week4.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		WebElement elementclick = driver.findElement(By.xpath("//*[text()='brands']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(elementclick).perform();
		driver.findElement(By.xpath("//img[contains(@src,'lorealparis')]")).click();
		String head=driver.getTitle();
		if(head.contains("paris")) {
			
			System.out.println("Title contains paris");
		}
		else {
			System.out.println("Title does not contains paris");
			
		}
		driver.findElement(By.xpath("//span[contains(text(),'Sort By')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'top rated')]")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//div[@class='control-indicator checkbox ']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		String text=driver.findElement(By.xpath("//span[text()='Shampoo']")).getText();
		if(text.contains("Shampoo")) {
			System.out.println("It contains shampoo");
			}
		else {
			System.out.println("It does not contains shampoo");
		}
		driver.findElement(By.xpath("//div[contains(text(),'Colour Protect ')]")).click();
		String text2=driver.findElement(By.xpath("//span[text()='MRP:']")).getText();
	    System.out.println(text2);
	
	    driver.findElement(By.xpath("//span[contains(text(),'ADD TO BAG')][1]")).click();
	    Thread.sleep(2000);
	  
	    driver.findElement(By.xpath("//span[contains(text(),'Account')]/following::span")).click();
	    Thread.sleep(2000);
	    
	    String st1=driver.findElement(By.xpath("//div[@class='firsr-col']")).getText();
	    String replace_All = st1.replaceAll("\\D", "");
	    int grand_Total = Integer.parseInt(replace_All);
	    System.out.println("Grand_Total:"+grand_Total);
	    
	    
	    driver.findElement(By.xpath("//span[contains(text(),'PROCEED')]")).click();
	    
	    driver.findElement(By.xpath("//button[contains(text(),'GUEST')]")).click();
	    
	    String st2= driver.findElement(By.xpath("//div[contains(text(),'Grand Total'/following::div[1]])")).getText();
	    String replace_Alll=st2.replaceAll("\\D","");
	    int grand_Totall = Integer.parseInt(replace_Alll);
	    System.out.println("GrandTotal:"+grand_Totall);
	    
	    if(grand_Total==grand_Totall) {
	    	
	    	System.out.println("Both are same");
	    }
	    else {
	    	System.out.println("Both are not same");
	    }
	    
	    driver.quit();
	    
	}	

}