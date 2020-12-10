package UI;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {
    public static final Target USER = Target.the("en la caja de texto usuario").locatedBy("#txtUsername");
    public static final Target PASS = Target.the("en la caja de texto password").locatedBy("#txtPassword");
    public static final Target BTNLOGIN = Target.the("en el boton login").locatedBy("#btnLogin");

}
