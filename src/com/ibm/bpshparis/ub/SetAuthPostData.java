package com.ibm.bpshparis.ub;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
import com.ibm.rational.test.lt.kernel.services.ITestLogManager;

/**
 * @author unknown
 */
public class SetAuthPostData implements
		com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	/**
	 * Instances of this will be created using the no-arg constructor.
	 */
	public SetAuthPostData() {
	}

	/**
	 * For javadoc of ICustomCode2 and ITestExecutionServices interfaces, select 'Help Contents' in the
	 * Help menu and select 'Extending Rational Performance Tester functionality' -> 'Extending test execution with custom code'
	 */
	public String exec(ITestExecutionServices tes, String[] args) {
		
		ITestLogManager tlm = tes.getTestLogManager();
		
		String result = "";
		
		String authReqString = "";
		Path authReqPath = Paths.get("/root/ub/res/auth_request.json");
		Charset charset = StandardCharsets.UTF_8;
		
		if(Files.exists(authReqPath)){
		
				ObjectMapper mapper = new ObjectMapper();
		        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		        
				try {
		        
					authReqString = new String(Files.readAllBytes(authReqPath), charset);
					AuthRequest authRequest = mapper.readValue(authReqString, AuthRequest.class);
		        
					EnrolResponse enrolResponse = mapper.readValue(args[0], EnrolResponse.class);
					List<Integer> cvid_uuid =  enrolResponse.getCvid_uuid();
					
					authRequest.setCvid_uuid(cvid_uuid);
					
					result = Tools.toJSON(authRequest);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					tlm.reportMessage("SetAuthPostData() error=" + e.getMessage());
				}
		
		}
		
		tlm.reportMessage("SetAuthPostData() result=" + result);
		return result;
		
	}

}
