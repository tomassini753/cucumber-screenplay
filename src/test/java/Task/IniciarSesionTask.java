package Task;

import UI.LoginUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IniciarSesionTask implements Task {
    String usuario;
    String contrasenia;

    public IniciarSesionTask(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
    public static IniciarSesionTask con(String usuario, String contrasenia){
        return Instrumented.instanceOf(IniciarSesionTask.class).withProperties(usuario,contrasenia);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(LoginUI.USER),
                Enter.theValue(contrasenia).into(LoginUI.PASS),
                Click.on(LoginUI.BTNLOGIN)
        );
    }
}
