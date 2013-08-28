package com.example.loggingexample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

	public static final String TAG = "LoggingExample";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Log.v(TAG, "VERBOSE");
		Log.i(TAG, "INFO");
		Log.d(TAG, "DEBUG");
		Log.w(TAG, "WARN");
		Log.e(TAG, "ERROR");
		
		
		
		if( 1 == 0 ){
			Log.wtf(TAG, "Uh oh");
		}
		
		
	}



}
