//package de.canberk.uni_pro.examples;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.http.HttpResponse;
//import org.apache.http.NameValuePair;
//import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.ResponseHandler;
//import org.apache.http.client.entity.UrlEncodedFormEntity;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.impl.client.BasicResponseHandler;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.message.BasicNameValuePair;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.util.Log;
//import android.widget.Toast;
//
//public class RestWebService extends Activity {
//
//	// String URL =
//	// "http://open.api.ebay.com/shopping?callname=FindPopularSearches&version=695";
//	String URL = "http://10.0.2.2:8080/WebApp/services";
//	String result = "";
//	String deviceId = "xxxxx";
//	final String tag = "Your Logcat tag: ";
//
//	/** Called when the activity is first created. */
//	@Override
//	public void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_rest_web_service);
//		/*
//		 * Make http call to the webservice
//		 */
//		callWebService("/Login?wsdl");
//
//	} // end onCreate()
//
//	public void callWebService(String serviceEndPoint) {
//		HttpClient httpclient = new DefaultHttpClient();
//		HttpGet request = new HttpGet(URL + serviceEndPoint);
//		// add the parameters to your request
//		request.addHeader("paramname", deviceId);
//		ResponseHandler<String> handler = new BasicResponseHandler();
//		try {
//			result = httpclient.execute(request, handler);
//		} catch (ClientProtocolException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		httpclient.getConnectionManager().shutdown();
//		Log.i("RESULT" + tag, result);
//	} // end callWebService()
//
//	public void test() {
//		// Create a new HttpClient and Post Header
//		HttpClient httpclient = new DefaultHttpClient();
//		HttpPost httppost = new HttpPost(URL + "/Login?wsdl");
//
//		try {
//			// Add your data
//			List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
//			nameValuePairs.add(new BasicNameValuePair("username", "admin"));
//			nameValuePairs.add(new BasicNameValuePair("password", "admin"));
//			httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
//
//			// Execute HTTP Post Request
//			HttpResponse response = httpclient.execute(httppost);
//			Toast.makeText(getApplicationContext(), response.toString(), Toast.LENGTH_LONG).show();
//
//		} catch (ClientProtocolException e) {
//			// TODO Auto-generated catch block
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//		}
//
//	}
//}
