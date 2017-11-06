package com.ibm.bpshparis.ub;

import java.util.Arrays;
import java.util.List;

public class FaceRecog extends BiometricRequest {

	String biometric_method = "face-recog";
	String local_status = "OK";
	List<Integer> biometric_data = Arrays.asList(223,236,151,82,161,232,81,219,101,90,89,237,29,23,99,117,223,228,178,2,225,248,85,209,101,82,9,253,44,39,227,118,183,240,135,19,43,171,160,96,116,234,190,253,24,5,250,210,183,240,135,19,47,171,160,96,244,200,188,189,8,5,122,210,191,240,132,19,102,170,231,224,249,202,56,189,164,5,250,82,183,240,134,147,109,171,230,224,120,200,60,189,142,5,146,19,207,132,180,2,161,56,19,251,73,92,105,167,237,31,227,116,247,100,212,22,146,11,178,208,253,42,166,125,200,101,178,118,213,160,192,2,134,11,50,240,223,122,130,93,193,117,178,50,223,236,7,18,37,200,48,209,117,216,237,239,44,15,107,242,203,228,182,3,33,184,21,211,125,210,9,237,44,135,235,116,181,240,145,19,226,27,32,208,253,168,158,253,140,69,187,50,215,100,212,20,146,27,178,208,253,56,166,253,192,69,178,118,197,164,128,83,238,43,50,224,255,104,128,157,128,117,179,20,223,236,150,18,161,57,81,221,81,90,56,175,140,6,43,244,197,164,128,83,238,43,50,224,213,104,196,141,132,117,123,84,215,132,194,81,164,11,58,240,95,106,132,141,197,45,51,84,151,102,148,20,162,27,242,208,253,232,164,253,196,69,178,118,219,252,22,146,33,25,26,253,27,186,232,178,173,7,33,108,253,132,192,81,230,51,50,224,223,74,132,157,132,109,186,84,223,252,150,80,37,121,22,89,81,154,240,175,44,14,187,247,219,156,52,211,37,137,53,251,89,218,108,111,236,7,161,115,197,132,64,81,231,27,50,224,221,106,132,141,196,45,187,84,223,100,246,54,161,60,85,218,81,90,53,245,29,23,203,112,191,242,134,213,125,163,230,192,125,72,184,189,190,5,146,83,143,228,178,11,169,184,85,249,54,82,8,165,14,135,235,118,255,242,208,54,167,27,112,208,253,104,166,189,133,77,187,54,203,244,148,25,227,56,93,249,91,146,40,157,172,7,235,100,255,226,134,48,36,10,112,212,121,104,172,172,14,109,51,16,159,228,242,10,243,188,85,209,116,82,41,237,12,135,131,118,223,244,59,146,133,120,88,248,103,124,160,173,172,15,3,62,159,228,163,2,185,248,116,217,116,90,45,207,13,167,99,114,191,246,146,16,246,26,114,248,253,122,180,45,204,199,55,118,183,228,145,17,230,10,98,248,253,216,188,125,44,5,90,115,143,236,146,3,49,184,85,217,124,218,61,239,12,143,171,246,245,116,144,83,210,11,130,208,253,234,150,125,168,69,186,50,247,116,148,17,230,11,162,208,253,234,174,253,168,101,187,112,171,228,183,2,249,184,85,209,118,82,29,207,13,167,171,244,139,244,178,11,105,185,81,251,124,202,60,237,141,143,43,247,167,225,132,17,246,11,224,240,253,232,184,125,164,69,186,114,191,240,131,23,46,139,226,192,125,200,188,173,12,5,82,18,167,224,148,17,246,11,224,240,253,168,186,61,164,85,154,114,221,164,225,35,172,11,50,229,87,88,168,141,196,109,51,128,255,240,132,17,194,39,224,240,249,232,170,29,172,69,242,16,207,230,187,2,1,248,88,251,103,124,42,37,175,15,99,56,143,228,179,11,249,188,85,91,126,82,61,239,29,143,239,246,223,164,196,19,166,47,50,224,223,250,160,157,132,101,178,0,159,228,178,2,241,184,85,217,117,82,41,237,13,143,163,244,207,236,150,19,225,184,85,209,119,82,9,237,13,23,235,112,143,228,182,2,161,184,85,217,116,218,57,237,12,151,171,116,219,212,180,19,33,248,61,243,222,154,40,253,173,7,227,100,181,229,193,16,226,139,162,192,253,234,143,253,152,101,186,146,143,228,146,3,49,185,117,217,124,218,61,239,12,143,163,246,203,196,180,19,33,248,29,211,92,146,44,253,173,7,163,117,206,248,8,17,37,25,52,240,95,218,164,121,173,31,35,99,255,100,128,20,243,2,98,208,253,233,140,253,44,109,51,211,143,236,210,3,177,184,84,249,102,94,32,111,63,175,7,112,181,100,144,21,226,11,194,208,253,234,154,189,176,69,146,18,215,140,148,16,38,10,51,209,217,90,236,61,197,23,178,116,222,204,192,135,19,184,55,209,221,83,45,249,172,151,161,119,237,164,134,209,125,187,58,96,95,106,212,140,76,47,51,85,159,228,178,11,177,184,85,209,124,90,41,237,141,135,163,118,235,228,166,3,233,248,125,213,118,82,9,237,13,39,163,116,159,244,146,11,177,185,85,249,30,92,32,173,158,143,131,118,159,252,146,19,179,56,80,89,93,218,48,111,44,143,203,242,255,242,163,86,161,170,82,208,117,106,168,189,46,45,227,114,223,240,132,147,33,186,52,240,111,74,174,113,190,31,163,114,143,230,146,2,233,184,85,249,93,80,56,141,140,139,239,116,199,132,228,227,229,59,52,224,93,74,140,189,132,63,163,157,235,228,162,3,233,250,125,209,126,82,9,237,13,39,163,116,183,112,130,148,45,139,98,208,237,202,188,189,12,44,179,211,219,166,51,18,193,56,88,216,119,62,200,141,141,135,99,117,181,229,132,50,226,139,226,192,253,232,141,253,152,101,18,144,222,248,132,215,33,216,52,81,68,218,164,253,44,15,163,114,245,228,146,17,235,58,18,80,253,99,156,205,140,103,19,119,181,228,132,48,226,139,226,208,253,232,136,253,148,69,82,16,251,228,180,11,193,248,93,213,87,154,40,157,143,7,171,116,223,196,182,17,99,56,21,241,89,82,172,173,143,7,171,116,159,100,246,4,241,184,80,91,125,82,33,103,60,47,223,114,255,100,132,16,226,2,242,192,253,234,138,189,132,101,146,16,203,228,18,19,33,57,21,249,126,154,60,41,173,135,43,231,223,228,162,3,239,58,60,213,109,57,204,237,13,5,35,87,223,228,148,130,129,58,112,212,93,120,172,121,142,23,35,117,183,224,132,19,226,11,162,240,252,232,158,253,168,85,179,50,245,229,196,35,230,11,32,224,125,106,142,125,152,117,155,18,143,228,178,11,185,188,85,217,86,82,9,149,15,167,171,116,190,211,171,150,41,234,80,208,101,74,168,63,62,45,226,82,159,228,178,10,177,186,81,220,126,120,44,109,30,191,131,118,238,83,174,211,249,226,80,208,111,106,170,125,190,61,226,114,143,204,146,11,49,184,85,209,126,82,29,233,13,135,167,244,139,244,19,1,121,184,21,250,126,82,24,136,13,167,175,247,245,100,196,34,226,2,34,208,125,104,142,253,24,109,27,178,223,228,16,18,33,250,93,209,252,154,61,253,141,7,163,118,143,228,147,10,177,184,85,249,84,88,32,253,140,191,139,118,143,164,228,163,169,170,34,228,77,74,172,185,20,57,35,145,183,231,128,17,194,47,194,240,253,232,154,61,184,213,210,16,190,96,199,52,181,139,98,213,109,122,173,255,44,45,59,211,235,228,182,17,105,248,93,245,82,154,104,157,141,7,59,108,193,164,65,99,173,155,50,224,119,106,133,205,129,45,51,154,222,252,179,2,129,56,82,248,95,122,36,41,172,175,3,55,245,228,128,16,231,58,112,208,255,35,140,237,141,199,59,118,159,229,129,1,177,168,112,248,124,218,168,109,12,143,99,118,255,230,130,20,110,138,250,208,253,233,188,189,132,5,146,16,215,252,145,18,39,40,114,252,95,122,38,105,172,143,11,243,239,228,150,16,164,42,2,217,241,250,248,181,164,17,249,80,231,166,2,1,253,58,122,120,127,106,212,140,141,47,39,85,199,101,240,131,243,58,23,208,95,86,164,125,158,55,131,116,143,100,147,11,113,184,85,217,126,82,21,237,13,167,135,118,199,164,134,81,108,171,42,228,127,106,44,137,12,47,51,149,203,252,144,17,117,185,53,248,94,202,124,105,165,135,171,229,191,228,166,9,233,188,117,213,126,222,8,205,14,39,99,116,193,164,2,3,173,59,32,228,127,106,173,201,12,47,51,151,143,100,179,3,121,184,85,217,126,82,25,237,13,167,135,118,203,244,18,17,53,185,29,248,94,74,124,169,173,135,171,245,207,228,144,10,49,56,213,249,86,88,32,241,12,151,137,116,207,196,148,139,17,248,53,241,31,94,44,121,159,151,129,118,181,101,132,17,226,139,194,192,253,232,152,253,176,117,146,18,181,103,132,81,224,171,226,192,253,234,152,253,184,85,82,16,222,196,244,143,17,250,245,209,23,94,160,113,30,23,129,116,197,229,132,3,197,43,162,224,253,234,138,157,168,117,179,16,159,244,179,0,241,60,81,249,125,90,32,47,12,175,39,246,231,228,148,81,118,139,234,208,252,170,176,61,164,85,146,112,231,228,132,147,115,50,50,208,125,106,132,253,12,47,187,242,159,228,179,11,177,184,117,209,124,90,45,239,13,135,35,118,255,246,146,131,241,122,85,220,103,118,188,109,175,39,171,117,207,228,148,18,102,11,132,208,253,168,160,249,188,87,177,32,207,228,132,130,242,42,18,208,125,122,172,121,158,119,161,48,238,228,148,10,161,250,125,213,86,26,41,245,15,7,139,116,247,228,128,98,129,11,114,212,253,106,136,173,133,37,179,86,207,236,242,67,225,248,21,209,85,210,5,237,141,23,225,116,239,228,148,19,224,139,125,229,209,170,40,189,172,5,58,96,255,230,163,0,200,184,122,213,124,106,232,237,15,37,3,180,143,228,132,2,162,43,32,225,209,248,168,221,164,101,123,48,255,71,134,177,248,171,98,220,105,106,60,189,190,37,18,17,223,228,148,18,129,10,56,209,244,56,169,253,141,23,179,116,222,228,193,135,163,186,22,208,125,122,141,253,156,55,147,114,197,132,194,97,173,27,50,192,127,106,133,141,133,61,179,217,183,228,129,33,162,139,98,209,252,106,172,237,0,37,50,83,195,240,145,19,39,187,52,240,124,138,44,125,141,135,187,114,155,244,178,11,67,188,93,241,222,214,40,221,143,135,231,116,223,228,24,214,115,250,84,81,109,32,36,109,141,151,171,126,255,192,167,20,40,138,98,208,117,106,172,255,15,37,35,83,133,164,4,49,44,175,34,228,95,106,140,137,4,45,99,144,195,228,20,131,113,185,21,249,94,74,52,57,157,143,167,119,183,229,133,18,242,138,162,192,253,232,128,253,156,117,147,114,207,212,146,11,17,184,85,241,86,82,44,249,141,135,171,116,191,103,146,35,249,189,81,252,126,90,24,237,158,167,7,52,151,172,152,19,165,57,112,251,73,216,60,47,204,206,47,231,223,244,154,11,17,185,117,217,127,58,36,105,141,143,139,119,199,100,132,18,164,43,130,232,89,232,190,153,180,127,187,48,218,228,244,26,131,114,125,229,211,154,40,157,172,7,107,120,247,116,134,147,243,171,194,224,248,232,186,189,186,5,146,82,195,136,34,83,41,58,18,208,119,74,12,173,141,39,163,117,223,228,179,14,163,58,82,208,125,90,60,237,29,199,131,242,239,224,150,18,162,35,28,244,242,248,175,253,172,101,187,40,219,228,162,9,193,184,81,244,254,222,40,173,142,167,103,52,223,164,241,2,131,42,50,192,223,122,0,173,141,255,167,212,181,229,197,34,226,139,32,192,253,248,143,253,24,101,26,146,198,140,86,130,53,152,54,240,95,78,164,185,172,15,163,117,245,100,197,52,242,3,34,208,253,233,143,253,40,109,50,146,191,228,132,17,232,171,106,197,252,234,232,237,68,5,114,16,145,229,133,34,160,139,32,197,117,248,141,237,24,37,26,146,199,164,208,2,165,63,162,224,221,106,164,157,140,127,187,208,203,244,150,17,99,187,29,240,127,234,40,189,140,7,187,112,255,244,144,3,67,186,117,209,125,202,44,237,140,7,163,114,143,196,244,139,17,248,85,209,95,86,44,121,159,183,161,118,159,100,150,18,165,11,130,218,249,248,187,61,244,87,249,112,151,116,150,22,161,27,0,240,213,248,188,253,156,69,187,242,203,244,18,17,117,189,29,248,94,74,116,136,13,143,175,247,203,228,178,3,33,57,21,248,92,218,60,169,140,135,171,245,191,228,132,17,200,175,234,209,253,234,136,189,172,5,114,16,189,229,133,48,232,139,98,197,125,232,233,237,20,37,82,146,203,248,16,17,117,59,20,248,126,138,52,188,165,135,175,231,218,228,182,11,129,248,125,245,86,222,44,253,142,7,43,120,203,196,182,11,225,248,93,245,91,218,44,157,142,7,43,124,223,228,148,16,33,90,121,248,81,24,41,189,174,3,43,116,222,228,129,3,161,250,52,209,124,218,13,253,140,7,163,114,245,229,132,160,230,3,34,212,125,106,141,248,24,117,147,30,207,244,179,10,209,184,80,217,95,90,32,45,141,135,175,118,167,228,132,2,162,139,32,193,245,248,173,253,140,69,187,50,183,229,135,17,124,171,96,64,125,202,252,237,12,5,58,83,223,244,178,3,177,61,81,253,126,90,48,13,13,175,15,246,222,228,156,207,17,88,189,241,23,158,32,241,190,23,129,112,215,64,148,131,180,171,34,208,125,106,44,125,60,37,179,211,191,228,132,49,104,163,107,197,125,234,104,237,6,37,50,24,175,228,132,17,104,163,107,197,253,234,104,189,6,33,114,16,181,229,148,81,194,11,194,208,253,234,154,253,184,101,178,18,214,228,148,206,17,26,181,241,23,152,164,113,159,23,129,114,247,228,132,18,226,155,224,208,252,234,136,253,168,37,155,48,181,101,196,0,226,11,226,192,253,234,142,125,176,85,178,208,239,228,134,17,104,187,120,208,252,234,172,237,132,5,178,114,190,196,164,53,104,235,106,213,252,234,105,237,70,37,50,16,203,244,153,11,49,249,117,249,94,26,52,105,173,143,139,247,247,225,134,163,232,163,112,244,125,250,172,249,158,85,51,57,231,4,196,225,116,171,34,224,125,74,140,253,16,109,179,209,183,229,132,17,194,171,226,208,253,234,152,189,240,69,146,16,207,244,133,19,119,187,50,240,127,202,228,253,141,7,63,114,139,196,146,11,57,188,85,249,124,210,60,239,13,135,171,244,175,231,179,1,249,184,81,240,124,88,24,237,140,175,71,116,207,228,147,11,113,188,85,217,126,82,48,237,13,135,143,118,255,229,134,36,224,131,114,208,253,232,172,253,159,53,178,147,245,228,134,34,160,139,114,212,253,234,141,237,153,117,179,147,191,229,130,3,225,187,112,240,124,218,44,109,172,135,99,114,159,228,193,10,161,184,112,209,124,88,41,237,28,183,195,118,190,196,164,53,72,187,123,213,252,234,104,173,70,5,50,16,191,229,132,17,202,171,226,208,253,234,152,189,240,101,146,16,181,229,133,34,168,139,32,196,245,248,141,237,24,37,18,146,219,212,148,19,99,248,29,243,211,214,40,217,175,23,227,112,181,228,132,1,194,155,224,208,253,234,136,253,152,37,50,50,149,228,133,2,226,139,224,192,253,248,136,253,136,101,27,50,143,164,178,1,121,188,53,248,127,90,12,137,12,47,167,245,215,252,144,147,53,219,189,240,92,154,60,121,181,151,131,99,181,229,133,32,168,139,32,197,253,234,141,237,16,101,18,146,191,98,134,2,240,171,98,208,117,106,188,253,44,101,179,82,159,229,193,3,161,184,112,209,124,88,9,237,28,191,67,118,203,196,163,3,97,184,55,209,127,98,4,237,141,135,163,119,203,252,19,19,49,249,29,250,124,130,124,105,165,135,171,231,165,229,197,34,160,139,160,192,252,186,143,253,144,101,50,18,215,252,147,87,39,57,182,88,127,216,52,249,44,135,139,243,203,228,180,11,161,184,117,244,86,218,44,157,140,39,43,112,143,228,162,3,121,252,21,193,119,66,1,221,15,63,163,116,223,228,150,211,53,185,53,255,88,188,36,186,190,15,169,119,195,228,134,34,165,59,32,212,125,250,237,249,29,63,43,187,239,231,134,177,112,162,118,208,105,74,172,191,190,21,49,25,191,240,134,17,99,186,93,209,117,202,56,173,172,7,163,114,207,228,146,11,49,184,85,217,30,82,33,249,15,151,167,116,181,101,132,17,226,11,226,192,253,234,138,125,168,117,146,50,143,4,50,128,13,185,19,208,127,106,37,136,12,47,131,183,254,228,162,6,1,250,125,213,124,122,141,237,15,39,131,118,255,228,132,34,232,139,98,213,125,106,140,253,30,37,18,19,199,228,244,130,70,59,16,224,95,106,133,121,152,119,147,124,199,224,132,131,113,32,18,80,45,234,172,249,30,31,165,33,165,229,132,17,242,139,162,192,253,234,154,125,176,117,146,18,202,192,164,160,40,250,125,213,108,106,173,249,30,33,19,29,223,228,148,90,129,90,125,221,212,184,40,189,142,3,43,52,181,228,133,32,224,139,98,213,124,234,141,237,12,37,18,146,203,236,146,11,49,184,85,219,124,82,60,239,141,135,167,244,255,231,134,177,252,163,106,212,105,106,60,189,190,1,18,17,238,196,134,166,32,234,95,212,64,124,172,250,158,23,33,45,188,228,133,36,168,203,106,197,124,234,201,237,20,37,18,146,201,180,18,17,125,189,21,120,95,66,84,136,141,175,175,245,231,229,148,81,242,187,226,208,253,234,176,253,180,69,146,82,254,224,135,52,104,138,106,213,108,106,201,237,70,37,18,211,181,229,133,32,168,139,98,197,125,248,201,237,20,37,82,146,190,228,164,53,104,251,122,213,252,234,9,233,68,37,50,16,255,228,164,53,72,171,123,213,252,234,40,173,70,37,50,16,255,230,182,17,128,170,121,213,221,248,40,173,142,1,35,52,239,228,148,25,104,251,125,213,116,170,40,189,166,7,19,112,223,224,146,3,115,58,86,208,125,66,180,45,13,231,167,118,222,228,145,199,49,186,188,209,125,74,61,253,45,7,131,118,239,229,148,81,116,139,234,240,253,170,48,61,164,85,146,81,159,228,147,23,243,184,114,209,125,218,60,237,44,7,155,243,191,229,135,49,104,139,98,213,125,235,205,237,13,37,18,82,173,229,132,17,232,139,226,193,252,234,136,253,144,37,18,16,202,244,145,19,36,185,52,240,93,74,36,173,172,7,163,243,181,229,133,49,226,139,226,192,253,234,136,253,24,101,18,146,247,228,132,147,182,27,50,244,125,106,164,61,140,7,19,86,207,166,146,1,225,171,240,252,84,248,48,157,140,223,107,52,255,224,129,20,35,139,98,208,253,234,172,253,45,5,179,82,203,172,16,147,37,169,54,242,91,218,180,169,132,50,161,103,254,196,164,21,200,187,106,213,252,234,8,237,76,5,50,16,203,228,162,2,121,176,21,112,127,210,140,232,31,183,39,116,197,228,226,35,241,186,20,208,95,82,132,109,29,127,163,118,213,228,192,2,163,11,32,224,245,232,143,245,140,101,187,50,181,229,133,49,224,139,98,209,252,234,136,253,8,37,18,18,191,228,133,2,162,139,162,208,253,106,140,253,12,37,147,82,165,101,132,17,242,171,194,192,253,234,154,125,176,117,146,18,165,101,132,17,242,171,194,208,253,234,152,61,176,117,146,16,213,228,193,34,163,155,160,192,253,251,143,253,152,101,155,178,247,224,148,17,182,27,114,240,253,170,180,189,136,5,179,86,247,224,148,17,182,27,118,240,253,42,180,61,172,5,178,86,223,228,156,141,49,58,52,248,93,88,160,121,62,31,133,118,181,229,133,18,224,155,162,193,252,234,141,253,24,37,26,178,159,228,132,16,160,139,114,197,117,232,168,237,4,101,58,50,139,228,145,3,161,249,53,241,124,218,45,233,13,167,171,242,207,164,160,9,193,190,121,224,223,94,40,157,142,39,103,48,203,180,18,17,125,61,29,120,94,66,84,136,141,175,175,245,189,229,133,32,224,139,98,213,252,234,141,237,24,37,18,146,239,192,133,113,100,170,58,192,213,106,236,189,36,49,115,85,188,229,135,33,104,171,106,213,124,235,205,237,21,37,18,146,222,228,220,142,17,48,245,209,23,30,160,113,159,23,133,116,195,252,18,211,53,249,61,248,94,42,52,40,141,15,171,247,255,240,129,22,35,154,116,208,125,202,172,253,45,39,163,118,251,228,132,50,160,139,127,213,116,250,109,237,45,7,27,109,247,228,135,34,224,139,98,212,124,234,140,253,24,5,18,22,229,229,129,19,117,139,34,192,125,202,172,253,12,37,251,211,245,228,129,36,224,139,34,197,252,232,141,237,8,37,18,214,251,100,182,50,161,136,95,221,113,216,104,173,100,37,51,241,183,241,134,17,242,11,112,240,253,234,188,253,172,69,187,114,252,229,161,34,168,139,96,213,124,232,141,237,25,37,18,210,227,244,148,17,116,169,245,240,124,138,124,61,165,135,178,115,203,228,148,27,37,89,125,253,18,154,124,57,172,7,171,105,223,236,20,3,19,155,180,208,127,250,36,249,29,55,131,114,142,36,34,128,25,188,189,244,95,122,161,136,30,47,135,118,255,224,179,54,13,139,91,212,125,248,36,173,4,37,3,151,165,101,132,81,242,11,194,192,253,234,146,125,176,117,146,16,223,252,133,3,49,153,116,81,124,202,188,121,13,7,11,114,159,228,132,32,161,171,98,212,124,248,40,237,28,125,3,54,238,228,144,28,112,187,255,213,85,58,33,189,166,7,147,112,207,244,152,139,17,56,116,117,23,138,44,57,140,159,161,96,189,229,132,49,224,139,226,209,252,234,137,237,136,101,18,144,223,228,145,22,51,154,118,209,125,40,164,237,141,7,131,118);

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