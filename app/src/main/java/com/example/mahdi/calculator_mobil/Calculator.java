package com.example.mahdi.calculator_mobil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    public String operation;
    int first_number;
    int secend_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        final TextView texbox1 = findViewById(R.id.textbox1);
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btndel = findViewById(R.id.buttondel);
        Button btn5 = findViewById(R.id.button5);
        Button btn6 = findViewById(R.id.button6);
        Button btn7 = findViewById(R.id.button7);
        Button btnmin = findViewById(R.id.buttonmin);
        Button btn9 = findViewById(R.id.button9);
        Button btn10 = findViewById(R.id.button10);
        Button btn11 = findViewById(R.id.button11);
        Button btndevid = findViewById(R.id.buttondevid);
        Button btn13 = findViewById(R.id.button13);
        Button btnmul = findViewById(R.id.buttonmul);
        Button btnresult  = findViewById(R.id.buttonresult);
        Button btnplus = findViewById(R.id.buttonplus);
        Button btncls = findViewById(R.id.btncls);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               texbox1.setText(texbox1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texbox1.setText(texbox1.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texbox1.setText(texbox1.getText()+"3");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texbox1.setText(texbox1.getText()+"4");
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texbox1.setText(texbox1.getText()+"5");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texbox1.setText(texbox1.getText()+"6");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texbox1.setText(texbox1.getText()+"7");
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texbox1.setText(texbox1.getText()+"8");
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texbox1.setText(texbox1.getText()+"9");
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texbox1.setText(texbox1.getText()+"0");
            }
        });

        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text= texbox1.getText().toString();
                if (text.length() > 0) {
                    text = text.substring(0, text.length() - 1);
                }
                texbox1.setText(text);
            }
        });


        btnmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "-";
                first_number = Integer.parseInt(texbox1.getText().toString());
                texbox1.setText("");
            }
        });


        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (operation == "-") {
                    secend_number = Integer.parseInt(texbox1.getText().toString());
                   texbox1.setText(String.valueOf(first_number-secend_number));
               }
               if(operation == "+")
               {
                   secend_number = Integer.parseInt(texbox1.getText().toString());
                   texbox1.setText(String.valueOf(first_number+secend_number));
               }
                if(operation == "/")
                {
                    secend_number = Integer.parseInt(texbox1.getText().toString());
                    texbox1.setText(String.valueOf(first_number/secend_number));
                }
                if(operation == "*")
                {
                    secend_number = Integer.parseInt(texbox1.getText().toString());
                    texbox1.setText(String.valueOf(first_number*secend_number));
                }
            }
        });
        btndevid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "/";
                first_number = Integer.parseInt(texbox1.getText().toString());
                texbox1.setText("");
            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "+";
                first_number = Integer.parseInt(texbox1.getText().toString());
                texbox1.setText("");
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "*";
                first_number = Integer.parseInt(texbox1.getText().toString());
                texbox1.setText("");
            }
        });
        btncls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texbox1.setText("");
                first_number=0;
                secend_number=0;
            }
        });

    }
    }
