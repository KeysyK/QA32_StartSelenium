import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class tableTest {
    WebDriver wd;
    @Test
    public void tableCss(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("file:///C:/Users/keysy/Downloads/index.html");
        
        //items
        WebElement item1 = wd.findElement(By.cssSelector("[href='#item1']"));
        WebElement item1_2 = wd.findElement(By.cssSelector("#nav ul li:first-child a"));
        WebElement item2 = wd.findElement(By.cssSelector("[href='#item2']"));
        WebElement item2_2 = wd.findElement(By.cssSelector("#nav ul li:nth-child(2) a"));
        WebElement item3 = wd.findElement(By.cssSelector("[href='#item3']"));
        WebElement item3_2 = wd.findElement(By.cssSelector("#nav ul li:nth-child(3) a"));
        WebElement item4 = wd.findElement(By.cssSelector("[href='#item4']"));
        WebElement item4_1 = wd.findElement(By.cssSelector("#nav ul li:last-child a"));
        //inputs
        WebElement inputName = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement inputName2 = wd.findElement(By.cssSelector("[name='name']"));
        WebElement inputSurname = wd.findElement(By.cssSelector("[placeholder='Type your surename']"));
        WebElement inputSurname2 = wd.findElement(By.cssSelector("[name='surename']"));
        //button
        WebElement btnSend = wd.findElement(By.cssSelector(".btn"));
        //table
        WebElement Europe = wd.findElement(By.cssSelector("tr:first-child td:first-child"));
        WebElement Asia = wd.findElement(By.cssSelector("tr:first-child td:nth-child(2)"));
        WebElement America = wd.findElement(By.cssSelector("tr:first-child td:nth-child(3)"));
        WebElement Ukraine = wd.findElement(By.cssSelector("tr:nth-child(2) td:first-child"));
        WebElement Israel = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        WebElement USA = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(3)"));
        WebElement Germany = wd.findElement(By.cssSelector("tr:nth-child(3) td:first-child"));
        WebElement Russia = wd.findElement(By.cssSelector("tr:nth-child(3) td:nth-child(2)"));
        WebElement Canada = wd.findElement(By.cssSelector("tr:nth-child(3) td:nth-child(3)"));
        WebElement Poland = wd.findElement(By.cssSelector("tr:last-child td:first-child"));
        WebElement China = wd.findElement(By.cssSelector("tr:last-child td:nth-child(2)"));
        WebElement Mexico = wd.findElement(By.cssSelector("tr:last-child td:last-child"));
        //pink square
        WebElement square = wd.findElement(By.cssSelector("#alert"));
        WebElement message = wd.findElement(By.cssSelector(".message"));
        //body
        WebElement body = wd.findElement(By.cssSelector(".container"));
    }
}
