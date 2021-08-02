package com.sophossolutions.questions;

import static com.sophossolutions.util.Constants.FROM_ACCOUNT;

import com.sophossolutions.ui.AccountOverview;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TransferFunds implements Question<Boolean>
{
	public TransferFunds()
	{}
	
	@Override
	public Boolean answeredBy(Actor actor)
	{
		int intFromAccount = actor.recall(FROM_ACCOUNT);
		System.out.println("antes de balance");
		String strBalance = Text.of(AccountOverview.balanceAccount(intFromAccount)).viewedBy(actor).asString();
		System.out.println(strBalance);
		strBalance = strBalance.substring(1);
		Double doubleBalance = Double.parseDouble(strBalance);
		if(doubleBalance > 0)
		{
			return true;
		}
		return false;
	}
	
	public static TransferFunds theBalanceFromAccountIsPositive()
	{
		return new TransferFunds();
	}
}