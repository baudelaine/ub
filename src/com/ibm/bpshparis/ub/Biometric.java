package com.ibm.bpshparis.ub;

public abstract class Biometric {

	String biometric_method = "";
	
	public String getBiometric_method() {
		return biometric_method;
	}
	public void setBiometric_method(String biometric_method) {
		this.biometric_method = biometric_method;
	}
	
}
