package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvExpression,tvResult;
    private Button btOne,btTwo,btThree,btFour,btFive,btSix,btSeven,btEight,btNine,btZero,btDot,btAdd,btSub,btDiv,btMul,btEqual,btCe;
    double v1,v2;
    ImageButton btDel;
    private  Button btRoot,btPow,btMod;
    Boolean opAdd;
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';
    private  static  final char POW ='^';
    private  static  final char ROOT = 's';
    private  static  final char MOD = '%';
    private  static  final char NOT ='N';

    private char CURRENT_ACTION =NOT;
    String secondValue = new String();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
