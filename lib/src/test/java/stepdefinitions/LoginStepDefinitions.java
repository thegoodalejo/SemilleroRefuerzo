package stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static ui.Login.TXT_PRODUCTS;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Login;

public class LoginStepDefinitions {
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("I want Login in {string}")
	public void iWantLoginIn(String strUrl) {
		theActorCalled("Duvan").wasAbleTo(Open.url(strUrl));
	}

	@When("I assing {string} {string}")
	public void iAssing(String strUser, String strPass) {
		theActorInTheSpotlight().wasAbleTo(Login.withCredentials(strUser,strPass));
	}

	@Then("I verify that the login is successful")
	public void iVerifyThatTheLoginIsSuccessful() {
		theActorInTheSpotlight().should(seeThat(the(TXT_PRODUCTS), isVisible()));
	}

}
