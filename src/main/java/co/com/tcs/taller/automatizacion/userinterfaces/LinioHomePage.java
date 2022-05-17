package co.com.tcs.taller.automatizacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://www.linio.com.co")
public class LinioHomePage extends PageObject {
    public static final Target NAV_MENU = Target.the("nav_menu").located(By.id("open-left-menu"));
    public static final Target ITEM_NAV_MENU = Target.the("item_nav_menu").locatedBy("//li/a[@title = \"{0}\"]");
    public static final Target SECCION_NAV_MENU = Target.the("seccion_nav_menu").locatedBy("//img[@title = \"{0}\"]");
}
