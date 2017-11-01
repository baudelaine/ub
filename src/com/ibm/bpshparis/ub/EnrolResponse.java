package com.ibm.bpshparis.ub;

import java.util.ArrayList;
import java.util.List;

public class EnrolResponse extends Response {

	List<Integer> cvid_uuid_tmp = new ArrayList<Integer>();

	public List<Integer> getCvid_uuid_tmp() {
		return cvid_uuid_tmp;
	}

	public void setCvid_uuid_tmp(List<Integer> cvid_uuid_tmp) {
		this.cvid_uuid_tmp = cvid_uuid_tmp;
	}
	
}
