package DrogasLaRebaja.tasks;

import DrogasLaRebaja.ui.DrogasLaRebajaBuyPage;
import DrogasLaRebaja.models.DrogasLaRebajaModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class EnterThe implements Task {

    public List<DrogasLaRebajaModel> drogasLaRebajaModelList;

    public EnterThe(List<DrogasLaRebajaModel> drogasLaRebajaModelList) {
        this.drogasLaRebajaModelList = drogasLaRebajaModelList;
    }

    public static EnterThe data(List<DrogasLaRebajaModel> drogasLaRebajaModelList) {
        return Tasks.instrumented(EnterThe.class, drogasLaRebajaModelList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(drogasLaRebajaModelList.get(0).getProduct()).into(DrogasLaRebajaBuyPage.BOTONBUSCAR)
                        .thenHit(Keys.ENTER),
                Click.on(DrogasLaRebajaBuyPage.BOTONMAS),
                Click.on(DrogasLaRebajaBuyPage.BOTONADICIONARCARRITO),
                Click.on(DrogasLaRebajaBuyPage.BOTONPORCIUDAD)
        );
    }

}
