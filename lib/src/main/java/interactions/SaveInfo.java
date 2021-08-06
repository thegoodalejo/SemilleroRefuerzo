package interactions;
import static ui.ProductsView.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

public class SaveInfo implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.remember("Product1", Text.of(TXT_PRODUCT_NAME1).viewedBy(actor).asString());
		actor.remember("Product2", Text.of(TXT_PRODUCT_NAME2).viewedBy(actor).asString());
	}
	
	public static SaveInfo saveInfo() {
		return Tasks.instrumented(SaveInfo.class);		
	}
	

}
