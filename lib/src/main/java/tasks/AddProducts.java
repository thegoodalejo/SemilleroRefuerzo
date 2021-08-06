package tasks;

import static ui.ProductsView.*;
import static interactions.SaveInfo.saveInfo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class AddProducts implements Task{
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(LIST_FILTERS),
				SelectFromOptions.byValue("lohi").from(LIST_FILTERS),
				saveInfo(),
				Click.on(BTN_ADD_CAR),
				SelectFromOptions.byValue("hilo").from(LIST_FILTERS),
				Click.on(BTN_ADD_CAR),
				Click.on(BTN_CAR));
		
	}
	
	public static AddProducts addProducts() {
		return Tasks.instrumented(AddProducts.class);
	}

}
