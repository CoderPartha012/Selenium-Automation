package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterUser {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://automationexercise.com"); // open the URL
        
        /*String expectedTitle = "Automation Exercise";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)) {
        	System.out.println("Home page is visible successfully");
        } else {
        	System.out.println("Home page is not visible successfully");   /// FIRST METHOD
        }*/
        
        
        /*WebElement homepageElement = driver.findElement(By.xpath("//i[@class=\"fa fa-home\"]"));
        assert homepageElement.isDisplayed(): "Home page is not visible successfully";  /// SECOND METHOD
        driver.quit();*/
        
        // verify that Home page is visible successfully or not
        WebElement homepageElement = driver.findElement(By.xpath("//i[@class=\"fa fa-home\"]")); /// 3rd METHOD
        boolean hmele = homepageElement.isDisplayed();
        if(hmele) {
        	System.out.println("Home page is visible successfully");
        } else {
        	System.out.println("Home page is not visible successfully"); 
        }
        
        WebElement Login = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
        Login.click();
        
        WebElement newSignupPage = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2")); 
        boolean signup = newSignupPage .isDisplayed();
        if(signup) {
        	System.out.println("New user signup page is visible successfully");
        } else {
        	System.out.println("New user signup page is not visible successfully"); 
        }
        
        WebElement enterName = driver.findElement(By.xpath("//input[@placeholder='Name']"));
        enterName.sendKeys("Partha Rakshit");
        WebElement enterMail = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        enterMail.sendKeys("sdbbn5653@gmail.com");
        driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
        
        WebElement  Account_Info = driver.findElement(By.xpath("//b[normalize-space()='Enter Account Information']")); 
        boolean EAI =  Account_Info.isDisplayed();
        if(EAI) {
        	System.out.println("ENTER ACCOUNT INFORMATION is visible successfully");
        } else {
        	System.out.println("ENTER ACCOUNT INFORMATION is not visible successfully"); 

        }
        
        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
        
        WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
        Password .sendKeys("93gGG93@");
        
        WebElement day = driver.findElement(By.id("days"));
        Select SEL = new Select(day);
        SEL.selectByValue("2");
        
        WebElement month= driver.findElement(By.id("months"));
        Select SEL1 = new Select(month);
        SEL1.selectByValue("2");
        
        WebElement year= driver.findElement(By.id("years"));
        Select SEL2 = new Select(year);
        SEL2.selectByValue("2021");
        
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        driver.findElement(By.xpath("//input[@id='optin']")).click();
        
        WebElement FirstName = driver.findElement(By.xpath("//input[@id='first_name']"));
        FirstName .sendKeys("Partha");
        
        WebElement LastName  = driver.findElement(By.xpath("//input[@id='last_name']"));
        LastName .sendKeys("Rakshit");
        
        WebElement enterCompany = driver.findElement(By.xpath("//input[@id='company']"));
        enterCompany.sendKeys("Adobe");
        
        WebElement enterAddress = driver.findElement(By.xpath("//input[@id='address1']"));
        enterAddress.sendKeys("Gurgaon,Haryana");
        
        Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByValue("India");
		
        WebElement enterState = driver.findElement(By.xpath("//input[@id='state']"));
        enterState.sendKeys("Haryana");
        
        WebElement enterCity = driver.findElement(By.xpath("//input[@id='city']"));
        enterCity.sendKeys("Gurgaon");
        
        WebElement enterZipcode = driver.findElement(By.xpath("//input[@id='zipcode']"));
        enterZipcode .sendKeys("122018");
        
        WebElement enterPhonenumber = driver.findElement(By.xpath("//input[@id='mobile_number']"));
        enterPhonenumber.sendKeys("+7814435456");
        
        driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).click();
        
        WebElement account_Created = driver.findElement(By.xpath("/html/body/section/div/div/div/h2/b")); 
        boolean acle = account_Created.isDisplayed();
        if(acle) {
        	System.out.println("Congratulations! Your new account has been successfully created!");
        } else {
        	System.out.println("No account created"); 
        }
        
        
        
        driver.findElement(By.xpath("/html/body/section/div/div/div/div/a")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("/html/body/section/div/div/div/div/a")).click();
        
        
        WebElement logged_username = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[10]/a")); 
        boolean lus = logged_username.isDisplayed();
        if(lus) {
        	System.out.println("Logged user name is visible");
        } else {
        	System.out.println("Logged user name is not visible"); 
        }
        driver.navigate().refresh();
        driver.findElement(By.xpath("html/body/header/div/div/div/div[2]/div/ul/li[5]/a")).click();
        driver.navigate().refresh();
        
        WebElement account_delete = driver.findElement(By.xpath("//h2[@data-qa=\"account-deleted\"]")); 
        boolean adle = account_delete.isDisplayed();
        if(adle) {
        	System.out.println("Your account is deleted successfully");
        } else {
        	System.out.println("Your account is not deleted successfully"); 
        }
        driver.navigate().refresh();
        driver.findElement(By.xpath("//a[@data-qa=\"continue-button\"]")).click();
        driver.close();
    }
}
