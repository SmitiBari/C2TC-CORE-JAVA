package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class Main {

	public static void main(String[] args) {

		ShopFactory shop = new GSShopFactory();

		
		PrimeAcc primeAcc = new GSPrimeAcc(1234, "prime_account_name", 2000f, true);


		NormalAcc normalAcc = new GSNormalAcc(5678, "normal_account_name", 2000f, NormalAcc.getDeliveryCharges());


		primeAcc.bookProduct(3000.0f);
		normalAcc.bookProduct(3000.0f);


		primeAcc.toString();
		normalAcc.toString();
	}
}

