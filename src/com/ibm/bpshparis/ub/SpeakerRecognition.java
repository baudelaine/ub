package com.ibm.bpshparis.ub;

import java.util.Arrays;
import java.util.List;

public class SpeakerRecognition extends BiometricRequest {

	String biometric_method = "speaker-recognition";
	String local_status = "OK";
	List<Integer> biometric_data = Arrays.asList(72,35,192,22,167,20,15,131,167,55,72,57,192,22,179,20,253,187,163,23,72,51,192,86,163,22,31,187,163,15,72,41,200,22,167,20,47,139,163,39,8,186,225,18,179,4,205,179,163,23,8,187,225,18,179,4,223,187,35,23,72,51,193,50,179,4,15,187,35,22,72,170,225,86,187,4,207,179,163,19,64,41,11,23,163,22,255,11,225,47,0,41,11,86,163,22,127,139,225,47,64,41,203,20,166,22,107,75,161,47,64,169,75,86,162,22,123,235,225,43,72,163,193,118,166,12,15,203,163,51,72,161,192,86,163,22,63,139,161,43,8,162,193,86,162,22,47,235,163,51,104,179,228,126,163,204,55,155,37,91,40,170,225,86,170,66,255,227,169,51,40,178,228,86,163,70,221,243,161,19,104,179,196,86,163,22,189,235,33,51,8,187,100,118,179,70,221,179,163,17,104,177,228,124,163,30,253,139,53,39,72,179,192,22,163,20,31,187,35,3,8,177,97,118,163,86,221,235,33,1,8,177,224,118,163,70,221,187,33,19,68,33,138,84,166,26,43,203,229,43,68,33,138,116,164,154,59,75,101,43,8,33,192,84,166,26,63,139,33,7,0,33,202,84,166,30,43,203,229,47,0,33,138,116,164,26,123,203,229,43,0,33,202,84,163,22,63,139,225,47,0,32,142,84,164,154,59,203,225,43,0,32,138,84,164,22,59,75,225,43,8,184,9,87,179,22,255,251,161,3,8,184,9,87,179,22,253,171,225,1,8,184,9,87,179,22,253,187,161,3,8,184,9,87,179,22,221,171,161,3,8,56,41,50,179,68,217,234,66,20,9,168,105,54,178,68,219,235,163,34,9,60,45,50,183,68,217,234,66,4,8,185,9,54,179,86,217,235,39,35,8,168,193,86,191,22,111,195,163,51,8,170,193,86,163,6,15,251,163,51,8,41,193,22,167,20,15,139,167,55,8,41,200,22,183,20,77,139,167,55,0,9,10,151,245,22,253,11,225,47,8,56,10,87,243,22,221,171,225,7,0,44,11,85,227,22,189,171,209,45,4,12,10,215,181,22,255,75,193,37,8,168,97,86,178,6,93,227,163,51,8,168,101,86,178,6,217,227,163,51,0,168,3,86,186,22,217,227,241,35,8,184,9,87,162,22,153,171,177,3,8,170,101,118,58,68,73,227,166,50,65,168,109,118,190,76,75,235,167,50,8,168,1,119,186,86,255,251,185,17,8,184,13,118,179,86,217,171,177,51,40,186,97,87,227,2,156,167,241,1,8,40,0,87,243,22,157,163,225,7,0,40,195,86,166,22,111,203,161,35,8,48,0,119,163,22,158,170,33,3,8,58,236,178,51,76,221,138,6,148,8,184,164,50,179,64,217,250,34,48,8,50,228,178,55,76,77,170,6,180,8,178,236,54,183,74,201,202,226,6,0,9,11,85,233,22,255,11,161,43,0,40,11,85,165,22,255,75,225,47,0,9,11,85,224,22,255,11,241,47,0,41,11,85,233,54,247,15,241,9,0,12,11,85,234,55,255,239,241,41,2,40,11,69,226,23,187,235,241,41,0,136,3,85,234,23,253,239,241,41,0,168,11,85,234,23,253,239,241,9,0,8,11,85,164,23,251,79,241,43,0,40,11,69,172,23,251,75,241,43,0,1,11,85,164,51,58,75,241,107,0,33,11,85,164,151,123,75,241,107,1,44,11,213,228,23,251,107,241,41,0,8,11,213,236,55,255,79,241,43,0,168,11,85,234,55,249,107,241,43,0,12,11,85,228,23,59,75,241,43,2,64,2,69,194,50,180,175,241,9,2,136,35,69,226,51,188,239,249,1,34,145,4,85,226,35,252,143,241,33,2,193,2,85,226,50,180,143,241,9,2,9,10,85,225,55,244,175,241,9,2,77,10,85,227,54,188,175,209,13,2,136,11,69,234,51,248,239,241,9,2,136,2,85,235,54,252,175,241,1,2,32,10,69,226,51,184,235,241,41,2,168,11,69,162,19,184,235,241,41,0,128,6,69,160,147,59,75,241,107,2,228,10,69,166,51,186,207,241,105,6,1,10,85,164,147,182,75,241,107,6,1,10,85,160,179,180,75,241,107,0,4,10,245,164,35,221,203,245,33,4,128,142,101,164,131,250,207,241,105,0,128,2,101,178,3,220,239,240,33,0,160,3,69,234,23,189,227,249,43,4,36,142,101,180,131,155,203,224,33,0,32,10,69,160,23,187,235,241,41,0,32,14,101,164,139,154,203,240,105,0,32,11,101,162,147,187,235,240,41,0,168,35,68,166,3,154,227,241,35,2,168,15,101,178,151,155,235,240,33,1,8,11,244,164,147,107,75,225,43,1,8,11,244,164,11,107,75,245,43,0,8,11,244,180,11,75,75,229,39,0,8,11,85,164,19,251,75,241,43,0,32,10,148,165,22,27,75,197,47,0,32,10,212,165,22,27,75,245,47,0,1,10,180,165,30,123,75,229,47,0,4,10,245,165,22,217,203,213,37,10,170,113,71,203,2,156,167,248,17,10,178,101,102,178,66,216,227,176,17,40,130,164,100,166,203,8,203,182,51,8,160,164,100,178,203,219,235,170,49,1,40,165,228,182,203,75,203,230,50,1,224,175,100,182,203,43,233,184,107,0,224,13,101,178,247,187,232,58,105,0,32,13,100,130,223,27,232,62,123,11,4,12,244,181,10,216,202,198,37,14,4,12,245,165,43,220,206,116,37,1,0,10,244,164,171,122,73,116,107,5,4,10,245,180,35,255,77,97,109,249,255,104,23,243,22,221,162,193,134,104,187,113,95,235,22,157,179,225,7,0,40,203,86,190,20,107,227,227,50,8,162,192,86,163,22,29,179,163,51,3,68,37,228,4,235,8,234,212,97,3,192,37,228,166,235,72,227,252,113,3,68,36,229,132,43,24,207,212,97,3,68,47,228,164,235,88,203,212,97,3,100,44,229,148,235,152,234,212,97,3,100,47,228,148,235,90,234,212,97,3,192,39,228,20,235,72,233,252,113,3,68,47,229,164,235,88,233,244,97,46,212,4,101,129,171,148,204,112,65,6,68,12,229,128,171,212,204,112,73,6,68,140,229,132,235,154,204,116,97,6,68,14,229,133,171,222,204,112,97,3,196,38,229,224,35,216,239,212,97,7,68,6,229,228,35,252,207,212,97,6,212,36,101,128,35,212,238,240,65,11,212,44,245,176,107,216,234,212,33,3,160,15,228,60,235,107,73,190,123,3,128,15,228,60,235,107,73,190,123,3,160,39,228,190,235,43,225,188,123,3,128,7,228,60,235,107,201,190,115,3,100,15,229,164,235,26,233,252,105,3,100,47,228,164,235,58,233,252,105,3,0,15,228,172,251,107,73,188,107,1,128,15,228,60,235,107,73,188,123,3,0,15,228,180,235,74,203,244,99,3,8,15,228,180,235,107,73,244,105,3,136,15,244,60,235,73,203,246,115,3,136,47,228,60,235,105,201,182,113,3,68,15,229,164,251,122,73,244,107,3,68,15,229,180,235,90,105,252,105,3,232,15,228,36,251,107,73,244,107,19,64,15,204,44,251,34,73,252,107,10,160,37,101,146,195,153,235,250,49,10,224,164,101,130,131,154,251,248,1,8,162,165,99,146,195,153,246,186,17,10,160,37,97,146,195,152,242,186,49,10,232,37,99,154,195,138,226,186,48,2,224,37,101,146,227,24,226,250,48,2,32,37,101,150,235,10,235,254,49,2,96,37,101,146,227,152,234,248,33,2,224,33,69,130,35,152,231,248,1,42,160,37,69,162,3,152,239,248,1,42,240,37,99,146,66,152,246,248,1,2,236,39,101,178,3,152,239,248,1,10,96,164,100,134,139,26,235,244,99,0,224,165,101,130,195,154,255,184,73,2,100,165,101,150,235,154,235,248,49,0,32,135,101,150,131,155,235,248,41,3,0,15,228,180,235,72,235,244,113,3,136,39,229,182,107,88,235,244,49,2,32,15,229,180,179,91,235,244,105,3,4,14,229,176,227,216,203,244,33,10,196,36,100,130,107,152,239,244,33,2,64,163,69,130,43,154,253,248,73,2,228,36,68,226,35,152,175,240,1,38,228,46,69,166,3,152,235,240,33,3,44,47,228,180,203,90,234,246,33,3,44,47,228,180,203,74,235,212,33,3,204,47,229,180,107,216,203,244,33,3,136,47,228,180,11,72,195,240,35,3,224,37,100,50,235,73,232,190,115,3,224,45,236,50,237,73,224,190,114,2,160,100,236,32,235,72,234,54,115,1,160,173,228,182,203,75,203,166,50,6,4,10,69,197,51,158,239,240,105,6,4,10,197,197,51,190,79,241,105,6,64,14,69,224,51,184,207,241,105,6,196,38,69,226,51,152,239,240,65,6,68,10,69,224,51,180,47,241,73,2,201,2,85,232,51,244,47,241,9,0,100,11,69,160,179,242,77,241,75,0,64,11,69,164,179,178,77,241,75,6,68,138,101,132,155,178,92,248,105,6,96,134,101,132,139,26,236,248,105,6,32,142,101,129,147,154,252,248,105,2,100,15,69,132,179,186,109,248,105,3,12,11,229,180,179,251,73,244,105,3,4,14,229,180,187,251,73,212,105,6,4,10,197,164,35,122,79,240,105,2,68,14,197,160,179,208,239,240,65,2,0,2,69,224,51,252,207,241,1,4,0,2,69,196,51,254,207,241,13,6,64,2,69,194,51,244,175,249,9,6,76,2,65,202,51,252,167,249,13,4,12,10,245,164,35,254,79,225,37,12,4,140,245,181,3,222,206,96,33,2,12,10,69,224,51,254,111,241,9,2,13,10,213,225,55,244,13,209,13,6,213,2,69,225,51,180,143,241,73,6,68,0,245,160,35,220,207,240,1,2,213,10,213,225,51,252,143,241,1,6,68,2,229,132,43,246,204,112,73,4,4,10,229,165,51,158,78,240,109,4,5,10,165,133,190,22,76,85,109,4,5,10,149,97,54,244,13,81,77,0,4,10,229,161,51,254,79,241,9,3,9,11,245,44,251,123,73,245,105,3,0,11,213,164,187,122,73,245,107,17,5,11,212,36,191,115,73,213,111,3,1,10,244,36,191,115,73,245,111,0,0,11,244,164,187,107,73,245,107,4,8,11,213,164,19,251,73,225,47,2,0,11,196,164,187,50,73,245,107,1,8,11,213,36,59,107,73,245,107,4,4,138,245,165,23,255,77,65,15,5,4,10,245,164,147,187,75,241,47,4,5,10,245,165,159,55,73,213,109,0,1,10,245,36,191,119,73,245,109,0,8,203,212,174,73,107,203,167,59,1,8,203,244,60,201,107,73,175,122,1,8,203,148,36,29,43,73,231,111,1,8,11,244,164,139,107,75,229,43,3,229,109,172,38,233,72,235,214,99,3,229,44,228,52,235,88,202,86,97,1,8,14,181,53,239,217,75,214,52,0,8,11,213,164,55,123,75,245,47,1,44,11,181,180,23,251,75,213,37,4,4,138,212,164,18,187,75,225,47,4,1,138,181,165,22,127,73,97,47,4,4,10,245,164,27,251,73,197,47,7,196,15,101,152,243,178,100,152,202,3,44,15,229,180,183,27,105,244,105,2,160,15,229,188,243,123,105,252,105,3,96,47,228,36,251,106,105,244,107,1,4,15,244,164,139,106,75,244,107,1,8,11,244,180,35,123,203,245,41,1,12,11,212,36,59,106,73,213,111,0,0,11,149,164,19,99,73,225,111);
	
	@Override
	public List<Integer> getBiometric_data() {
		// TODO Auto-generated method stub
		return this.biometric_data;
	}
	@Override
	public String getLocal_status() {
		// TODO Auto-generated method stub
		return this.local_status;
	}
	@Override
	public String getBiometric_method() {
		// TODO Auto-generated method stub
		return this.biometric_method;
	}

}