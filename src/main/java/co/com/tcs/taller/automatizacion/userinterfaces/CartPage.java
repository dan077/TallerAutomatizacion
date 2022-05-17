package co.com.tcs.taller.automatizacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.linio.com.co/cart")
public class CartPage extends PageObject {
    public static final Target SUBTOTAL = Target.the("subtotal").locatedBy("//span[@class=\"price-main-sm float-right subtotal-price ml-auto\"]");
    public static final Target PRODUCT_NAME_CART = Target.the("product_name_cart").locatedBy("//div[@class=\"item-title col-10\"]/span/a");
    public static final Target PRODUCT_PRICE_CART = Target.the("product_price_cart").locatedBy("//div[@class=\"lowest-price\"]/div");
    public static final Target NUMBER_OF_ITEMS_CART = Target.the("number_of_items_cart").locatedBy("//select[@class=\"form-control form-control-sm ng-pristine ng-untouched ng-valid ng-not-empty\"]/option[@selected=\"selected\"]");
}
