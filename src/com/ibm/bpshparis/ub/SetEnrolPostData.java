package com.ibm.bpshparis.ub;

import java.util.ArrayList;
import java.util.List;

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
		
		try {
		
			EnrolRequest er = new EnrolRequest();
			
			List<BiometricRequest> data = new ArrayList<BiometricRequest>();
			
			for(String arg: args){
				
				switch(arg){
				
					case "kd":
						data.add(new KeystrokeDynamics());
						break;
						
					case "lp":
						data.add(new LockPattern());
						break;
						
					case "ti":
						data.add(new TouchId());
						break;
						
					case "fr":
						data.add(new FaceRecog());
						break;
						
					case "uc":
						data.add(new UwConsent());
						break;
						
					case "af":
						data.add(new AndroidFingerprint());
						break;
						
					case "sr":
						data.add(new SpeakerRecognition());
						break;
				
				}
				
			}
		
			er.setData(data);
			
			result = Tools.toJSON(er);
			
			if(tlm.wouldReport(ITestLogManager.ALL)){
				tlm.reportMessage("GetEnrolPostData() result=" + result);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if(tlm.wouldReport(ITestLogManager.ALL)){
				tlm.reportMessage("GetEnrolPostData() error=" + e.getMessage());
			}
		}
		
		return result;
	}

}
