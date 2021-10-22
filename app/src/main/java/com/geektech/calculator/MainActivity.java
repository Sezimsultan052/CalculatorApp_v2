package com.geektech.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Integer firstVariable, secondVariable;
    private String operation;

    boolean isEmpty = false;
    // boolean addition= false, subtract = false, multiplication = false, division = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);
    }

    public void onNumberClick(View view) {
//        if(division == true  || multiplication== true || subtract == true || addition == true){
//                tvResult.setText("");
        if (isEmpty == true) {
            tvResult.setText("");
            isEmpty = false;
        }

            switch (view.getId()) {
                case R.id.btn_one:
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("1");
                    } else {
                        tvResult.append("1");
                    }
                    break;
                case R.id.btn_two:
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("2");
                    } else {
                        tvResult.append("2");
                    }
                    break;
                case R.id.btn_clear:
                    tvResult.setText("0");
                    firstVariable = 0;
                    secondVariable = 0;
                    break;

                case R.id.btn_3:
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("3");
                    } else {
                        tvResult.append("3");
                    }
                    break;
                case R.id.btn_4:
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("4");
                    } else {
                        tvResult.append("4");
                    }
                    break;
                case R.id.btn_5:
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("5");
                    } else {
                        tvResult.append("5");
                    }
                    break;
                case R.id.btn_6:
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("6");
                    } else {
                        tvResult.append("6");
                    }
                    break;
                case R.id.btn_7:
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("7");
                    } else {
                        tvResult.append("7");
                    }
                    break;
                case R.id.btn_8:
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("8");
                    } else {
                        tvResult.append("8");
                    }
                    break;
                case R.id.btn_9:
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("9");
                    } else {
                        tvResult.append("9");
                    }
                    break;
            }
        }



    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                //12
                firstVariable = Integer.valueOf(tvResult.getText().toString());
                operation = "+";
                tvResult.setText(firstVariable + operation);
                break;
            case R.id.btn_multi:
                firstVariable = Integer.valueOf(tvResult.getText().toString());
                operation = "*";
                tvResult.setText(firstVariable + operation);
                break;
            case R.id.btn_div:
                firstVariable = Integer.valueOf(tvResult.getText().toString());
                operation = "/";
                tvResult.setText(firstVariable + operation);
                break;
            case R.id.btn_minus:
                firstVariable = Integer.valueOf(tvResult.getText().toString());
                operation = "-";
                tvResult.setText(firstVariable + operation);
                break;

            case R.id.btn_equal:
                //12+21
                String second = tvResult.getText().toString();
                second = second.replace(firstVariable + operation, "");
                //21
                if (!second.contains("=")) {
                    secondVariable = Integer.parseInt(second);
                    if (firstVariable != null) {
                        if(operation == "+"){
                        Integer result = firstVariable + secondVariable;
                        tvResult.setText(firstVariable + operation + secondVariable + "=" + result);
                        //addition = true;
                            isEmpty = true;

                        //12 + 21 = 33
                        }
                        if(operation == "-"){
                            Integer result = firstVariable - secondVariable;
                            tvResult.setText(firstVariable + operation + secondVariable + "=" + result);
                            //subtract = true;
                            isEmpty = true;

                        }
                        if(operation == "*"){
                            Integer result = firstVariable * secondVariable;
                            tvResult.setText(firstVariable + operation + secondVariable + "=" + result);
                            //multiplication = true;
                            isEmpty = true;

                        }
                        if(operation == "/"){
                            Integer result = firstVariable / secondVariable;
                            tvResult.setText(firstVariable + operation + secondVariable + "=" + result);
                            //division = true;
                            isEmpty = true;

                        }


                    }
                }


                break;


        }
    }
}