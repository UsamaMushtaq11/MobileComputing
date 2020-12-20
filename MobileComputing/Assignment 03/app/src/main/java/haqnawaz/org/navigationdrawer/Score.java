package haqnawaz.org.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.tools.jsc.Main;

public class Score extends MainActivity {
    TextView tv, tv2, tv3;
    Button btnRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_score);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //inflate your activity layout here!
        View contentView = inflater.inflate(R.layout.activity_score, null, false);
        drawerLayout.addView(contentView, 0);

        tv = (TextView)findViewById(R.id.tvres);
        tv2 = (TextView)findViewById(R.id.tvres2);
        tv3 = (TextView)findViewById(R.id.tvres3);
        btnRestart = (Button) findViewById(R.id.btnRestart);

        StringBuffer sb = new StringBuffer();
        sb.append("Correct answers: " + Quiz.correct + "\n");
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Wrong Answers: " + Quiz.wrong + "\n");
        StringBuffer sb3 = new StringBuffer();
        sb3.append("Final Score: " + Quiz.correct + "\n");
        tv.setText(sb);
        tv2.setText(sb2);
        tv3.setText(sb3);

        Quiz.correct=0;
        Quiz.wrong=0;

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in);
            }
        });
    }

}
