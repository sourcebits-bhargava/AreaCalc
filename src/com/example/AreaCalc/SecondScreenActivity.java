package com.example.AreaCalc;

import android.util.Log;

public class SecondScreenActivity {
	public void onCreate(){
		Log.i("oncreate", "Activity B Created");
		
	}
	
	public void onPause(){
	Log.i("onPause", "Activity B onPaused");
	
	}
	
	public void onResume(){
	Log.i("onResume", "Activity B onResumed");
	
	}
	
	public void onStop(){
	Log.i("onStop", "Activity B onStoped");
	
	}
	
	
	public void onDestroy(){
	Log.i("onDestroy", "Activity B onDestroyed");
	
	}

}
