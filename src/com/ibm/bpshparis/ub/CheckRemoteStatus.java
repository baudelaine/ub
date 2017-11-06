package com.ibm.bpshparis.ub;

import org.eclipse.hyades.test.common.event.VerdictEvent;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
import com.ibm.rational.test.lt.kernel.services.ITestLogManager;

/**
 * @author unknown
 */
public class CheckRemoteStatus implements
		com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	/**
	 * Instances of this will be created using the no-arg constructor.
	 */
	public CheckRemoteStatus() {
	}

	/**
	 * For javadoc of ICustomCode2 and ITestExecutionServices interfaces, select 'Help Contents' in the
	 * Help menu and select 'Extending Rational Performance Tester functionality' -> 'Extending test execution with custom code'
	 */
	public String exec(ITestExecutionServices tes, String[] args) {
		
		ITestLogManager tlm = tes.getTestLogManager();
		VerdictEvent  ve = new VerdictEvent();
		
		ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        
        try {
        	
			AuthResponse authResponse = mapper.readValue(args[0], AuthResponse.class);
			
			String test = "OK";
			
			for(BiometricResponse br: authResponse.getData()){
	        	test = br.getRemote_status();
	        	if(tlm.wouldReport(ITestLogManager.ALL)){
	        		tlm.reportMessage(" br.getRemote_status()=" +  br.getRemote_status());
	        	}
	        }
			
			if(tlm.wouldReport(ITestLogManager.ALL)){
				tlm.reportMessage("test=" + test);
			}
			
			if(test.equalsIgnoreCase("OK")){
				ve.setVerdict(VerdictEvent.VERDICT_PASS);
			}
			else{
				ve.setVerdict(VerdictEvent.VERDICT_FAIL);
			}
			
			if(tlm.wouldReport(ITestLogManager.ALL)){
				tlm.reportVerificationPoint(ve);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if(tlm.wouldReport(ITestLogManager.ALL)){
				tlm.reportMessage("CheckRemoteStatus() error=" + e.getMessage());
			}
		}
		
		return null;
	}

}
