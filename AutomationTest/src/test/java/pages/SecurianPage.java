package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class SecurianPage {
    public WebDriver webDriver = Driver.get();

    public void verifySecurianCalculatorPage() {
        webDriver.get("https://www.securian.com/insights-tools/retirement-calculator.html");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("//h2[contains(text(),'Pre-retirement calculator')]")).isDisplayed();
    }

    public void enterRequiredFields(){
        webDriver.findElement(By.id("current-age")).sendKeys("35");
        webDriver.findElement(By.id("retirement-age")).sendKeys("55");
        webDriver.findElement(By.id("current-income")).sendKeys("55000");
        webDriver.findElement(By.id("current-total-savings")).sendKeys("120000");
        webDriver.findElement(By.id("current-annual-savings")).sendKeys("15");
        webDriver.findElement(By.id("savings-increase-rate")).sendKeys("5");
    }

    public void additionalSecurityField(){
        webDriver.findElement(By.id("yes-social-benefits")).click();
        webDriver.findElement(By.id("social-security-override")).sendKeys("500");
    }

    public void enterAllfields(){
        webDriver.findElement(By.id("spouse-income")).sendKeys("65000");
    }

    public void updateDefaultCalculatorValues(){
        webDriver.findElement(By.xpath("//a[contains(text(),'Adjust default values')]")).click();
        webDriver.findElement(By.id("additional-income")).sendKeys("65000");
        webDriver.findElement(By.id("retirement-duration")).sendKeys("8");
        webDriver.findElement(By.id("retirement-annual-income")).sendKeys("20");
        webDriver.findElement(By.id("pre-retirement-roi")).sendKeys("10");
        webDriver.findElement(By.id("post-retirement-roi")).sendKeys("10");

        webDriver.findElement(By.xpath("//button[contains(text(),'Save changes')]")).click();
    }

    public void verifyCalculatorResults(){
        webDriver.findElement(By.xpath("//button[contains(text(),'Calculate')]")).click();
        webDriver.findElement(By.xpath("//h3[contains(text(),'Results')]")).isDisplayed();
    }
}
