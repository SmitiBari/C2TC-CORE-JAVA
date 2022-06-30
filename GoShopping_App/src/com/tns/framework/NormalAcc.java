package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {

	
	private final static float deliveryCharges = 40.0f;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
	}

	public static float getDeliveryCharges() {
		return deliveryCharges;
	}

	public void bookProduct(float book) {

	}


	public String toString() {
		return super.toString() + " NormalAcc{" + "deliveryCharges=" + deliveryCharges + '}';
	}
}
