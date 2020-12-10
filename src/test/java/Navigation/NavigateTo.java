package Navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable paginaPrincipal(){
        return Task.where("{0} abre la pagina principal",
                Open.browserOn().the(PaginaPrincipal.class));
    }

}
