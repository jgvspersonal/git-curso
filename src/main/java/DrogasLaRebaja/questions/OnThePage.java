package DrogasLaRebaja.questions;

import DrogasLaRebaja.ui.DrogasLaRebajaBuyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class OnThePage implements Question<Boolean> {

    private String message;

    private OnThePage(String message) {
        this.message = message;
    }


    public static OnThePage the(String message) {
        return new OnThePage(message);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String textToCompare = Text.of(DrogasLaRebajaBuyPage.TEXTOCOMPARACION).viewedBy(actor).asString().trim();
        return message.equals(textToCompare);
    }
}
