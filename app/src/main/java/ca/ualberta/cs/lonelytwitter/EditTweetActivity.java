/*
 * Copyright (c) 2017. Team X. CMPUT301. University of Alberta. All Rights Reserved.
 * You may use, distribute or modify this code under terms and conditions of the Code of Student Behaviour at the University of Alberta.
 * You can find a copy of the license in the project. Otherwise please contact contact@uab.ca
 */

package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.robotium.solo.Solo;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Intent in = getIntent();
        Bundle bun = in.getExtras();
        TextView Textv = (TextView) findViewById(R.id.textView);

        if(bun!=null){
            String j =(String) bun.get("Index");
            Textv.setText(j);
        }


    }
}
