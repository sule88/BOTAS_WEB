package testAutomations.seleniumTests.Sagtikislevleri;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testAutomations.Kullanici;


public class sagtikBilgiAl extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;


//
//    WebElement link = driver.findElement(By.id ("map"));
//
//    WebElement link1 = driver.findElement(By.xpath ("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]"));
//
//

    @FindBy(xpath = "//div[@class='ol-ctx-menu-container ol-unselectable']")
    public WebElement sagtik;



    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/canvas[1]")
    public WebElement map;

    @FindBy(xpath = "//div[@class='ol-ctx-menu-container ol-unselectable']")
    public  WebElement sagTik;


//
//    @FindBy(xpath = "//span[contains(text(),'Bilgi Al')]")
//    public WebElement  Bilgial;
//
//
//






    @Test
    public void testsagtikBilgiAl() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }


        Actions actions = new Actions(driver);
        actions.contextClick(sagTik).perform();



        try {
            map.click();
        } catch (Exception e) {
            Logger.warn("sag tık  tıklanmadı.");
        }


        try {
            sagTik.click();
        } catch (Exception e) {
            Logger.warn("sag tık  tıklanmadı.");
        }


//
//        try {
//            Bilgial.click();
//        } catch (Exception e) {
//            Logger.warn("Bilgi al butonu   tıklanmadı.");
//        }
























        String bodyText = driver.findElement(By.tagName("body")).getText();
        // Assert.assertTrue("Text not found!", bodyText.contains("Mevcut Boru Hatları"));




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}