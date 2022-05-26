package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {

    ArrayList<String> selected_ans = new ArrayList<String>();

    public String[] questions = {"Who was the first President of the Constituent Assembly of Pakistan?",
            "After how many years Pakistan got its first constitution?","What document was firstly drafted to give pace to constitution making process?",
            "When the Constituent Assembly passed the Objective Resolution?","When Mohammad Ali Bogra presented Bogra Formula in the assembly?",
            "Who was Mohammad Ali Bogra?","What is the other name of Mohammad Ali Bogra Formula?", "When first constitution of Pakistan was enforced?",
    "Who was the Prime Minister of Pakistan during enforcement of first constitution?","What official name was given to Pakistan in 1956 constitution?"};
    public String[][] answers = {
            {"Liaquat Ali Khan","Quaid-e-Azam","Moulvi Tameez-ud-Din","Sardar Abdur Rab Nishtar"},
            {"5 years","7 years","9 years","11 years"},
            {"Representative Act","Pakistan Act","Independence Act","Objective Resolution"},
            {"14th February 1949","12th March 1949","9th June 1949","15th August 1949"},
            {"January 1953","April 1953","September 1953","October 1953"},
            {"Prime Minister","Foreign Minister","Law Minister","Parliament Minister"},
            {"New Law of Pakistan","Pakistan Report","Third Report","Constitutional Formula"},
            {"8th June 1956","23rd March 1956","14th August 1956","25th December 1956"},
            {"Mohammad Ali Bogra","Khwaja Nazim Uddin","Choudhry Mohammad Ali","Ibrahim Ismail Chundrigar"},
            {"United States of Pakistan","Republic of Pakistan","Islamic Pakistan","Islamic Republic of Pakistan"}
    } ;

    public int totalQuestions = questions.length;
    public int questionIndex = 0;
    public int questionCount = questionIndex+1;
    public int optionCount = 0;
    public int option1 = optionCount;
    public int option2 = option1+1;
    public int option3 = option2+1;
    public int option4 =  option3+1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        ArrayList<String> ans_list = new ArrayList<String>();
        ans_list.add("Quaid-e-Azam");
        ans_list.add("9 years");
        ans_list.add("Objective Resolution");
        ans_list.add("12th March 1949");
        ans_list.add("October 1953");
        ans_list.add("Prime Minister");
        ans_list.add("Constitutional Formula");
        ans_list.add("23rd March 1956");
        ans_list.add("Choudhry Mohammad Ali");
        ans_list.add("Islamic Republic of Pakistan");

        TextView qCount = findViewById(R.id.question_count);
        qCount.setText(questionCount+"/"+totalQuestions);

        TextView question = findViewById(R.id.question);
        question.setText("Q."+questionCount+":"+questions[questionIndex]);

        RadioButton opt1 = findViewById(R.id.q1option1);
        opt1.setText(answers[questionIndex][option1]);

        RadioButton opt2 = findViewById(R.id.q1option2);
        opt2.setText(answers[questionIndex][option2]);

        RadioButton opt3 = findViewById(R.id.q1option3);
        opt3.setText(answers[questionIndex][option3]);

        RadioButton opt4 = findViewById(R.id.q1option4);
        opt4.setText(answers[questionIndex][option4]);




        Button btn_nxt = findViewById(R.id.next_btn);

        btn_nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


               questionIndex = questionIndex + 1 ;
                questionCount =  questionCount+1;

               if(questionIndex<totalQuestions) {


                   qCount.setText(questionCount+"/"+totalQuestions);


                   question.setText("Q."+questionCount+":"+questions[questionIndex]);

                   opt1.setText(answers[questionIndex][option1]);


                   opt2.setText(answers[questionIndex][option2]);


                   opt3.setText(answers[questionIndex][option3]);

                   opt4.setText(answers[questionIndex][option4]);

               }else{
                   selected_ans.retainAll(ans_list);

                   btn_nxt.setText("submit");
                   String btnText = btn_nxt.getText().toString();
                   if(btnText.equals("submit")){
                       String correct = String.valueOf(selected_ans.size());
                       String totalQ = String.valueOf(ans_list.size());
                       String result = correct+"/"+totalQ;
                       Intent intent = new Intent(QuizActivity.this, SubmitActivity.class);
                       intent.putExtra("result",result);
                       startActivity(intent);
                   }
               }

            }
        });
    }







    public void onRadioButtonClicked(View view){



        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q1option1:
                if (checked){
                        String ans = "";
                        ans = ((RadioButton) view).getText().toString();
                        selected_ans.add(ans);
                }
                break;
            case R.id.q1option2:
                if (checked){
                    String ans = "";
                    ans = ((RadioButton) view).getText().toString();
                    selected_ans.add(ans);
                }
                    break;
            case R.id.q1option3:
                if (checked){
                    String ans = "";
                    ans = ((RadioButton) view).getText().toString();
                    selected_ans.add(ans);
                }
                    break;
            case R.id.q1option4:
                if (checked){
                    String ans = "";
                    ans = ((RadioButton) view).getText().toString();
                    selected_ans.add(ans);
                }
                    break;
        }
    }
}