package pagesobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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


    @FindBy(xpath="//*[@id=\"center_column\"]/ul/li[5]/div/div[2]/div[2]/a[1]/span")
    WebElement addCart;

    @FindBy(xpath="/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a/span[5]")
    WebElement cart;

    public void addToCart(){
        dressTab.click();
        sortBy.sendKeys("Price: Highest first");
//        expensiveDress.click();
//        addCart.click();

    }
    public String cartInfo(){
        String cartInfo = cart.getText();
        System.out.println("cart Info: " + cartInfo);
        return cartInfo.toString();

    }

}
