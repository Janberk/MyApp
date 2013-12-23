//package de.canberk.uni_pro.examples;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.UnsupportedEncodingException;
//import java.net.URL;
//import java.net.URLConnection;
//import java.net.URLEncoder;
//
//import org.apache.http.client.HttpClient;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import android.os.AsyncTask;
//import android.widget.EditText;
//import android.widget.TextView;
//import de.canberk.uni_pro.R;
//
//public class LocalHostConn extends AsyncTask<String, Void, Void> {
//
//	private RestFulWebservice rws;
//
//	private final HttpClient Client = new DefaultHttpClient();
//	private String Content;
//	private String Error = null;
//	//private ProgressDialog Dialog = new ProgressDialog(rws);
//
//	public LocalHostConn(RestFulWebservice rws) {
//		this.rws = rws;
//	}
//
//	String data = "";
//	TextView uiUpdate = (TextView) this.rws.findViewById(R.id.output);
//	TextView jsonParsed = (TextView) this.rws.findViewById(R.id.jsonParsed);
//	EditText serverText = (EditText) this.rws.findViewById(R.id.serverText);
//
//	@Override
//	protected Void doInBackground(String... urls) {
//		BufferedReader reader = null;
//
//		try {
//			URL url = new URL(urls[0]);
//
//			URLConnection conn = url.openConnection();
//			conn.setDoOutput(true);
//			OutputStreamWriter wr = new OutputStreamWriter(
//					conn.getOutputStream());
//			wr.write(data);
//			wr.flush();
//			reader = new BufferedReader(new InputStreamReader(
//					conn.getInputStream()));
//			StringBuilder sb = new StringBuilder();
//			String line = null;
//
//			while ((line = reader.readLine()) != null) {
//				sb.append(line + "");
//			}
//			Content = sb.toString();
//		} catch (Exception ex) {
//			Error = ex.getMessage();
//		} finally {
//			try {
//				reader.close();
//			} catch (Exception ex) {
//			}
//		}
//		return null;
//
//	}
//
//	@Override
//	protected void onPreExecute() {
////		Dialog.setMessage("Please wait..");
////		Dialog.show();
//
//		try {
//			data += "&" + URLEncoder.encode("data", "UTF-8") + "="
//					+ serverText.getText();
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	protected void onPostExecute(Void unused) {
//		//Dialog.dismiss();
//
//		if (Error != null) {
//			uiUpdate.setText("Output : " + Error);
//		} else {
//			uiUpdate.setText(Content);
//			String OutputData = "";
//			JSONObject jsonResponse;
//
//			try {
//				jsonResponse = new JSONObject(Content);
//				JSONArray jsonMainNode = jsonResponse.optJSONArray("Android");
//				int lengthJsonArr = jsonMainNode.length();
//
//				for (int i = 0; i < lengthJsonArr; i++) {
//					JSONObject jsonChildNode = jsonMainNode.getJSONObject(i);
//					String name = jsonChildNode.optString("name").toString();
//					String number = jsonChildNode.optString("number")
//							.toString();
//					String date_added = jsonChildNode.optString("date_added")
//							.toString();
//
//					OutputData += "";
//				}
//				jsonParsed.setText(OutputData);
//			} catch (JSONException e) {
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//}
