import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TableTest {
    WebDriver wd;

    @Test
    public void xPathTest() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("file:///C:/Users/keysy/Downloads/index.html");

        //items
        WebElement item1 = wd.findElement(By.xpath("//a[@href='#item1']"));
        String textItem1 = item1.getText();
        System.out.println("Text of element Item1 --->"+textItem1);
        Assert.assertEquals(textItem1, "Item 1");

        WebElement item2 = wd.findElement(By.xpath("//a[@href='#item2']"));
        String textItem2 = item2.getText();
        System.out.println("Text of element Item2 --->"+textItem2);
        Assert.assertEquals(textItem2, "Item 2");

        WebElement item3 = wd.findElement(By.xpath("//a[text()='Item 3']"));
        String textItem3 = item3.getText();
        System.out.println("Text of element Item3 --->"+textItem3);
        Assert.assertEquals(textItem3, "Item 3");

        WebElement item4 = wd.findElement(By.xpath("//a[text()='Item 4']"));
        String textItem4 = item4.getText();
        System.out.println("Text of element Item4 --->"+textItem4);
        Assert.assertEquals(textItem4, "Item 4");

        //table
        WebElement europe = wd.findElement(By.xpath("//*[text()='Europe']"));
        String textEurope = europe.getText();
        Assert.assertEquals(textEurope, "Europe");

        WebElement asia = wd.findElement(By.xpath("//*[text()='Asia']"));
        String textAsia = asia.getText();
        Assert.assertEquals(textAsia, "Asia");

        WebElement america = wd.findElement(By.xpath("html/body/div/table/tbody/tr/td[3]"));
        String textAmerica = america.getText();
        Assert.assertEquals(textAmerica, "America");

        WebElement ukraine = wd.findElement(By.xpath("html/body/div/table/tbody/tr[2]/td[1]"));
        String textUkraine = ukraine.getText();
        Assert.assertEquals(textUkraine, "Ukraine");

        WebElement israel = wd.findElement(By.xpath("html//tr[2]/td[2]"));
        String textIsrael = israel.getText();
        Assert.assertEquals(textIsrael, "Israel");

        WebElement usa = wd.findElement(By.xpath("html//tr[2]//td[2]/following-sibling::*"));
        String textUsa = usa.getText();
        Assert.assertEquals(textUsa, "USA");

        WebElement germany = wd.findElement(By.xpath("//*[text()='Germany']"));
        String textGermany = germany.getText();
        Assert.assertEquals(textGermany, "Germany");

        WebElement russia = wd.findElement(By.xpath("//*[text()='Germany']/following-sibling::*"));
        String textRussia = russia.getText();
        Assert.assertEquals(textRussia, "Russia");

        WebElement canada = wd.findElement(By.xpath("//tr[3]/td[3]"));
        String textCanada = canada.getText();
        Assert.assertEquals(textCanada, "Canada");

        WebElement poland = wd.findElement(By.xpath("//*[text()='Poland']"));
        String textPoland = poland.getText();
        Assert.assertEquals(textPoland, "Poland");

        WebElement china = wd.findElement(By.xpath("//*[text()='Chine']"));
        String textChina = china.getText();
        Assert.assertEquals(textChina,"Chine");

        WebElement mexico = wd.findElement(By.xpath("//*[text()='Chine']/following-sibling::*"));
        String textMexico = mexico.getText();
        Assert.assertEquals(textMexico,"Mexico");

        //pink square
        item1.click();
        WebElement message = wd.findElement(By.xpath("//p[@class='message']"));
        String textMessage = message.getText();
        Assert.assertEquals(textMessage, "Clicked by Item 1");
    }
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
        WebElement europe = wd.findElement(By.cssSelector("tr:first-child td:first-child"));
        WebElement asia = wd.findElement(By.cssSelector("tr:first-child td:nth-child(2)"));
        WebElement america = wd.findElement(By.cssSelector("tr:first-child td:nth-child(3)"));
        WebElement ukraine = wd.findElement(By.cssSelector("tr:nth-child(2) td:first-child"));
        WebElement israel = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        WebElement usa = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(3)"));
        WebElement germany = wd.findElement(By.cssSelector("tr:nth-child(3) td:first-child"));
        WebElement russia = wd.findElement(By.cssSelector("tr:nth-child(3) td:nth-child(2)"));
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3) td:nth-child(3)"));
        WebElement poland = wd.findElement(By.cssSelector("tr:last-child td:first-child"));
        WebElement china = wd.findElement(By.cssSelector("tr:last-child td:nth-child(2)"));
        WebElement mexico = wd.findElement(By.cssSelector("tr:last-child td:last-child"));
        //pink square
        WebElement square = wd.findElement(By.cssSelector("#alert"));
        WebElement message = wd.findElement(By.cssSelector(".message"));
        //body
        WebElement body = wd.findElement(By.cssSelector(".container"));
    }
}
