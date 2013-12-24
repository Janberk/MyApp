//package de.canberk.uni_pro.examples;
//import android.app.Activity;
//import android.os.Bundle;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.widget.Button;
//
//public class RestFulWebservice extends Activity {
//
//	/** Called when the activity is first created. */
//	@Override
//	public void onCreate(Bundle savedInstanceState) {
//
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_rest_web_service);
//
//		final Button GetServerData = (Button) findViewById(R.id.GetServerData);
//
//		GetServerData.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View arg0) {
//
//				// WebServer Request URL
//				String serverURL = "http://192.168.1.54/development/php/JsonReturn.php";
//
//				// Use AsyncTask execute Method To Prevent ANR Problem
//				LocalHostConn lConn = new LocalHostConn(RestFulWebservice.this);
//				lConn.execute(serverURL);
//			}
//		});
//	}
//
//}
