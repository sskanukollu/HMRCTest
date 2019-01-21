package pagesobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.TestBase;

public class DressPage extends TestBase {

    public DressPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    WebElement dressTab;

    @FindBy(xpath="//*[@id=\"selectProductSort\"]")
    WebElement sortBy;

    @FindBy(css=".ajax_block_product:nth-child(5) .button:nth-child(1) > span")
    WebElement costlyDress;

    @FindBy(css="i.icon-th-list")
    WebElement listView;

    @FindBy(xpath="//*[@id=\"center_column\"]/ul/li[5]/div/div[2]/div[2]/a[1]/span")
    WebElement addCart;

    @FindBy(xpath= "//*[@id=\"header\"]/div[3]/div/div/div[3]/div")
    WebElement cart;

    @FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    WebElement cartLoginBack;

    @FindBy(css=".continue > span")
    WebElement continueBtn;

    @FindBy(css="#layer_cart > div:nth-child(1)")
    WebElement overlayWindow;

    @FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    WebElement checkOut;

    public void addToCart() throws InterruptedException {
        dressTab.click();
        sortBy.sendKeys("Price: Highest first");
        listView.click();
        costlyDress.click();
        Thread.sleep(4000);
        driver.findElement(By.className("icon-chevron-left")).click();
    }
    public String cartInfo(){
        String cartInfo = cart.getText();
        System.out.println("cart Info before logout: " + cartInfo);
        return cartInfo.toString();
    }

    public String cartInfoLoginBack(){
        return "empty";
    }
}
