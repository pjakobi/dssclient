package com.tsn.Client;


import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.prefs.*;
public class Config {
	private Preferences prefs;
	Config(String fname) throws UnknownHostException {
		prefs = Preferences.userNodeForPackage(this.getClass());
		String requestCounterPrefix = prefs.get("DSS_REQUEST_PREFIX", "");
		int requestsCounter = prefs.getInt("DSS_REQUEST_COUNTER", -1);
		
		if (requestCounterPrefix.length() == 0) { // prefix not set : set it to "<fqdn> + <user id> + <count>
			requestCounterPrefix = InetAddress.getLocalHost().getCanonicalHostName() + "_" + System.getProperty("user.name");
			requestCounterPrefix.replace('.', '_');
			prefs.put("DSS_REQUEST_PREFIX",requestCounterPrefix);
		}
		if (requestsCounter < 0) { // start with 0
			requestsCounter = 0;
			prefs.putInt("DSS_REQUEST_COUNTER",requestsCounter);
		}
		
	} // Config
	
	String getRequestCounterPrefix() throws IOException {
		String requestCounterPrefix = prefs.get("DSS_REQUEST_PREFIX", "");
		if (requestCounterPrefix.length() == 0) { // internal error
			throw new IOException("Read preferences error -  DSS_REQUEST_PREFIX");
		}
		return requestCounterPrefix;
	}
	int getRequestCounter() throws IOException {
		int requestCounter = prefs.getInt("DSS_REQUEST_COUNTER", -1);
		if (requestCounter < 0) { // internal error
			throw new IOException("Read preferences error -  DSS_REQUEST_COUNTER");
		}
		prefs.putInt("DSS_REQUEST_COUNTER", requestCounter+1);
		return requestCounter;
	}
}
