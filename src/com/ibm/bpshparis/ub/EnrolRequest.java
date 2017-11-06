package com.ibm.bpshparis.ub;

import java.util.Arrays;
import java.util.List;

public class EnrolRequest extends Request {

	List<Integer> cvid_uuid_tmp = Arrays.asList(14,133,86,53,2,163,76,212,128,107,38,162,99,228,89,70);

	public List<Integer> getCvid_uuid_tmp() {
		return cvid_uuid_tmp;
	}

	public void setCvid_uuid_tmp(List<Integer> cvid_uuid_tmp) {
		this.cvid_uuid_tmp = cvid_uuid_tmp;
	}
	
}
