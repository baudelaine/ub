package com.ibm.bpshparis.ub;

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

		try {

			ObjectMapper mapper = new ObjectMapper();
			mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
			
			EnrolResponse er = mapper.readValue(args[0], EnrolResponse.class);
			List<Integer> cvid_uuid = er.getCvid_uuid();
			AuthRequest ar = new AuthRequest();
			ar.setCvid_uuid(cvid_uuid);
			
			List<BiometricRequest> data = new ArrayList<BiometricRequest>();

			for(BiometricResponse br: er.getData()){
				
				switch(br.getBiometric_method()){
					
					case "keystroke-dynamics":
						data.add(new KeystrokeDynamics());
						break;
						
					case "lock-pattern":
						data.add(new LockPattern());
						break;
						
					case "touch-id":
						data.add(new TouchId());
						break;
						
					case "face-recog":
						data.add(new FaceRecog());
						break;
						
					case "uw-consent":
						data.add(new UwConsent());
						break;
						
					case "android-fingerprint":
						data.add(new AndroidFingerprint());
						break;
						
					case "speaker-recognition":
						data.add(new SpeakerRecognition());
						break;
				
				}
				
			}
			
			ar.setData(data);
			
			result = Tools.toJSON(ar);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if(tlm.wouldReport(ITestLogManager.ALL)){
				tlm.reportMessage("SetAuthPostData() error=" + e.getMessage());
			}
		}
		
		if(tlm.wouldReport(ITestLogManager.ALL)){
			tlm.reportMessage("SetAuthPostData() result="  + result);
		}
		
		return result;
	}

}
