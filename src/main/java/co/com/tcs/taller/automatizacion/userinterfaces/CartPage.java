package co.com.tcs.taller.automatizacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.linio.com.co/cart")
public class CartPage extends PageObject {
    public static final Target SUBTOTAL = Target.the("subtotal").located(By.className("price-main-sm float-right subtotal-price ml-auto"));
    public static final Target PRODUCT_NAME = Target.the("product_name").located(By.className("//div[@class=\"item-title col-10\"]/span/a"));
    public static final Target PRODUCT_PRICE = Target.the("product_price").located(By.className("//div[@class=\"lowest-price\"]/div"));
}
