package com.ibm.bpshparis.ub;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String enrolReqString = "";
		String enrolRespString = "";
		String authReqString = "";
		String authRespString = "";
		
		Path enrolReqPath = Paths.get("/opt/wks/ub/res/enrol_request.json");
		Path enrolRespPath = Paths.get("/opt/wks/ub/res/enrol_response.json");
		Path authReqPath = Paths.get("/opt/wks/ub/res/auth_request.json");
		Path authRespPath = Paths.get("/opt/wks/ub/res/auth_response.json");

		Charset charset = StandardCharsets.UTF_8;
		
		if(Files.exists(enrolReqPath)){
			enrolReqString = new String(Files.readAllBytes(enrolReqPath), charset);
		}
		
		if(Files.exists(enrolRespPath)){
			enrolRespString = new String(Files.readAllBytes(enrolRespPath), charset);
		}
		
		if(Files.exists(authReqPath)){
			authReqString = new String(Files.readAllBytes(authReqPath), charset);
		}
		
		if(Files.exists(authRespPath)){
			authRespString = new String(Files.readAllBytes(authRespPath), charset);
		}		

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		

        EnrolRequest enrolRequest = mapper.readValue(enrolReqString, EnrolRequest.class);
        System.out.println(enrolRequest.getApp_version());
        System.out.println(enrolRequest.getCvid_client());
        System.out.println(enrolRequest.getCvid_uuid_tmp());
        for(BiometricRequest breq: enrolRequest.getData()){
        	System.out.println("breq.getBiometric_method=" + breq.getBiometric_method());
        	System.out.println("breq.getBiometric_data=" + breq.getBiometric_data());
        	System.out.println("breq.getLocal_status=" + breq.getLocal_status());
        }

        EnrolResponse enrolResponse = mapper.readValue(enrolRespString, EnrolResponse.class);
        System.out.println(enrolResponse);

        AuthRequest authRequest = mapper.readValue(authReqString, AuthRequest.class);
        System.out.println(authRequest);

        AuthResponse authResponse = mapper.readValue(authRespString, AuthResponse.class);
        System.out.println(authResponse);
        
        List<Integer> cvid_uuid = enrolResponse.getCvid_uuid();
        
        System.out.println("cvid_uuid=" + cvid_uuid);
        
        authRequest.setCvid_uuid(cvid_uuid);
        
        System.out.println(authResponse.getData());
        
        for(BiometricResponse br: authResponse.getData()){
        	System.out.println("br.getRemote_status=" + br.getRemote_status());
        }
        
        
	}

}
