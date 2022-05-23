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
                nextQuestion();
            }
        });
    }

    private void nextQuestion(){
        Intent intent = new Intent(QuizActivity.this, QuizActivity.class);
        startActivity(intent);

        TextView question = findViewById(R.id.question);
        question.setText("Q.2: After how many years Pakistan got its first constitution?");
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