//package de.canberk.uni_pro.examples;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.text.TextWatcher;
//import android.view.Menu;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//
//public class RegisterActivity extends Activity {
//
//	protected static final String logger = RegisterActivity.class
//			.getSimpleName();
//
//	private EditText editFirstName;
//	private EditText editLastName;
//	private EditText editEmail;
//	private EditText editPassword;
//
//	private Button btnRegister;
//
//	private TextWatcher watcher;
//
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.register);
//
//		editEmail = (EditText) findViewById(R.id.et_email);
//		editPassword = (EditText) findViewById(R.id.et_password);
//		btnRegister = (Button) findViewById(R.id.btn_sign_up);
//		btnRegister.setOnClickListener(new View.OnClickListener() {			
//			@Override
//			public void onClick(View v) {
//				sendData();				
//			}
//		});
//	}
//	
//	private void sendData() {
//		String email = editEmail.getText().toString();
//		String password = editPassword.getText().toString();
//		
//	}
//
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.register, menu);
//		return true;
//	}
//
//}
