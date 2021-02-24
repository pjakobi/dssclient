package com.tsn.Client;

import java.io.IOException;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.oasis_open.docs.dss_x.ns.base.Base64DataType;
import org.oasis_open.docs.dss_x.ns.core.ClaimedIdentityType;
import org.oasis_open.docs.dss_x.ns.core.DocumentType;
import org.oasis_open.docs.dss_x.ns.core.InputDocumentsType;
import org.oasis_open.docs.dss_x.ns.core.IntendedAudienceType;
import org.oasis_open.docs.dss_x.ns.core.ObjectFactory;
import org.oasis_open.docs.dss_x.ns.core.OptionalInputsSignType;
import org.oasis_open.docs.dss_x.ns.core.SignRequestType;
import org.oasis_open.docs.dss_x.ns.core.VerifyRequestType;
import org.oasis_open.docs.dss_x.ns.saml2.rewritten.NameIDType;
import java.util.Base64;
import com.tsn.Client.Config;
import java.lang.management.ManagementFactory;

public class Client {
	
	// Constants
	public static String REQ_COUNTER_DIR = "/var/run/dssclient";
	public static String CONFIG_FILE = "/etc/dssclient.conf";
	
	// Class variables
	static Locale locale;
	static ResourceBundle res;
	
	// Create name Id (= email)
	static private NameIDType createName(String email) {
		NameIDType name = new NameIDType();
		name.setFormat("urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress");
		name.setValue(email);
		return name;
	} // createName
	
	// Compute a request id
	static String requestId(String userId) throws UnknownHostException, IOException {
		Config cfg = new Config(CONFIG_FILE);
		return ManagementFactory.getRuntimeMXBean().getName() + "." + userId + "." + cfg.getRequestCounter();
	}
	
	static String exceptionMsg(String template, String param) throws NotDirectoryException {
		res.getString(template);
		Object[] messageArguments = { param };
		MessageFormat formatter = new MessageFormat("");
		formatter.applyPattern(res.getString(template));
		return formatter.format(messageArguments);
	}

	public static void main(String[] args) throws JAXBException, UnknownHostException, IOException {
			// Create Sign Request
			SignRequestType sr = new SignRequestType();
			JAXBContext jcSign = JAXBContext.newInstance(sr.getClass());     
			sr.setRequestID(requestId(System.getProperty("user.name")));
			
			// I18N
			locale = Locale.getDefault();
			res = ResourceBundle.getBundle("dssclient");
			MessageFormat formatter = new MessageFormat("");
			formatter.setLocale(locale);
			res.getString("Err.PutPref");
			
        	// Create Optional Inputs
       		OptionalInputsSignType optInput = new OptionalInputsSignType();
        	optInput.setLanguage("FR");
        	
        	// Claimed Identity
        	ClaimedIdentityType claimedId = new ClaimedIdentityType();
        	claimedId.setName(createName("pascal.jakobi@gmail.com"));
        	optInput.setClaimedIdentity(claimedId);
        	
        	// Intended Audience
        	IntendedAudienceType audience = new IntendedAudienceType();
        	audience.getRecipient().add(createName("djakobi@orange.fr"));
        	audience.getRecipient().add(createName("lola.jakobi@orange.fr"));
        	optInput.setIntendedAudience(audience);
        	
        	sr.setOptionalInputs(optInput);
        	
        	// Input Documents : import base 64 strings
        	byte[] encodedBytes = Base64.getEncoder().encode("/etc/hosts".getBytes());
        	Base64DataType b64 = new  Base64DataType();
        	b64.setValue(encodedBytes);
        	DocumentType doc = new DocumentType();
        	doc.setBase64Data(b64);
        	InputDocumentsType inDocs = new InputDocumentsType();
        	inDocs.getDocument().add(doc);
        	
        	sr.setInputDocuments(inDocs);
        	
        	
        	Marshaller mSign = jcSign.createMarshaller();
	        mSign.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        	mSign.marshal(sr, System.out);
        	// System.out.println();
        	
        	// Marshal Verify Request Type
        	
			//VerifyRequestType vr = new VerifyRequestType();
			//JAXBContext vrSign = JAXBContext.newInstance(vr.getClass());
        	//Marshaller mVrfy = vrSign.createMarshaller();
        	//mVrfy.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        	//mVrfy.marshal(vr, System.out);
        	//System.out.println();
        	
        	

        	// Marshal Optional Inputs
        	//ObjectFactory obj = new ObjectFactory();
        	//OptionalInputsSignType je =  obj.createOptionalInputsSignType();
        			
        	//marshaller.marshal(je, System.out);
        	//System.out.println();

	} // main

} // Client
