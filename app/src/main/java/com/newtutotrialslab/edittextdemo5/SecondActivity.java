package com.newtutotrialslab.edittextdemo5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by Srijan on 01-Jul-15.
 */
public class SecondActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tv=(TextView)findViewById(R.id.textView);
        Intent intent=getIntent();
        String r = intent.getStringExtra("KEY_1");
        tv.setText(r);
    }
}
