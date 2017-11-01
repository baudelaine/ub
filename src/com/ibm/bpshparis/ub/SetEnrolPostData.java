package com.ibm.bpshparis.ub;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
import com.ibm.rational.test.lt.kernel.services.ITestLogManager;

/**
 * @author unknown
 */
public class SetEnrolPostData implements
		com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	/**
	 * Instances of this will be created using the no-arg constructor.
	 */
	public SetEnrolPostData() {
	}

	/**
	 * For javadoc of ICustomCode2 and ITestExecutionServices interfaces, select 'Help Contents' in the
	 * Help menu and select 'Extending Rational Performance Tester functionality' -> 'Extending test execution with custom code'
	 */
	public String exec(ITestExecutionServices tes, String[] args) {
		
		ITestLogManager tlm = tes.getTestLogManager();
		
		String result = "";
		
		String enrolReqString = "";
		Path enrolReqPath = Paths.get("/root/ub/res/enrol_request.json");
		Charset charset = StandardCharsets.UTF_8;
		
		if(Files.exists(enrolReqPath)){
			
			ObjectMapper mapper = new ObjectMapper();
	        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	        
			try {
				
				enrolReqString = new String(Files.readAllBytes(enrolReqPath), charset);
		        EnrolRequest enrolRequest = mapper.readValue(enrolReqString, EnrolRequest.class);
		        result = Tools.toJSON(enrolRequest);
		        
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				tlm.reportMessage("GetEnrolPostData() error=" + e.getMessage());
			}
			
		}
		
		tlm.reportMessage("GetEnrolPostData() result=" + result);
		return result;
	}

}
