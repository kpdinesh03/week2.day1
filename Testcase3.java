package week2.day1;

import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase3 {

	public static void main(String[] args) throws InterruptedException  
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dinesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KP");
		WebElement eledrop = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(eledrop);
		select.selectByVisibleText("Employee");
		WebElement eledrop1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select select1= new Select(eledrop1);
		select1.selectByVisibleText("E-tailer");
		WebElement eledrop2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select select2= new Select(eledrop2);
		select2.selectByVisibleText("LLC/LLP");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("12/8/95");
		WebElement eledrop3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select select3 = new Select(eledrop3);
		select3.selectByVisibleText("INR - Indian Rupee");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("123456789");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("123456789");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Mark Peter");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Dinesh");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("KP");

		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("abc");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("def");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600053");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("-");

		WebElement eledrop4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select select4 = new Select(eledrop4);
		select4.selectByVisibleText("India");
		Thread.sleep(50);
		WebElement eledrop5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select5 = new Select(eledrop5);
		select5.selectByVisibleText("TAMILNADU");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
		String title2 = driver.getTitle();
		System.out.println(title2);
	}

}
