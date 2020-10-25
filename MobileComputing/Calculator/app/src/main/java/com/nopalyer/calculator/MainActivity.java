package com.nopalyer.calculator;

import androidx.annotation.RequiresApi;
import   androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.faendir.rhino_android.RhinoAndroidHelper;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ast.Scope;

public class MainActivity extends AppCompatActivity {


    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnDel,btnPercent,btnPlus,btnMinus,btnMultiply,btnDivision,btnEqual,btnClear,btnDot,btnBracket;
    EditText tvOutput;
    EditText tvInput;
    String process="",process1;
    boolean checkBracket = false;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
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

        tvInput =(EditText) findViewById(R.id.tvInput);
        tvInput.setCursorVisible(true);
        tvInput.setShowSoftInputOnFocus(false);
        tvOutput = (EditText) findViewById(R.id.tvOutput);
        tvOutput.setShowSoftInputOnFocus(false);



        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
                tvInput.setSelection(0);
                tvOutput.setText("");
                tvOutput.setSelection(0);
            }
        });


        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process = tvInput.getText().toString();
                if(!process.isEmpty()){
                    process=process.substring(0,process.length()-1);
                    tvInput.setText(process);
                    tvInput.setSelection( process.length());


                }

                }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(btn0.hasOnClickListeners()){

                    tvInput.setCursorVisible(true);


                }
                if(!process1.equals("Error")){
                    tvInput.setCursorVisible(true);
                tvInput.setText(process + "0");
                tvInput.setSelection(process.length()+1);


            }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "0");
                    tvInput.setSelection(process.length()+1);
            }}
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(!process1.equals("Error")){

                    tvInput.setText(process + "1");
                    tvInput.setSelection(process.length()+1);
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "1");
                    tvInput.setSelection(process.length()+1);
                }}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(!process1.equals("Error")){

                    tvInput.setText(process + "2");
                    tvInput.setSelection(process.length()+1);
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "2");
                    tvInput.setSelection(process.length()+1);
                }}
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(!process1.equals("Error")){

                    tvInput.setText(process + "3");
                    tvInput.setSelection(process.length()+1);
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "3");
                    tvInput.setSelection(process.length()+1);
                }}
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(!process1.equals("Error")){

                    tvInput.setText(process + "4");
                    tvInput.setSelection(process.length()+1);
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "4");
                    tvInput.setSelection(process.length()+1);
                }}
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(!process1.equals("Error")){

                    tvInput.setText(process + "5");
                    tvInput.setSelection(process.length()+1);
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "5");
                    tvInput.setSelection(process.length()+1);
                }}
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(!process1.equals("Error")){

                    tvInput.setText(process + "6");
                    tvInput.setSelection(process.length()+1);
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "6");
                    tvInput.setSelection(process.length()+1);
                }}
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(!process1.equals("Error")){

                    tvInput.setText(process + "7");
                    tvInput.setSelection(process.length()+1);
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "7");
                    tvInput.setSelection(process.length()+1);
                }}
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(!process1.equals("Error")){

                    tvInput.setText(process + "8");
                    tvInput.setSelection(process.length()+1);
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "8");
                    tvInput.setSelection(process.length()+1);
                }}
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(!process1.equals("Error")){

                    tvInput.setText(process + "9");
                    tvInput.setSelection(process.length()+1);
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "9");
                    tvInput.setSelection(process.length()+1);
                }}
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(!process1.equals("Error")){

                    tvInput.setText(process + "+");
                    tvInput.setSelection(process.length()+1);
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "+");
                    tvInput.setSelection(process.length()+1);
                }}
        });


        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(!process1.equals("Error")){

                    tvInput.setText(process + "-");
                    tvInput.setSelection(process.length()+1);
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "-");
                    tvInput.setSelection(process.length()+1);
                }}
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(!process1.equals("Error")){

                    tvInput.setText(process + "×");
                    tvInput.setSelection(process.length()+1);
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "×");
                    tvInput.setSelection(process.length()+1);
                }}
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(!process1.equals("Error")){

                    tvInput.setText(process + "÷");
                    tvInput.setSelection(process.length()+1);
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "÷");
                    tvInput.setSelection(process.length()+1);
                }}
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(!process1.equals("Error")){

                    tvInput.setText(process + ".");
                    tvInput.setSelection(process.length()+1);
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + ".");
                    tvInput.setSelection(process.length()+1);
                }}
        });

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(!process1.equals("Error")){

                    tvInput.setText(process + "%");
                    tvInput.setSelection(process.length()+1);
                }else{
                    tvOutput.setText("");
                    tvInput.setText(process + "%");
                    tvInput.setSelection(process.length()+1);
                }}
        });

        btnBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process1 = tvOutput.getText().toString();
                process = tvInput.getText().toString();
                if(!process1.equals("Error")){
                if (checkBracket){

                    tvInput.setText(process + ")");
                    tvInput.setSelection(process.length()+1);
                    checkBracket = false;
                }else{
                    tvInput.setText(process + "(");
                    tvInput.setSelection(process.length()+1);
                    checkBracket = true;
                }}else{
                    if (checkBracket){
                        tvOutput.setText("");
                        tvInput.setSelection(0);
                        tvInput.setText(process + ")");
                        tvInput.setSelection(process.length()+1);
                        checkBracket = false;
                    }else{
                        tvOutput.setText("");
                        tvInput.setSelection(0);
                        tvInput.setText(process + "(");
                        tvInput.setSelection(process.length()+1);
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
