package co.com.tcs.taller.automatizacion.tasks;

import co.com.tcs.taller.automatizacion.models.Item;
import co.com.tcs.taller.automatizacion.models.WriteToFile;
import co.com.tcs.taller.automatizacion.userinterfaces.SelectedItemPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddItemToShoppingCart implements Task {
    private int numberOfUnits;

    public AddItemToShoppingCart(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SelectedItemPage.SELECT_DROPDOWN_NUMBER_OF_ITEMS_TO_ADD),
                Click.on(SelectedItemPage.SELECT_NUMBER_OF_ITEMS_TO_ADD.of(""+ numberOfUnits)),
                Click.on(SelectedItemPage.BUTTON_ADD_SHOPPING_CART));

        String name = SelectedItemPage.PRODUCT_NAME.resolveAllFor(actor).get(0).getText();
        String x = SelectedItemPage.PRODUCT_PRICE.resolveAllFor(actor).get(0).getText().substring(1).replace(".","");
        Double Price = Double.parseDouble(x);
        Item item = new Item(name,Price,numberOfUnits);

        try{
            WriteToFile.WriteFile("Item.txt",item.toString());
        }catch (RuntimeException e){
            System.out.println("No se pudo guardar el item en un archivo :(");
        }

        actor.remember("Item",new Item(name,Price,numberOfUnits));
    }

    public static AddItemToShoppingCart thisNumerOfUnits(int numberOfUnits){
        return Tasks.instrumented(AddItemToShoppingCart.class,numberOfUnits);
    }
}
