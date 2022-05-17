package co.com.tcs.taller.automatizacion.tasks;

import co.com.tcs.taller.automatizacion.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RemoveItemToShoppingCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CartPage.BUTTON_DELETE_ITEMS_CART));
    }

    public static RemoveItemToShoppingCart all(){
        return Tasks.instrumented(RemoveItemToShoppingCart.class);
    }

}
