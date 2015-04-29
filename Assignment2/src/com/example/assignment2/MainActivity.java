package com.example.assignment2;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public abstract class MainActivity extends Activity implements View.OnClickListener{
	
	
	Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, cancel, equal; 
	EditText disp; 
	int op1; 
	int op2; 
	String optr;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 one = (Button) findViewById(R.id.button1);
		 two = (Button) findViewById(R.id.button2); 
		three = (Button) findViewById(R.id.button3);
		four = (Button) findViewById(R.id.button4); 
		five = (Button) findViewById(R.id.button5); 
		six = (Button) findViewById(R.id.button6); 
		seven = (Button) findViewById(R.id.button7); 
		eight = (Button) findViewById(R.id.button8); 
		nine = (Button) findViewById(R.id.button9); 
		zero = (Button) findViewById(R.id.button0); 
		add = (Button) findViewById(R.id.buttonAdd); 
		sub = (Button) findViewById(R.id.buttonSub); 
		mul = (Button) findViewById(R.id.buttonMul); 
		div = (Button) findViewById(R.id.buttonDiv); 
		cancel = (Button) findViewById(R.id.buttonCancel); 
		equal = (Button) findViewById(R.id.buttonEqual); 
		disp = (EditText) findViewById(R.id.editDisplay);
		
	
	}
	
	
	


		
		

	

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}

}
