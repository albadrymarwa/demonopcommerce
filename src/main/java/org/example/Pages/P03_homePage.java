package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class P03_homePage extends PageBase
{
WebDriverWait wait ;
    public P03_homePage(WebDriver driver) {
        super(driver);
    }
    By currencyDropDown = By.id("customerCurrency");
    By productPrices = By.cssSelector("div.prices>span.actual-price");
   // By firstSlider = By.className("nivo-imageLink");

    By facbookLogo = By.cssSelector("li.facebook>a");
    By twitterLogo = By.cssSelector("li.twitter>a");
    By rsslogo = By.cssSelector("li.rss>a");
    By youtubelogo =By.cssSelector("li.youtube>a");

    public void selectEuroCurruncy (){
        Select currencySelect = new Select(driver.findElement(currencyDropDown));
        currencySelect.selectByVisibleText("Euro");
    }
    public void verifyEuroSymbolOnAllProducts() {
       List<WebElement> products = driver.findElements(productPrices);
        for (WebElement product : products) {
            String productText = product.getText();
            assertTrue("Euro symbol (€) is not displayed on product: " + productText, productText.contains("€"));
        } 
    }

    public void clickFirstSlider() {
        WebElement firstSlider = driver.findElement(By.xpath("//div[@id='nivo-slider']//a[contains(@href,'nokia-lumia-1020')]"));
        firstSlider.click();
    }

    public void clickSecondSlider() {
        WebElement secondSlider = driver.findElement(By.xpath("//div[@id='nivo-slider']//a[contains(@href,'iphone-6')]"));
        secondSlider.click();
    }

    public String getCurrentUrl() {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/"));
       return driver.getCurrentUrl();
   }
    public void waitForURLToContain(String expectedURL) {
        wait.until(ExpectedConditions.urlContains(expectedURL));
    }

public void openFacebookLInk (){ClickOnElement(facbookLogo);}
    public void openTwitterLinl (){ClickOnElement(twitterLogo);}
    public void openRssLink (){ClickOnElement(rsslogo);}
    public void openYoutubeLink (){ClickOnElement(youtubelogo);}
public String SwitchToNewTabAndReturnURL (){
        for (String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }
        return driver.getCurrentUrl();
}
}
