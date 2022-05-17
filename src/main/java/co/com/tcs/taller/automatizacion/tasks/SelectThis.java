package co.com.tcs.taller.automatizacion.tasks;

import co.com.tcs.taller.automatizacion.userinterfaces.LinioHomePage;
import co.com.tcs.taller.automatizacion.userinterfaces.ShopPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectThis implements Task {

    private String itemName;

    public SelectThis(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ShopPage.ITEM_SHOP.of(itemName)));
    }

    public static SelectThis item(String itemName){
        return Tasks.instrumented(SelectThis.class,itemName);
    }
}
