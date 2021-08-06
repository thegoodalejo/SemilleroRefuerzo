package tasks;

import static ui.ShoppingCar.BTN_CHECKOUT;
import static ui.Checkout.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class ProceedCheckout implements Task{
	private String strFName,strLName,strZipCode;
	
	public ProceedCheckout(String strFName, String strLName, String strZipCode) {
		super();
		this.strFName = strFName;
		this.strLName = strLName;
		this.strZipCode = strZipCode;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(Click.on(BTN_CHECKOUT),
				Enter.theValue(strFName).into(TXT_FIRSTNAME),
				Enter.theValue(strLName).into(TXT_LASTNAME),
				Enter.theValue(strZipCode).into(TXT_ZIPCODE),
				Click.on(BTN_CONTINUE));
		
	}
	
	public static ProceedCheckout proceedCheckout(String strFName, String strLName, String strZipCode) {
		return Tasks.instrumented(ProceedCheckout.class, strFName, strLName, strZipCode);
		
	}

}
