package com.ibm.bpshparis.ub;

import java.util.Arrays;
import java.util.List;

public class LockPattern extends BiometricRequest {

	String biometric_method = "lock-pattern";
	String local_status = "OK";
	List<Integer> biometric_data = Arrays.asList(0,255,0,255,0,162);
	
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
