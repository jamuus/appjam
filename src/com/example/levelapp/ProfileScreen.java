package com.example.levelapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ProfileScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_profile_screen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.profile_screen, menu);
		
		Bundle extras = getIntent().getExtras();
		String data = getIntent().getStringExtra("String");
		
		
		return true;
	}

}
