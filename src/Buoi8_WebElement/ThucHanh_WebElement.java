package Buoi8_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ThucHanh_WebElement {
    public static void main (String[] args) throws Exception{

        System.setProperty("webdriver.chrome.driver",
                "D:\\Tester\\SeleniumJava\\Setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // khởi tạo chrome driver
        WebDriver driver = new ChromeDriver();

        // Chờ đợi mỗi dòng element là 10s
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.navigate().to("https://cms.anhtester.com/login");

        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("admin@example.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("123456");

        WebElement remember = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/label[1]/span[2]"));
        remember.click();

        WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        login.click();

//        Thread.sleep(2000);

        WebElement Blog_System = driver.findElement(By.xpath("//span[contains(text(),'Blog System')]"));
        Blog_System.click();
        System.out.println(Blog_System.getText());

        WebElement All_Post = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/ul[2]/li[9]/ul[1]/li[1]/a[1]"));
        All_Post.click();

        // Add New Post
        WebElement Add = driver.findElement(By.xpath("//body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]"));
        Add.click();

        boolean header_Blog = driver.findElement(By.xpath("//h5[contains(text(),'Blog Information')]")).isDisplayed();
        if (header_Blog == true){
            System.out.println("Đã đến trang Post");
        }
//        else {
//            System.out.println("Chưa đến trang Post");
//        }

        // Kiểu boolean là dạng kiểu true/false để check header có hiển thị hay không
        boolean buttonSave = driver.findElement(By.xpath("//button[contains(text(),'Save')]")).isEnabled();
        if (buttonSave == true){
            driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
        }
        else {
            System.out.println("Không click vào được button save");
        }

//        Thread.sleep(5000);

        driver.quit();
    }
}
