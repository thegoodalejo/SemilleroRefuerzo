package tasks;

import static ui.Login.TXT_USER;
import static ui.Login.TXT_PASS;
import static ui.Login.BTN_LOGIN;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task{
	private String strUser, strPass;

	public Login(String strUser, String strPass) {
		super();
		this.strUser = strUser;
		this.strPass = strPass;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(strUser).into(TXT_USER),
				Enter.theValue(strPass).into(TXT_PASS),
				Click.on(BTN_LOGIN));
	}

	public static Performable withCredentials(String strUser, String strPass) {
		return Tasks.instrumented(Login.class, strUser, strPass);
	}
	
	

}
