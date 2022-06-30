package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

	private static final float charges = 0.0f;

    public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		
		super(accNo, accNm, charges, isPrime);
		
	}
    
    public float getCharge() {
    	return GSPrimeAcc.charges;
    }
    
    public void bookProduct(float charges) {
    	
    	System.out.println("Prime user your charges are: " + getCharges());
    }
    
	public String toString() {
		 return super.toString();
	 }
}

