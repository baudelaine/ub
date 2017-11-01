package com.ibm.bpshparis.ub;

import java.util.ArrayList;
import java.util.List;

public abstract class  Request {
	
	String app_version = "";
	List<Integer> cvid_client = new ArrayList<Integer>();
	List<BiometricRequest> data = new ArrayList<BiometricRequest>();
	
	public String getApp_version() {
		return app_version;
	}
	public void setApp_version(String app_version) {
		this.app_version = app_version;
	}
	public List<Integer> getCvid_client() {
		return cvid_client;
	}
	public void setCvid_client(List<Integer> cvid_client) {
		this.cvid_client = cvid_client;
	}
	public List<BiometricRequest> getData() {
		return data;
	}
	public void setData(List<BiometricRequest> data) {
		this.data = data;
	}
	
}
