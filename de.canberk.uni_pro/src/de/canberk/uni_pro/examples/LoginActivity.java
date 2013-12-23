//package de.canberk.uni_pro.examples;
//
//import org.ksoap2.SoapEnvelope;
//import org.ksoap2.serialization.PropertyInfo;
//import org.ksoap2.serialization.SoapObject;
//import org.ksoap2.serialization.SoapPrimitive;
//import org.ksoap2.serialization.SoapSerializationEnvelope;
//import org.ksoap2.transport.HttpTransportSE;
//import android.annotation.SuppressLint;
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.os.StrictMode;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//@SuppressLint("NewApi")
//public class LoginActivity extends Activity {
//
//	public static final String TAG = LoginActivity.class.getName();
//
//	private final String NAMESPACE = "http://webapp.canberk.de";
//	private final String URL = "http://10.0.2.2:8080/WebApp/services/Login?wsdl";
//	private final String SOAP_ACTION = "http://webapp.canberk.de/authentication";
//	private final String METHOD_NAME = "authentication";
//
//	/** Called when the activity is first created. */
//	@Override
//	public void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.login);
//
//		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
//				.permitAll().build();
//		StrictMode.setThreadPolicy(policy);
//
//		Button login = (Button) findViewById(R.id.login_Btn);
//		login.setOnClickListener(new View.OnClickListener() {
//
//			public void onClick(View arg0) {
//				Log.i(TAG, "Login button clicked!");
//				loginAction();
//			}
//		});
//		TextView linkToRegScreen = (TextView) findViewById(R.id.link_to_register);
//		linkToRegScreen.setOnClickListener(new View.OnClickListener() {
//
//			@Override
//			public void onClick(View view) {
//				Log.i(TAG, "Link to registration clicked!");
//				Intent intent = new Intent(LoginActivity.this,
//						RestWebService.class);
//				startActivity(intent);
//			}
//		});
//	}
//
//	private void loginAction() {
//
//		SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
//
//		EditText username = (EditText) findViewById(R.id.login_edit_email);
//		String userName = username.getText().toString();
//		EditText password = (EditText) findViewById(R.id.login_edit_password);
//		String userPassword = password.getText().toString();
//
//		// Pass value for username variable of the web service
//		PropertyInfo usernameProp = new PropertyInfo();
//		usernameProp.setName("username");// Define the variable name in the web
//											// service method
//		usernameProp.setValue(userName);// set value for userName variable
//		usernameProp.setType(String.class);// Define the type of the variable
//		request.addProperty(usernameProp);// Pass properties to the variable
//
//		// Pass value for Password variable of the web service
//		PropertyInfo passwordProp = new PropertyInfo();
//		passwordProp.setName("password");
//		passwordProp.setValue(userPassword);
//		passwordProp.setType(String.class);
//		request.addProperty(passwordProp);
//
//		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
//				SoapEnvelope.VER11);
//		envelope.setOutputSoapObject(request);
//		HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
//
//		try {
//			androidHttpTransport.call(SOAP_ACTION, envelope);
//			final SoapPrimitive response = (SoapPrimitive) envelope
//					.getResponse();
//
//			String str = response.toString();
//
//			Log.d(TAG, "Web Response: " + str);
//
//			// if (str.equals("ACCESS DENIED!")) {
//			// Toast.makeText(this, "ACCESS DENIED!", Toast.LENGTH_LONG)
//			// .show();
//			// }
//			// if (str.equals("ACCESS GRANTED!")) {
//			// Intent intent = new Intent(this, MainActivity.class);
//			// startActivity(intent);
//			// }
//			Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG)
//					.show();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//}
