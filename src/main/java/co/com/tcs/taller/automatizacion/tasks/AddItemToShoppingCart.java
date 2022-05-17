package co.com.tcs.taller.automatizacion.tasks;

import co.com.tcs.taller.automatizacion.models.Item;
import co.com.tcs.taller.automatizacion.models.WriteToFile;
import co.com.tcs.taller.automatizacion.userinterfaces.SelectedItemPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.tcs.taller.automatizacion.utils.Utils.TargetToString;
import static co.com.tcs.taller.automatizacion.utils.Utils.TargetWithSimbolAndDotsToDouble;

public class AddItemToShoppingCart implements Task {
    private int numberOfUnits;

    public AddItemToShoppingCart(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String name = TargetToString(SelectedItemPage.PRODUCT_NAME,actor);
        Double Price = TargetWithSimbolAndDotsToDouble(SelectedItemPage.PRODUCT_PRICE,actor);
        Item item = new Item(name,Price,numberOfUnits);

        try{
            WriteToFile.WriteFile("Item.txt",item.toString());
        }catch (RuntimeException e){
            System.out.println("No se pudo guardar el item en un archivo :(");
        }

        actor.remember("Item",item);

        actor.attemptsTo(Click.on(SelectedItemPage.SELECT_DROPDOWN_NUMBER_OF_ITEMS_TO_ADD),
                Click.on(SelectedItemPage.SELECT_NUMBER_OF_ITEMS_TO_ADD.of(""+ numberOfUnits)),
                Click.on(SelectedItemPage.BUTTON_ADD_SHOPPING_CART),
                Click.on(SelectedItemPage.CLOSE_ALERT_ADD_TO_CAR),
                Click.on(SelectedItemPage.BUTTON_SHOPPING_CART)
        );

    }

    public static AddItemToShoppingCart thisNumerOfUnits(int numberOfUnits){
        return Tasks.instrumented(AddItemToShoppingCart.class,numberOfUnits);
    }
}
