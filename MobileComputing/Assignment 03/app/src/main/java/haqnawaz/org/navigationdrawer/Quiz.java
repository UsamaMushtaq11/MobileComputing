package haqnawaz.org.navigationdrawer;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.CountDownTimer;
import java.util.ArrayList;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;

import static java.util.Arrays.asList;


public class Quiz extends AppCompatActivity {
    TextView tv,time;
    public int counter;
    Timer timer;
    TimerTask timerTask;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;

    String questions1[] = {
            "نمازیں کتنی ہیں؟",
            "آخری نبی کا نام بتائیں؟",
            "قرآن میں کتنی سورتیں ہیں؟",
            "ہمارے مذھب کا کیا نام ہے؟",
            "پاکستان کے کتنے صوبے ہیں؟",
            "ہمارے ملک کا کیا نام ہے؟",
            "پاکستان کب وجود میں آیا؟",
            "روزے کس مہینے میں رکھے جاتے ہیں؟",
            "بیت اللہ کہا واقع ہے؟",
            "مالٹا کیاہے؟"
    };


    String answers[] = {"5","حضرت محمدﷺ","114","اسلام","4","پاکستان","1947","رمضان","مکہ میں","یہ سب"};
    String opt[] = {
            "1","2","3","5",
            "حضرت نوحؑ","حضرت محمدﷺ","حضرت یوسفؑ","حضرت ابراھیمؑ",
            "112","118","114","22",
            "بدھ مت","اسلام","عیسائیٰ","کچھ نہیں",
            "3","2","4","8",
            "پاکستان","عراق","مصر","شام",
            "1947","1986","1887","1119",
            "محرم","رمضان","جنوری","شعبان",
            "مدینہ میں","لاہور میں","مکہ میں","جدہ میں",
            "پھل","رنگ","ملک","یہ سب"
    };
    int flag=0;
    int queNo=0;
    public static int marks=0,correct=0,wrong=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        ArrayList<String> question= new ArrayList<String>(asList(questions1));
        Collections.shuffle(question);
        String questions[] = new String[question.size()];
        for(int j =0;j<question.size();j++){
            questions[j] = question.get(j);
        }

        final TextView score = (TextView)findViewById(R.id.textView4);
        TextView textView=(TextView)findViewById(R.id.DispName);
        Intent intent = getIntent();
        String name= intent.getStringExtra("myname");

        if (name.trim().equals(""))
            textView.setText("Hello User");
        else
            textView.setText("Hello " + name);

        submitbutton=(Button)findViewById(R.id.button3);
        quitbutton=(Button)findViewById(R.id.buttonquit);
        tv=(TextView) findViewById(R.id.tvque);

        radio_g=(RadioGroup)findViewById(R.id.answersgrp);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        rb4=(RadioButton)findViewById(R.id.radioButton4);
        tv.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radio_g.getCheckedRadioButtonId()==-1)
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Please select one choice", Toast.LENGTH_LONG);
//                    toast.setGravity(Gravity.TOP|Gravity.BOTTOM, 0, 0);
                    toast.show();
                    return;
                }
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();
                if(ansText.equals(answers[flag])) {
                    correct++;
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                }
                else {
                    wrong++;
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                }

                flag++;

                if (score != null)
                    score.setText(""+correct);

                if(flag<questions.length)
                {
                    ArrayList<String> tempList = new ArrayList<String>(4);
                    String val =questions[flag]; // insert code here
                    for (int i=0;i<questions.length;i++) {
                        if (questions1[i].equals(val)) {
                            queNo = i;
                            break;
                        }
                    }
                    tempList.add(opt[queNo*4]);
                    tempList.add(opt[queNo*4+1]);
                    tempList.add(opt[queNo*4+2]);
                    tempList.add(opt[queNo*4+3]);


                    tv.setText(questions[flag]);
                    Collections.shuffle(tempList);
                    rb1.setText(tempList.get(0));
                    rb2.setText(tempList.get(1));
                    rb3.setText(tempList.get(2));
                    rb4.setText(tempList.get(3));

//                    rb1.setText(opt[flag*4]);
//                    rb2.setText(opt[flag*4 +1]);
//                    rb3.setText(opt[flag*4 +2]);
//                    rb4.setText(opt[flag*4 +3]);
//

                }
                else
                {
                    marks=correct;
                    Intent in = new Intent(getApplicationContext(),Score.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });
        time= (TextView) findViewById(R.id.DispTime);


        new CountDownTimer(120000, 1000){
            public void onTick(long millisUntilFinished){
                time.setText(String.valueOf(120 - counter) + "s Left");
                counter++;
            }
            public  void onFinish(){
                Intent intent=new Intent(getApplicationContext(),Score.class);
                startActivity(intent);
            }
        }.start();

        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Score.class);
                startActivity(intent);
            }
        });
    }

}