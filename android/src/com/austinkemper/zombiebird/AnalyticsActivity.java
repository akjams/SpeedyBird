package com.austinkemper.zombiebird;

import android.app.Activity;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;

public class AnalyticsActivity extends Activity {

    public static FirebaseAnalytics mFireBaseAnalytics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analytics);

        //mFireBaseAnalytics = new FirebaseAnalytics.getInstance(this);
    }


}
