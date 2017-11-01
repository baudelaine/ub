package com.ibm.bpshparis.ub;

import java.util.ArrayList;
import java.util.List;

public abstract class Response {

	String server_version = "";
	List<Integer> cvid_client = new ArrayList<Integer>();
	List<Integer> cvid_uuid = new ArrayList<Integer>();
	List<BiometricResponse> data = new ArrayList<BiometricResponse>();

	public String getServer_version() {
		return server_version;
	}
	public void setServer_version(String server_version) {
		this.server_version = server_version;
	}
	public List<Integer> getCvid_client() {
		return cvid_client;
	}
	public void setCvid_client(List<Integer> cvid_client) {
		this.cvid_client = cvid_client;
	}
	public List<Integer> getCvid_uuid() {
		return cvid_uuid;
	}
	public void setCvid_uuid(List<Integer> cvid_uuid) {
		this.cvid_uuid = cvid_uuid;
	}
	public List<BiometricResponse> getData() {
		return data;
	}
	public void setData(List<BiometricResponse> data) {
		this.data = data;
	}
	
}
