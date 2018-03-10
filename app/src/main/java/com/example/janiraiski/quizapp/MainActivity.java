package com.example.janiraiski.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    int points = 0;

    EditText question1EditText;

    CheckBox question2CheckBox1;
    CheckBox question2CheckBox2;
    CheckBox question2CheckBox3;
    CheckBox question2CheckBox4;
    CheckBox question2CheckBox5;

    RadioButton question3RadioButton3;

    RadioButton question4RadioButton2;

    CheckBox question5CheckBox1;
    CheckBox question5CheckBox2;
    CheckBox question5CheckBox3;
    CheckBox question5CheckBox4;

    RadioButton question6RadioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Question1()
    {
        question1EditText = findViewById(R.id.question_1_edit_text);
        String q1Answer = question1EditText.getText().toString();

        if (q1Answer.equals("Read Only Memory") || q1Answer.equals("read only memory"))
        {
            points += 1;
        }
    }

    public void Question2()
    {
        question2CheckBox1 = findViewById(R.id.question_2_check_box_1);
        question2CheckBox2 = findViewById(R.id.question_2_check_box_2);
        question2CheckBox3 = findViewById(R.id.question_2_check_box_3);
        question2CheckBox4 = findViewById(R.id.question_2_check_box_4);
        question2CheckBox5 = findViewById(R.id.question_2_check_box_5);

        if (question2CheckBox1.isChecked() && !question2CheckBox2.isChecked() &&
                question2CheckBox3.isChecked() && question2CheckBox4.isChecked() &&
                question2CheckBox5.isChecked())
            points += 1;
    }

    public void Question3()
    {
        question3RadioButton3 = findViewById(R.id.question_3_radio_button_3);

        if (question3RadioButton3.isChecked())
            points += 1;
    }

    public void Question4()
    {
        question4RadioButton2 = findViewById(R.id.question_4_radio_button_2);

        if (question4RadioButton2.isChecked())
            points += 1;
    }

    public void Question5()
    {
        question5CheckBox1 = findViewById(R.id.question_5_check_box_1);
        question5CheckBox2 = findViewById(R.id.question_5_check_box_2);
        question5CheckBox3 = findViewById(R.id.question_5_check_box_3);
        question5CheckBox4 = findViewById(R.id.question_5_check_box_4);

        if (question5CheckBox1.isChecked() && !question5CheckBox2.isChecked() &&
                question5CheckBox3.isChecked() && !question5CheckBox4.isChecked())
            points += 1;
    }

    public void Question6()
    {
        question6RadioButton2 = findViewById(R.id.question_6_radio_button_2);

        if (question6RadioButton2.isChecked())
            points += 1;
    }

    public void CheckAnswers(View v)
    {
        points = 0;

        Question1();
        Question2();
        Question3();
        Question4();
        Question5();
        Question6();

        Context context = getApplication();
        CharSequence text = "You got " + points + " points out of 6 points!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


}
