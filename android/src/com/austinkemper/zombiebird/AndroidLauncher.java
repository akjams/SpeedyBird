package com.austinkemper.zombiebird;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.austinkemper.zbhelpers.AssetLoader;


public class AndroidLauncher extends AndroidApplication {

	public static FirebaseAnalytics mFirebaseAnalytics;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new ZBGame(), config);
		mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
		//sendScoreToFB();
		sendAppOpenedAnalytics();


	}

	private void sendAppOpenedAnalytics(){
		Bundle bundle = new Bundle();
		bundle.putString("app_opened", "OPENED");
		mFirebaseAnalytics.logEvent("HelloEvent",bundle);
	}



//	public static void sendScoreToFB(){
//		Bundle bundle = new Bundle();
//		int score = AssetLoader.getHighScore();
//		bundle.putInt(FirebaseAnalytics.Param.SCORE, score);
//		mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.POST_SCORE,bundle);
//	}

}
