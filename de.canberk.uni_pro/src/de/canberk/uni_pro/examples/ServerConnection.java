//package de.canberk.uni_pro.examples;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//
//import org.apache.http.HttpResponse;
//import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.DefaultHttpClient;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//public class ServerConnection extends Activity {
//
//	private EditText et_username;
//	private EditText et_email;
//	private EditText et_password;
//	private Button btn_sign_up;
//
//	private String username;
//	private String email;
//	private String password;
//
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.layout_registration);
//
//		et_username = (EditText) findViewById(R.id.et_username);
//		et_email = (EditText) findViewById(R.id.et_email);
//		et_password = (EditText) findViewById(R.id.et_password);
//		btn_sign_up = (Button) findViewById(R.id.btn_sign_up);
//		btn_sign_up.setOnClickListener(new View.OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//				getRequest();
//
//			}
//		});
//
//	}
//
//	private String createGetParameters() {
//
//		username = et_username.getText().toString();
//		email = et_email.getText().toString();
//		password = et_password.getText().toString();
//
//		String result = "?username=" + username + "&email=" + email
//				+ "&password=" + password;
//
//		return result;
//	}
//
//	private void getRequest() {
//		String file = "response.php";
//		String uri = "http://10.0.2.2:80/development/examples/registration_form/backend_android/";
//		String fullUri = uri + file + createGetParameters();
//
//		HttpClient httpclient = new DefaultHttpClient();
//		HttpGet httpGet = new HttpGet(fullUri);
//		try {
//			HttpResponse response = httpclient.execute(httpGet);
//			if (response != null) {
//				String line = "";
//				InputStream inputstream = response.getEntity().getContent();
//				line = convertStreamToString(inputstream);
//				Toast.makeText(this, line, Toast.LENGTH_LONG).show();
//			} else {
//				// Toast.makeText(this, "Unable to complete your request",
//				// Toast.LENGTH_LONG).show();
//			}
//		} catch (ClientProtocolException e) {
//			Toast.makeText(this, "Caught ClientProtocolException " + e,
//					Toast.LENGTH_SHORT).show();
//		} catch (IOException e) {
//			Toast.makeText(this, "Caught IOException " + e, Toast.LENGTH_SHORT)
//					.show();
//		} catch (Exception e) {
//			Toast.makeText(this, "Caught Exception " + e, Toast.LENGTH_SHORT)
//					.show();
//		}
//
//	}
//
//	private String convertStreamToString(InputStream is) {
//		String line = "";
//		StringBuilder sb = new StringBuilder();
//		BufferedReader rd = new BufferedReader(new InputStreamReader(is));
//		try {
//			while ((line = rd.readLine()) != null) {
//				sb.append(line);
//			}
//		} catch (Exception e) {
//			Toast.makeText(this, "Stream Exception", Toast.LENGTH_SHORT).show();
//		}
//		return sb.toString();
//	}
//
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.server_connection, menu);
//		return true;
//	}
//
//}
