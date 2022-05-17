package co.com.tcs.taller.automatizacion.tasks;

import co.com.tcs.taller.automatizacion.userinterfaces.LinioHomePage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SelectCategory implements Task {


    private String category;

    public SelectCategory(String category) {
        this.category = category;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LinioHomePage.NAV_MENU),/*
                Hace hover, pero la pagina no reacciona como debe
                MoveMouse.to(LinioHomePage.ITEM_NAV_MENU.of(category))*/
                Click.on(LinioHomePage.ITEM_NAV_MENU.of(category))
        );
    }

    public static SelectCategory inNavBar(String category){
        return Tasks.instrumented(SelectCategory.class,category);
    }

}
