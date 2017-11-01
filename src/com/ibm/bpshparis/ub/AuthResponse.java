package com.ibm.bpshparis.ub;

import java.util.ArrayList;
import java.util.List;

public class AuthResponse extends Response {

	List<String> active_sensors = new ArrayList<String>();

	public List<String> getActive_sensors() {
		return active_sensors;
	}

	public void setActive_sensors(List<String> active_sensors) {
		this.active_sensors = active_sensors;
	}
	
}
