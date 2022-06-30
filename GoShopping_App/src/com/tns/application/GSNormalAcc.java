package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	 public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
			
			super(accNo, accNm, charges, deliveryCharges);
			
		}
	 
	 public void bookProduct(float charges) {
	    	
	    	System.out.println("Normal user your charges are: " + getCharges() + " with Delivery Charges is : " + getDeliveryCharges());
	    }
		
	 public String toString() {
		 return super.toString();
	 }
}
