package co.com.tcs.taller.automatizacion.questions;

import co.com.tcs.taller.automatizacion.models.Item;
import co.com.tcs.taller.automatizacion.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tcs.taller.automatizacion.utils.Utils.*;

public class IsTheItem implements Question<Boolean> {

    private int  numberOfUnits;
    private String itemName;

    public IsTheItem(int numberOfUnits, String itemName) {
        this.numberOfUnits = numberOfUnits;
        this.itemName = itemName;
    }

    public boolean theItemRememberHasTheCorrectValues(Item rememberItem){
        return !(rememberItem.getName().equals(itemName) && rememberItem.getNumberOfItems() == numberOfUnits);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        Item rememberItem = actor.recall("Item");
        if(theItemRememberHasTheCorrectValues(rememberItem)){
            System.out.println("Los valores ingresados previamente no concuerdan con los que el usuario memorizó");
            return false;
        }

        String name =  TargetToString(CartPage.PRODUCT_NAME_CART,actor);
        Double Price = TargetWithSimbolAndDotsToDouble(CartPage.PRODUCT_PRICE_CART,actor);
        Double subtotal = TargetWithSimbolAndDotsToDouble(CartPage.SUBTOTAL,actor);
        int numberOfUnits = TargetToInt(CartPage.NUMBER_OF_ITEMS_CART,actor);

        Item itemInShoppingCart = new Item(name,Price,numberOfUnits,subtotal);;
        return rememberItem.compare(itemInShoppingCart);
    }

    public static IsTheItem same(int numberOfUnits, String itemName){
        return new IsTheItem(numberOfUnits,itemName);
    }

}
