import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class StartPhoneBook {
    WebDriver wd;
    @Test
    public void startPhoneBook(){
        wd = new ChromeDriver();
            //wd.get("https://contacts-app.tobbymarshall815.vercel.app/login"); //open
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/"); //open + history
        wd.manage().window().maximize();

            //WebElement el = wd.findElement(By.id("idel"));
            //List<WebElement> list = wd.findElements(By.id("idel"));
            //wd.close(); //close one tab
            //WebElement a = wd.findElement(By.tagName("a"));

        List <WebElement> elements = wd.findElements(By.tagName("a"));
        WebElement home = elements.get(0);
        home.click();
        WebElement about = elements.get(1);
        about.click();
        WebElement login = elements.get(2);
        login.click();
        WebElement phonebook = wd.findElement(By.tagName("h1"));
        List <WebElement> emailPassword = wd.findElements(By.tagName("input"));
        WebElement email = emailPassword.get(0);
        email.click();
        WebElement password = emailPassword.get(1);
        password.click();
        WebElement frame = wd.findElement(By.tagName("br"));
        List <WebElement> buttons =wd.findElements(By.tagName("button"));
        WebElement logInButton = buttons.get(0);
        WebElement registrationButton = buttons.get(1);
        WebElement el10 = wd.findElement(By.tagName("body"));
        WebElement el11 = wd.findElement(By.tagName("div"));

        WebElement element = wd.findElement(By.id("root"));

        WebElement header = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement body = wd.findElement(By.className("login_login__3EHKB"));
        WebElement page = wd.findElement(By.className("container"));
        WebElement el12 = wd.findElement(By.className("active"));

        WebElement el13 = wd.findElement(By.linkText("HOME"));
        WebElement el14 = wd.findElement(By.linkText("ABOUT"));
        WebElement el15 = wd.findElement(By.linkText("LOGIN"));
        WebElement el16 = wd.findElement(By.partialLinkText("HO"));

        //wd.quit(); //quit all tabs
    }

    @Test
    public void cssLocatorsTest(){
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
        wd.manage().window().maximize();

        wd.findElement(By.cssSelector(""));
        //by tag name
        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.xpath("//div"));
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.xpath("//a")); //html/body/div/div/a (absolute path)
        //by class
        wd.findElement(By.cssSelector(".login_login__3EHKB"));
        wd.findElement(By.xpath("//div[@class='login_login__3EHKB']"));
        wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));

        //by id
        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.xpath("//*[@id='root'"));
        //by atribute
        wd.findElement(By.cssSelector("[placeholder]"));
        wd.findElement(By.xpath("//*[@placehoder]"));
        wd.findElement(By.cssSelector("[placeholder ='Email']"));
        wd.findElement(By.xpath("//*[@placeholder='Password']"));

        wd.findElement(By.cssSelector("[placeholder *='ma']")); //contains
        wd.findElement(By.xpath("//*[contains(@placeholder,'ss')]"));

        wd.findElement(By.cssSelector("[placeholder ^='E']")); //starts with
        wd.findElement(By.xpath("//*[starts-with(@placeholder,'Pa')]"));

        wd.findElement(By.cssSelector("[placeholder $='l']")); //ends with
        //A few elements
        wd.findElement(By.xpath("//div[@id='root' and @class='container']"));
        //Text
        wd.findElement(By.xpath("//button[text()=' Login']"));
        //by children
        wd.findElement(By.xpath("//button[1]"));
        wd.findElement(By.cssSelector("#customers tr:nth-child(2) td:nth-child(2)"));
        wd.findElement(By.xpath("//*[@id='customers']//tr[2]/td[2]"));
        //by parents, ancestors, siblings (axis)
        wd.findElement(By.xpath("//input[1]/parent::*"));
        wd.findElement(By.xpath("//input[1]/ancestor::div[1]"));
        wd.findElement(By.xpath("//input[1]/following-sibling::*"));
        wd.findElement(By.xpath("//button[2]/preceding-sibling::*"));

    }
}
