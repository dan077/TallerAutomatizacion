package co.com.tcs.taller.automatizacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ShopPage extends PageObject {
    public static final Target ITEM_SHOP = Target.the("item_shop").locatedBy("//meta[@content=\"{0}\"]/..");
}
