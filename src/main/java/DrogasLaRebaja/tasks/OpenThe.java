package DrogasLaRebaja.tasks;

import DrogasLaRebaja.ui.DrogasLaRebajaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThe implements Task {

    private DrogasLaRebajaHomePage drogasLaRebajaHomePage;

    public static OpenThe page() {

        return Tasks.instrumented(OpenThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(drogasLaRebajaHomePage));
    }
}
