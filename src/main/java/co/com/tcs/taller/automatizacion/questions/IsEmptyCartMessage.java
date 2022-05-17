package co.com.tcs.taller.automatizacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tcs.taller.automatizacion.userinterfaces.CartPage.MESSAGE_EMPTY_SHOPPING_CART;
import static co.com.tcs.taller.automatizacion.utils.Utils.TargetToString;

public class IsEmptyCartMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TargetToString(MESSAGE_EMPTY_SHOPPING_CART,actor);
    }

    public static IsEmptyCartMessage visible(){
        return new IsEmptyCartMessage();
    }
}
