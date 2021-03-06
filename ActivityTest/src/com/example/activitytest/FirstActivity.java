package com.example.activitytest;

import android.R.bool;
import android.R.menu;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.first_layout);
		Button button1 = (Button) findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(FirstActivity.this, "You clicked Button 1", Toast.LENGTH_LONG).show();
			}
		});
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		switch (item.getItemId()) {
		case R.id.add_item:
			Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
			break;
			case R.id.remove_item:
				Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show();
		default:
			break;
		}
		return true;
	}
	
}
