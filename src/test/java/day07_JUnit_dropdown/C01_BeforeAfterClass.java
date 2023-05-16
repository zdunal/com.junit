package day07_JUnit_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_BeforeAfterClass {
    //    2) https://www.youtube.com adresine gidin
    //    3) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
    //      ○ titleTest  => Sayfa başlığının “YouTube” oldugunu test edin
    //      ○ imageTest  => YouTube resminin görüntülendiğini (isDisplayed()) test edin
    //      ○ Search Box ’in erisilebilir oldugunu test edin (isEnabled())
    //            ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin

    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //    2) https://www.youtube.com adresine gidin
        driver.get("https://www.youtube.com");
    }
    @Test
    public void titleTest(){
        //      ○ titleTest  => Sayfa başlığının “YouTube” oldugunu test edin
        String expectedTitle = "YouTube";
        String actualTitle = driver.getTitle();
    }

}
