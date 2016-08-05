package com.austinkemper.zombiebird;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;


public class AndroidLauncher extends AndroidApplication {

	public FirebaseAnalytics mFirebaseAnalytics;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new ZBGame(), config);
		//mFirebaseAnalytics = new FirebaseAnalytics.getInstance(this);

	}

}
