package day07_JUnit_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_RadioButton {
    //  Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
    //  a. Verilen web sayfasına gidin.
    //  https://facebook.com
    //  b. Cookies’i kabul edin
    //  c. Create an account buton’una basin
    //  d. Radio button elementlerini locate edin ve size uygun olani secin
    //  e. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void teardown(){
        driver.close();
    }
    @Test
    public void radioButtonTest() throws InterruptedException {
        //  a. Verilen web sayfasına gidin.
        //  https://facebook.com
        driver.get("https://facebook.com");
        //  b. Cookies’i kabul edin
        driver.findElement(By.xpath("//button[@title='Tüm çerezlere izin ver']")).click();
        //  c. Create an account buton’una basin
        driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        //  d. Radio button elementlerini locate edin ve size uygun olani secin

        WebElement femaleButtonElementi = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        Thread.sleep(2000);

        WebElement maleButtonElementi = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        Thread.sleep(2000);

        WebElement customButtonElementi = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
        Thread.sleep(2000);

        femaleButtonElementi.click();
        Thread.sleep(2000);


        //  e. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin
        Assert.assertTrue(femaleButtonElementi.isSelected());
        Assert.assertFalse(maleButtonElementi.isSelected());
        Assert.assertFalse(customButtonElementi.isSelected());



    }
}
