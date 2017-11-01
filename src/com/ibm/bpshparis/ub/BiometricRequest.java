package com.ibm.bpshparis.ub;

import java.util.ArrayList;
import java.util.List;

public class BiometricRequest extends Biometric {
	
	List<Integer> biometric_data = new ArrayList<Integer>();
	String local_status = "";

	public List<Integer> getBiometric_data() {
		return biometric_data;
	}

	public void setBiometric_data(List<Integer> biometric_data) {
		this.biometric_data = biometric_data;
	}

	public String getLocal_status() {
		return local_status;
	}

	public void setLocal_status(String local_status) {
		this.local_status = local_status;
	}
	
}
