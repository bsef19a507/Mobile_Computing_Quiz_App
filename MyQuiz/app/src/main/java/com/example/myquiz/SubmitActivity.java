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
        TextView comp = (TextView)findViewById(R.id.compliment);
        Bundle bundle = getIntent().getExtras();

        if(bundle.getString("result")!= null)
        {
           String score = bundle.getString("result");
           result_view.setText(score);
            int iScore=bundle.getInt("correct");
            if(iScore>7){
                comp.setText("Excellent");
            }else if(iScore>6){
                comp.setText("Very Good");
            }else if(iScore>5){
                comp.setText("Good");
            }else if(iScore==5){
                comp.setText("Satisfactory");
            }else{
                comp.setText("Poor");
            }


        }
    }
}