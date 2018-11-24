package com.example.liangchen.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator = new Calculator();
        Button button_0 = (Button) findViewById(R.id.button_zero);
        Button button_1 = (Button) findViewById(R.id.button_1);
        Button button_2 = (Button) findViewById(R.id.button_2);
        Button button_3 = (Button) findViewById(R.id.button_3);
        Button button_4 = (Button) findViewById(R.id.button_4);
        Button button_5 = (Button) findViewById(R.id.button_5);
        Button button_6 = (Button) findViewById(R.id.button_6);
        Button button_7 = (Button) findViewById(R.id.button_7);
        Button button_8 = (Button) findViewById(R.id.button_8);
        Button button_9 = (Button) findViewById(R.id.button_9);
        Button button_poi = (Button) findViewById(R.id.button_point);
        Button button_per = (Button) findViewById(R.id.button_per);
        Button button_eq = (Button) findViewById(R.id.button_eq);
        Button button_AC = (Button) findViewById(R.id.button_AC_C);
        Button button_as = (Button) findViewById(R.id.button_as);
        Button button_add = (Button) findViewById(R.id.button_add);
        Button button_sub = (Button) findViewById(R.id.button_sub);
        Button button_mul = (Button) findViewById(R.id.button_mul);
        Button button_div = (Button) findViewById(R.id.button_division);
        final TextView txtResult = (TextView) findViewById(R.id.MyScreen);
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char fir = txtResult.getText().charAt(0);
                if (fir != '0') {
                    txtResult.setText(txtResult.getText() + "0");
                } else txtResult.setText("0");
                calculator.button("0");
            }
        });
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char fir = txtResult.getText().charAt(0);
                if (fir != '0') {
                    txtResult.setText(txtResult.getText() + "1");
                } else txtResult.setText("1");
                calculator.button("1");
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char fir = txtResult.getText().charAt(0);
                if (fir != '0') {
                    txtResult.setText(txtResult.getText() + "2");
                } else txtResult.setText("2");
                calculator.button("2");
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char fir = txtResult.getText().charAt(0);
                if (fir != '0') {
                    txtResult.setText(txtResult.getText() + "3");
                } else txtResult.setText("3");
                calculator.button("3");
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char fir = txtResult.getText().charAt(0);
                if (fir != '0') {
                    txtResult.setText(txtResult.getText() + "4");
                } else txtResult.setText("4");
                calculator.button("4");
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char fir = txtResult.getText().charAt(0);
                if (fir != '0') {
                    txtResult.setText(txtResult.getText() + "5");
                } else txtResult.setText("5");
                calculator.button("5");
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char fir = txtResult.getText().charAt(0);
                if (fir != '0') {
                    txtResult.setText(txtResult.getText() + "6");
                } else txtResult.setText("6");
                calculator.button("6");
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char fir = txtResult.getText().charAt(0);
                if (fir != '0') {
                    txtResult.setText(txtResult.getText() + "7");
                } else txtResult.setText("7");
                calculator.button("7");
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char fir = txtResult.getText().charAt(0);
                if (fir != '0') {
                    txtResult.setText(txtResult.getText() + "8");
                } else txtResult.setText("8");
                calculator.button("8");
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char fir = txtResult.getText().charAt(0);
                if (fir != '0') {
                    txtResult.setText(txtResult.getText() + "9");
                } else txtResult.setText("9");
                calculator.button("9");
            }
        });
        button_poi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char fin = txtResult.getText().charAt(txtResult.getText().length() - 1);
                if (fin != '.') {
                    txtResult.setText(txtResult.getText() + ".");
                } else txtResult.setText(txtResult.getText());
                calculator.button(".");
            }
        });
        button_per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(calculator.button("%"));
            }
        });
        button_eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(calculator.button("="));

            }
        });
        button_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("0");
                calculator.button("AC");
            }
        });
        button_as.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txtResult.setText(calculator.button("X"));
            }
        });
        button_add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                char operator = txtResult.getText().charAt(txtResult.getText().length() - 1);
                if (operator != '+') {
                    txtResult.setText(txtResult.getText() + "+");
                    calculator.button("+");
                } else txtResult.setText(txtResult.getText());
            }
        });
        button_sub.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                char operator = txtResult.getText().charAt(txtResult.getText().length() - 1);
                if (operator != '-') {
                    txtResult.setText(txtResult.getText() + "-");
                    calculator.button("-");
                } else txtResult.setText(txtResult.getText());
            }
        });
        button_mul.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                char operator = txtResult.getText().charAt(txtResult.getText().length() - 1);
                if (operator != 'X') {
                    txtResult.setText(txtResult.getText() + "X");
                    calculator.button("*");
                } else txtResult.setText(txtResult.getText());
            }
        });
        button_div.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                char operator = txtResult.getText().charAt(txtResult.getText().length() - 1);
                if (operator != '÷') {
                    txtResult.setText(txtResult.getText() + "÷");
                    calculator.button("/");
                } else txtResult.setText(txtResult.getText());
            }
        });
    }
}


