package com.example.AreaCalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class FirstScreenActivity extends Activity {
	boolean isFirstShown= false;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
		
		circle circle1= new circle();
		circle1.getArea();
		Log.i("area of cirlce",String.valueOf(circle1.getArea()));

		cube cube1= new cube();
		cube1.getArea();
		Log.i("area of cube", String.valueOf(cube1.getArea()));

		Rectangle rectangle1= new Rectangle();
		rectangle1.getArea();
		Log.i("area of rectangle",String.valueOf(rectangle1.getArea()));

		square square1= new square();
		square1.getArea();
		Log.i("area of square",String.valueOf(+square1.getArea()));

		triangle triangle1= new triangle();

		triangle1.getArea();

		Log.i("area of triangle",String.valueOf(triangle1.getArea()));
				
		Log.i("oncreate", "Activity A Created");
		
	}
	
	
	
	
	 @Override
	protected void onStart() {
		// TODO Auto-generated method stub
		 Log.i("onStart", "Activity A onStart");
		super.onStart();
	}




	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		if(!isFirstShown) {
			isFirstShown=true;
			Intent mintent= new Intent(this, SecondScreenActivity.class);
			startActivity(mintent);
			
		 Log.i("onResume", "Activity A onResume");
		super.onResume();
	}
	}
	



	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onPostCreate(savedInstanceState);
	}

	
	
	
	
	




	onPaus(){
	Log.i("onPause", "Activity A onPaused");
	
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}




	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
	}

		
	  
	
	public void onResum(){
		if(!isFirstShown) {
			isFirstShown=true;
			Intent mintent= new Intent(this, SecondScreenActivity.class);
			startActivity(mintent);
			

	
	}
	
	public void onStop(){
	Log.i("onStop", "Activity A onStoped");
	
	}
	
	
	public void onDestroy(){
	Log.i("onDestroy", "Activity A onDestroyed");
	
	}
	
	
}
