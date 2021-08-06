package stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static tasks.AddProducts.addProducts;
import static tasks.ProceedCheckout.proceedCheckout;
import static ui.CheckoutOverview.*;
import static questions.TextOf.textOf;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static ui.CheckoutOverview.BTN_FINISH;
import static ui.CheckoutComplete.TXT_ORDER;

import org.hamcrest.core.IsEqual;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BuyProductsStepDefinitions {
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("I want to order by price and add two producto to car")
	public void iWantToOrderByPriceAndAddTwoProductoToCar() {
		theActorInTheSpotlight().wasAbleTo(addProducts());
	}

	@When("I proceed with checkout {string} {string} {string}")
	public void iProceedWithCheckout(String strFirtsName, String strSecondName, String strZipCode) {
		theActorInTheSpotlight().wasAbleTo(proceedCheckout(strFirtsName, strSecondName, strZipCode));;	
		}

	@Then("I validate the products")
	public void iValidateTheProducts() {
		String strP1 = theActorInTheSpotlight().recall("Product1");
		String strP2 = theActorInTheSpotlight().recall("Product2");
		theActorInTheSpotlight().should(seeThat(textOf(PRODUCT_1),IsEqual.equalTo(strP1)));
		theActorInTheSpotlight().should(seeThat(textOf(PRODUCT_2),IsEqual.equalTo(strP2)));
	}

	@Then("check the order are in comming {string}")
	public void checkTheOrderAreInComming(String strOrder) {
		theActorInTheSpotlight().wasAbleTo(Click.on(BTN_FINISH));
		theActorInTheSpotlight().should(seeThat(textOf(TXT_ORDER), IsEqual.equalTo(strOrder)));
	}

}
