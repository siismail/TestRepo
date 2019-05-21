package Test;

import org.testng.annotations.Test;
import PageObjects.HomePage;
import lib.FSC_Base;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class HomePageTest extends FSC_Base{
	
	
	HomePage home;

	public HomePageTest() {
		super();
	}
	
 
  
  
  @Test  
  public void titleTest() {
	  
	 HomePage home = PageFactory.initElements(driver, HomePage.class);
	 home.testTitle();
	  
  }

  
 

  
}

