package pages;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ProizvodiPage extends BasePage{

    @FindBy(className = "proizvodi_side_bar" )
    WebElement inventoryItems;

    @FindBy(className = "product_sort_container")
    WebElement sortDropDown;

    @FindBy(className = "shopping_cart_link")
    WebElement shoppingCartIcon;

    @FindBy(className = "shopping_cart_badge")
    WebElement shoppingCartBadge;

    public ProizvodiPage(ChromeDriver driver) {
        super(driver);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue("We are not on Inventory page. Expected: " +
                Strings.PROIZVODI_SIDE_BAR_URL + ". Actual: " + currentUrl, currentUrl.equals(Strings.PROIZVODI_SIDE_BAR_URL));
    }

    public ProizvodiPage(ChromeDriver driver) {
        super(driver);
    }

    }

    public List<WebElement> getAllItems() {
        List<WebElement> items = driver.findElements(By.className("inventory_item"));
        System.out.println(items.size());
        for(WebElement item : items) {
            String currentName = item.findElement(By.xpath(".//div[@class = 'inventory_item_name']")).getText();
            System.out.println(items.indexOf(item) + "." +  currentName);
        }
        return items;
    }

    public List<String> getAllItemPrices() {
        List<WebElement> itemPricesElements = driver.findElements(By.xpath("//div[@class = 'inventory_item_price']"));
        List<String> itemPricesList = new ArrayList<String>();
        for(WebElement itemPrice : itemPricesElements) {
            String price = itemPrice.getText();
            System.out.println(price);
            String priceWithoutDollar = price.substring(1);
            itemPricesList.add(priceWithoutDollar);
        }
        return itemPricesList;
    }

    public WebElement findItemByName(String name) {
        List<WebElement> items = getAllItems();
        for(WebElement item : items) {
            String currentName = item.findElement(By.xpath(".//div[@class = 'inventory_item_name']")).getText();
            if (currentName.equals(name)) {
                System.out.println(currentName);
                return item;
            }
        } return null;
    }

    public InventoryPage addItemToCart(String name) {
        this.clickOnItemButton(name);
        return this;
    }

    public InventoryPage removeItemFromCart(String name) {
        this.clickOnItemButton(name);
        return this;
    }

    public InventoryPage clickOnItemButton(String name) {
        WebElement item = findItemByName(name);
        //Because method findItemByName can return null if it does not find the item, we added a null check
        Assert.assertNotNull("Could not find that Item", item);
        item.findElement(By.xpath(".//button")).click();
        return this;
    }

    public Integer getNumberOfItemsFromShoppingCartIcon() {
        String number = shoppingCartBadge.getText();
        return Integer.valueOf(number);
    }

    /**
     * This method is checking if number of items webelement is shown on shopping cart icon
     * @return {boolean}
     */
    public boolean isShoppingCartEmpty() {
        boolean isShoppingCartNumberShown = false;
        //Because if element is not present, the Selenium will break the test. This is why we add try-catch block
        try {
            isShoppingCartNumberShown = shoppingCartBadge.isDisplayed();
        }catch (Exception error) {}
        return isShoppingCartNumberShown;
    }

    public ShoppingCartPage clickOnShoppingCartIcon() {
        shoppingCartIcon.click();
        return new ShoppingCartPage(driver);
    }

    /**
     * This method prints Item price
     * @param name
     * @return {String} item price
     */
    public String printItemPrice(String name) {
        WebElement element = findItemByName(name);
        //Because method findItemByName can return null if it does not find the item, we added a null check
        Assert.assertNotNull("Could not find that Item", element);
        String itemPrice = element.findElement(By.xpath(".//div[@class = 'inventory_item_price']")).getText();
        System.out.println(itemPrice);
        return itemPrice;
    }

    public InventoryPage sortBy(String sortType) {
        Select dropdown = new Select(sortDropDown);
        dropdown.selectByVisibleText(sortType);
        return this;
    }

}
