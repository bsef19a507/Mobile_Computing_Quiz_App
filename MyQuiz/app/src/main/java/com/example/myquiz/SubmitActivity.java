package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SubmitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);

        TextView result_view = (TextView)findViewById(R.id.score);
        Bundle bundle = getIntent().getExtras();

        if(bundle.getString("result")!= null)
        {
           String score = bundle.getString("result");
           result_view.setText(score);
        }
    }
}