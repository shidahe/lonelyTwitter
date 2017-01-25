package ca.ualberta.cs.lonelytwitter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class LonelyTwitterActivity extends Activity {

	private static final String FILENAME = "file.sav";
	private EditText bodyText;
	private ListView oldTweetsList;

	private ArrayList<Tweet> tweetList;
	private ArrayAdapter<Tweet> adapter;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		Button saveButton = (Button) findViewById(R.id.save);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);

		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);
				String text = bodyText.getText().toString();

				Tweet tweet = new NormalTweet(text);
				tweetList.add(tweet);

				adapter.notifyDataSetChanged();

				saveInFile();

//				Tweet tweet = new ImportantTweet("test string");
//				NormalTweet normalTweet = new NormalTweet("test string");
//
//				try {
//					if (tweet.isImportant())
//						tweet.setMessage("better string");
//				} catch (Exception e) {
//					throw new RuntimeException();
//				}
//
//				String string = tweet.getMessage();
//
//				ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
//				tweetList.add(tweet);
//				tweetList.add(normalTweet);


//				saveInFile(text, new Date(System.currentTimeMillis()));
//				finish();

			}
		});
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
//		String[] tweets = loadFromFile();
		loadFromFile();
		//adapter, link between data and view
//		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//				R.layout.list_item, tweets);

		//tweetList = new ArrayList<Tweet>();
//		ArrayAdapter<Tweet> adapter = new ArrayAdapter<Tweet>(this,
		adapter = new ArrayAdapter<Tweet>(this,
				R.layout.list_item, tweetList);
		oldTweetsList.setAdapter(adapter);
	}

//	private String[] loadFromFile() {
	private void loadFromFile() {
//		ArrayList<String> tweets = new ArrayList<String>();
		try {
			FileInputStream fis = openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
//			String line = in.readLine();
//			while (line != null) {
//				tweets.add(line);
//				line = in.readLine();
//			}

			Gson gson = new Gson();

			//Taken from.....
			Type listType = new TypeToken<ArrayList<Tweet>>(){}.getType()
			tweetList = gson.fromJson(in,listType);

		} catch (FileNotFoundException e) {
			tweetList = new ArrayList<Tweet>();
//			// TODO Auto-generated catch block
//			e.printStackTrace();
			//throw new RuntimeException();
		} catch (IOException e) {
			throw new RuntimeException();
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
//		return tweets.toArray(new String[tweets.size()]);
	}
	
//	private void saveInFile(String text, Date date) {
	private void saveInFile() {
		try {
			FileOutputStream fos = openFileOutput(FILENAME,
					Context.MODE_PRIVATE);
//					Context.MODE_APPEND);
//			fos.write(new String(date.toString() + " | " + text)
//					.getBytes());
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));

			Gson gson = new Gson();
			gson.toJson(tweetList, out);
			out.flush();

			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// TODO: Handle the Exception properly letter
//			e.printStackTrace();
			throw new RuntimeException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}