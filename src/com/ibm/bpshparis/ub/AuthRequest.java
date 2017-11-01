package com.ibm.bpshparis.ub;

import java.util.ArrayList;
import java.util.List;

public class AuthRequest extends Request {

	List<Integer> cvid_uuid = new ArrayList<>();

	public List<Integer> getCvid_uuid() {
		return cvid_uuid;
	}

	public void setCvid_uuid(List<Integer> cvid_uuid) {
		this.cvid_uuid = cvid_uuid;
	}
	
}
