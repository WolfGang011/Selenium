package Buoi7_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element {
    public static void main (String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver",
                "D:\\Tester\\SeleniumJava\\Setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // khởi tạo chrome driver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://cms.anhtester.com/login");

//        Thread.sleep(2000);

        // Đối tượng của WebElement
        // CLick vào button login
//        WebElement button_login = driver.findElement(By.id("btn-login"));
//        button_login.click();
        WebElement input_email = driver.findElement(By.name("email"));
        input_email.sendKeys("admin@example.com");
        WebElement input_password = driver.findElement(By.name("password"));
        input_password.sendKeys("123456");
        WebElement submit_Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]"));
        submit_Login.click();

        Thread.sleep(1000);

        WebElement button_Upload_file = driver.findElement(By.linkText("Uploaded Files"));
        button_Upload_file.click();

        WebElement upload_new_file = driver.findElement(By.cssSelector("a[class='btn btn-primary']"));
        upload_new_file.click();

        Thread.sleep(2000);

        driver.quit();

    }
}
