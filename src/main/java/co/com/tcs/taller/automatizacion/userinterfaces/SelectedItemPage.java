package co.com.tcs.taller.automatizacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectedItemPage extends PageObject {
    public static final Target SELECT_DROPDOWN_NUMBER_OF_ITEMS_TO_ADD = Target.the("select_dropdown_number_of_items_to_add").locatedBy("//div[@class=\"select-dropdown select-dropdown-product-quantity\"]/button");
    public static final Target SELECT_NUMBER_OF_ITEMS_TO_ADD = Target.the("select_number_of_items_to_add").locatedBy("//ul[@id=\"select-dropdown-list-product-quantity\"]/li[@data-value=\"{0}\"]");
    public static final Target BUTTON_ADD_SHOPPING_CART = Target.the("button_add_shopping_cart").located(By.id("buy-now"));

    public static final Target PRODUCT_NAME = Target.the("product_name").locatedBy("//span[@class=\"product-name\"]");

    public static final Target PRODUCT_PRICE = Target.the("product_price").locatedBy("//span[@class=\"price-main-md\"]");


}
