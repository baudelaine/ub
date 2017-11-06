package com.ibm.bpshparis.ub;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Test1 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		
		EnrolRequest er = new EnrolRequest();
		
		KeystrokeDynamics kd = new KeystrokeDynamics();
		AndroidFingerprint af = new AndroidFingerprint();
		
		List<BiometricRequest> data = new ArrayList<BiometricRequest>();
		
		data.add(kd);
		data.add(af);
		
		System.out.println(Tools.toJSON(data));
		
		er.setData(data);
		
		System.out.println(Tools.toJSON(er));
		
	}

}
