package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void onRadioButtonClicked(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q1option1:
                if (checked)
                    // wrong
                    break;
            case R.id.q1option2:
                if (checked)
                    // true
                    break;
            case R.id.q1option3:
                if (checked)
                    // wrong
                    break;
            case R.id.q1option4:
                if (checked)
                    // wrong
                    break;
        }
    }
}