package com.itcuties.android.apps.data;

import java.io.Serializable;

/**
 * This class represents SMS.
 * 
 * @author itcuties
 *
 */
public class SMSData implements Serializable {

	private static final long serialVersionUID = 3185099950959560099L;
	
	// Number from witch the sms was send
	private String number;
	// SMS text body
	private String body;
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getBody() {
		return body;
	}
	
	public void setBody(String body) {
		this.body = body;
	}
	
}
