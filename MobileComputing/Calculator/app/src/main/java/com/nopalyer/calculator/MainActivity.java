package com.nopalyer.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.faendir.rhino_android.RhinoAndroidHelper;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ast.Scope;

public class MainActivity extends AppCompatActivity {


    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnDel,btnPercent,btnPlus,btnMinus,btnMultiply,btnDivision,btnEqual,btnClear,btnDot,btnBracket;
    TextView tvInput,tvOutput;
    String process,process1;
    boolean checkBracket = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnDel = findViewById(R.id.btnDel);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnDivision = findViewById(R.id.btnDivision);
        btnMultiply = findViewById(R.id.btnMultiply);

        btnEqual = findViewById(R.id.btnEqual);

        btnClear = findViewById(R.id.btnClear);
        btnDot = findViewById(R.id.btnDot);
        btnPercent = findViewById(R.id.btnPercent);
        btnBracket = findViewById(R.id.btnBracket);

        tvInput = findViewById(R.id.tvInput);
        tvOutput = findViewById(R.id.tvOutput);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
                tvOutput.setText("");
            }
        });


        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process = tvInput.getText().toString();
                if(!process.isEmpty()){
                    process=process.substring(0,process.length()-1);
                    tvInput.setText(process);
                }

                }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(process1!="Error"){

                tvInput.setText(process + "0");
            }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "0");
            }}
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(process1!="Error"){

                    tvInput.setText(process + "1");
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "1");
                }}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(process1!="Error"){

                    tvInput.setText(process + "2");
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "2");
                }}
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(process1!="Error"){

                    tvInput.setText(process + "3");
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "3");
                }}
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(process1!="Error"){

                    tvInput.setText(process + "4");
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "4");
                }}
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(process1!="Error"){

                    tvInput.setText(process + "5");
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "5");
                }}
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(process1!="Error"){

                    tvInput.setText(process + "6");
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "6");
                }}
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(process1!="Error"){

                    tvInput.setText(process + "7");
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "7");
                }}
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(process1!="Error"){

                    tvInput.setText(process + "8");
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "8");
                }}
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(process1!="Error"){

                    tvInput.setText(process + "9");
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "9");
                }}
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(process1!="Error"){

                    tvInput.setText(process + "+");
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "+");
                }}
        });


        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(process1!="Error"){

                    tvInput.setText(process + "-");
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "-");
                }}
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(process1!="Error"){

                    tvInput.setText(process + "×");
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "×");
                }}
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(process1!="Error"){

                    tvInput.setText(process + "÷");
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "÷");
                }}
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(process1!="Error"){

                    tvInput.setText(process + ".");
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + ".");
                }}
        });

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(process1!="Error"){

                    tvInput.setText(process + "%");
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "%");
                }}
        });

        btnBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(process1!="Error"){
                if (checkBracket){

                    tvInput.setText(process + ")");
                    checkBracket = false;
                }else{
                    tvInput.setText(process + "(");
                    checkBracket = true;
                }}else{
                    if (checkBracket){
                        tvOutput.setText("");
                        tvInput.setText(process + ")");
                        checkBracket = false;
                    }else{
                        tvOutput.setText("");
                        tvInput.setText(process + "(");
                        checkBracket = true;
                    }

                }

            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();


                process = process.replaceAll("×","*");
                process = process.replaceAll("%","/100");
                process = process.replaceAll("÷","/");
                process1 = tvOutput.getText().toString();

                Context rhino = Context.enter();

                rhino.setOptimizationLevel(-1);

                String finalResult = "";
                if(!process.isEmpty()){

                    if(process1.isEmpty()) {
                        try {
                            Scriptable scriptable = rhino.initStandardObjects();
                            finalResult = rhino.evaluateString(scriptable, process, "javascript", 1, null).toString();

                        } catch (Exception e) {
                            finalResult = "Error";
                            tvInput.setText("");

                        }
                        tvOutput.setText(finalResult);
                    }else{
                        if(process!= "Error"){
                        tvInput.setText(process1);
                        tvOutput.setText("");}
                    }}
                else{
                    tvOutput.setText("");
                }
            }
        });


    }
}
