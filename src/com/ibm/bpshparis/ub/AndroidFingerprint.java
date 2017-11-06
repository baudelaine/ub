package com.ibm.bpshparis.ub;

import java.util.Arrays;
import java.util.List;

public class AndroidFingerprint extends BiometricRequest {

	String biometric_method = "android-fingerprint";
	String local_status = "OK";
	List<Integer> biometric_data = Arrays.asList(1);
	
	@Override
	public List<Integer> getBiometric_data() {
		// TODO Auto-generated method stub
		return this.biometric_data;
	}
	@Override
	public String getLocal_status() {
		// TODO Auto-generated method stub
		return this.local_status;
	}
	@Override
	public String getBiometric_method() {
		// TODO Auto-generated method stub
		return this.biometric_method;
	}
	
}
