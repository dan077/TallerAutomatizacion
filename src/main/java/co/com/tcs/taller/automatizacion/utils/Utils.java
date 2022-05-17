package co.com.tcs.taller.automatizacion.utils;

import co.com.tcs.taller.automatizacion.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

public class Utils{

    public static String TargetToString(Target target, Actor actor){
        return target.resolveAllFor(actor).get(0).getText();
    }
    public static int TargetToInt(Target target, Actor actor){
        return Integer.parseInt(TargetToString(target,actor));
    }
    //$112.144
    public static Double TargetWithSimbolAndDotsToDouble(Target target, Actor actor){
        return Double.parseDouble(TargetToString(target,actor).substring(1).replace(".",""));
    }

}
