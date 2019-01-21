package pagesobjects;

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

    @FindBy(xpath="//*[@id=\"center_column\"]/ul/li[5]/div/div[1]/div/a[1]/img")
    WebElement expensiveDress;

    @FindBy(css=".ajax_block_product:nth-child(5) .button:nth-child(1) > span")
    WebElement costlyDress;

    @FindBy(css="i.icon-th-list")
    WebElement listView;


    @FindBy(xpath="//*[@id=\"center_column\"]/ul/li[5]/div/div[2]/div[2]/a[1]/span")
    WebElement addCart;

    @FindBy(xpath="/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a/span[5]")
    WebElement cart;

    @FindBy(css=".button-medium:nth-child(2) > span")
    WebElement cartBtn;

    @FindBy(css=".continue > span")
    WebElement continueBtn;

    @FindBy(css="#layer_cart > div:nth-child(1)")
    WebElement overlayWindow;

    @FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    WebElement checkOut;

    public void addToCart(){
        dressTab.click();
        sortBy.sendKeys("Price: Highest first");
        listView.click();
        costlyDress.click();
//        overlayWindow.click();
//        driver.switchTo().frame(overlayWindow);
//        continueBtn.click();
//        checkOut.click();
    }
    public String cartInfo(){
        String cartInfo = cart.getText();
        System.out.println("cart Info before logout: " + cartInfo);
        return cartInfo.toString();
    }
}
