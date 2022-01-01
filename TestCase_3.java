package assignments.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("EA Sports");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nikhil");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		
		WebElement sourseOptionsdd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select SourceObj = new Select(sourseOptionsdd);
		
		SourceObj.selectByIndex(7);
		//System.out.println(SourceObj.getFirstSelectedOption());
		
		WebElement marketingCampOptions = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingCampddObj = new Select(marketingCampOptions);
		marketingCampddObj.selectByValue("CATRQ_CAMPAIGNS");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Argo");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Romano");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Welcome");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/08/1987");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("FIFA 2025");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Gaming R&D");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("180,000");
		
		WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryMyChoice = new Select(industryDD);
		
		industryMyChoice.selectByVisibleText("Computer Software");
		
		WebElement ownerShipOptions = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipDDMyChoice = new Select(ownerShipOptions);
		
		ownershipDDMyChoice.selectByIndex(2);
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("842");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("5713");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Electronic Arts Inc.");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Gaming and Merchandise ");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Electronic Arts Inc. is a digital interactive entertainment company. The Company develops, markets, publishes and deliver games, content and services that can be played by consumers on a range of platforms, which include game consoles, personal computers (PCs), mobile phones and tablets. The Company’s games and services are based on a portfolio of intellectual property that includes brands, such as Battlefield, The Sims, Apex Legends, Need for Speed, Plants vs. Zombies, FIFA...More");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("4");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("658");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("587280");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Theo");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("1100325");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babu@testleaf.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.ea.com/sports");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Nicolas Timber");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Nick");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Redwood City, California, United States");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Rheinauhafen, Cologne, North Rhine-Westphalia, Germany.");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Redwood");
		
		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDDobj = new Select(stateDD);
		
		stateDDobj.selectByVisibleText("California");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("12875");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("42");
		
		System.out.println(driver.findElement(By.id("createLeadForm_firstNameLocal")).getText());
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println(driver.getTitle());
		driver.close();
	}

}
