package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Button btn_nxt = findViewById(R.id.next_btn);

        btn_nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView question = findViewById(R.id.question);
                question.setText("Q.2: After how many years Pakistan got its first constitution?");

                RadioButton opt1 = findViewById(R.id.q1option1);
                opt1.setText(" 5 years");

                RadioButton opt2 = findViewById(R.id.q1option2);
                opt2.setText(" 7 years");

                RadioButton opt3 = findViewById(R.id.q1option3);
                opt3.setText(" 9 years");

                RadioButton opt4 = findViewById(R.id.q1option4);
                opt4.setText(" 11 years");
            }
        });
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