package kr.co.ana.sojun1226;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textview);
        String getServerData = "{" +
                " 'books': [" +
                " { 'language':'Java' , 'edition':'second' }," +
                " { 'language':'C++' , 'lastName':'sung' }" +
                " ]" +
                "}";
        try {
            JSONObject jsonObject = new JSONObject(getServerData);
            JSONArray books = jsonObject.getJSONArray("books");
            String language1 = books.getJSONObject(0).getString("language");
            String edition1 = books.getJSONObject(0).getString("edition");
            String language2 = books.getJSONObject(1).getString("language");
            String lastName = books.getJSONObject(1).getString("lastName");
            textView.setText("language1 = " + language1 + "\nedition1 ="
                    + edition1 + "\nlanguage2 = " + language2 + "\nlastName=" + lastName);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
