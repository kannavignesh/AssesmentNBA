package AssesmentNBA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class AssesmentTestCase {
    public RemoteWebDriver driver;
    public WebDriverWait wait;
    @Test
public void assesmentTestCase() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.nba.com/stats");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'I Accept')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'See All Player Stats')]")).click();
        Thread.sleep(5000);
            WebElement closeTheAdd = driver.findElement(By.xpath("//span[contains(text(),'close dialog')]"));
            WebElement subscribeMessage = driver.findElement(By.xpath("//em[contains(text(),'Your home for kia nba tip-off action')]"));
            if (subscribeMessage.isDisplayed())
                    closeTheAdd.click();

        //click season as 2023-24
        Thread.sleep(5000);
        WebElement closeSignup = driver.findElement(By.xpath("//span[contains(text(),'close email sign up banner')]"));
        if (closeSignup.isDisplayed())
                closeSignup.click();

        driver.findElement(By.xpath("//p[contains(text(),'Season')]/following::div[@class='DropDown_dropdown__TMlAR'][1]")).click();
        driver.findElement(By.xpath("//option[contains(text(),'2023-24')]")).click();
        //Choose 'Season Type' as 'NBA Cup'
        driver.findElement(By.xpath("//p[contains(text(),'Season Type')]/following::div[@class='DropDown_dropdown__TMlAR'][1]")).click();
        driver.findElement(By.xpath("//option[contains(text(),'NBA Cup')]")).click();
        //Choose 'Per Mode' as 'Per Game'
        driver.findElement(By.xpath("//p[contains(text(),'Per Mode')]/following::div[@class='DropDown_dropdown__TMlAR'][1]")).click();
        driver.findElement(By.xpath("//option[contains(text(),'Per Game')]")).click();
        //Choose 'Season Segment' as 'Last Game'
        driver.findElement(By.xpath("//p[contains(text(),'Season Segment')]/following::div[1]")).click();
        driver.findElement(By.xpath("//option[contains(text(),'Last Game')]")).click();
        Thread.sleep(3000);

    }
}