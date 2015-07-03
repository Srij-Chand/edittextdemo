package com.newtutotrialslab.edittextdemo5;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.cert.TrustAnchor;


public class MainActivity extends ActionBarActivity {
    private EditText et1;
    private EditText et2;
    private Button btn1;
    private TextView Tv1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);


        btn1 = (Button) findViewById(R.id.button);
        Tv1 = (TextView) findViewById(R.id.textView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String stringValue1 = et1.getText().toString().trim();
                String stringValue2 = et2.getText().toString().trim();
                /*if (stringValue1.length() == 0 || stringValue2.length() == 0) {
                    Toast.makeText(getApplicationContext(), "one or more fields are missing",
                            Toast.LENGTH_SHORT).show();
                } else {
                    int val1 = Integer.parseInt(stringValue1);
                    int val2 = Integer.parseInt(stringValue2);

                    Tv1.setText((val1 + val2) + "");
                }*/


                try {

                    int val1 = Integer.parseInt(stringValue1);
                    int val2 = Integer.parseInt(stringValue2);
                    int result = val1+val2;
                    Tv1.setText(result+"");

                    Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                    intent.putExtra("KEY_1",result+"");
                    startActivity(intent);

                }catch(NumberFormatException e){
                        Toast.makeText(getApplicationContext(),
                                "more than one fields are missing",
                                Toast.LENGTH_SHORT).show();
                    }

                }

        });
    }
}