package co.com.tcs.taller.automatizacion.tasks;

import co.com.tcs.taller.automatizacion.userinterfaces.LinioHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectSection implements Task {

    private String section;

    public SelectSection(String section) {
        this.section = section;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LinioHomePage.SECTION_NAV_MENU.of(section)));
    }

    public static SelectSection inNavbar(String section){
        return Tasks.instrumented(SelectSection.class,section);
    }
}
