package com.itcuties.android.apps;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.itcuties.android.apps.data.SMSData;

public class SMSActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_sms);
		
		TextView smsSenderNumber = (TextView)findViewById(R.id.smsDetailsNumberText);
		TextView smsBody	  	 = (TextView)findViewById(R.id.smsDetailsBodyText);
	
		// Get sms data
		SMSData sms = (SMSData)getIntent().getExtras().get("sms");
		
		// Display sms data
		smsSenderNumber.setText(sms.getNumber());
		smsBody.setText(sms.getBody());
		
	}
	
}
