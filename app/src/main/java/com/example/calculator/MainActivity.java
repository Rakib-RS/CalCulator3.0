package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvExpression, tvResult;
    private Button btOne, btTwo, btThree, btFour, btFive, btSix, btSeven, btEight, btNine, btZero, btDot, btAdd, btSub, btDiv, btMul, btEqual, btCe;
    double v1, v2;
    ImageButton btDel;
    private Button btRoot, btPow, btMod;
    Boolean opAdd;
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';
    private static final char POW = '^';
    private static final char ROOT = 's';
    private static final char MOD = '%';
    private static final char NOT = 'N';

    private char CURRENT_ACTION = NOT;
    String secondValue = new String();

    double valueOne = Double.NaN;
    double valueTwo;

    // private DecimalFormat decimalFormat;

    /*public  MainActivity(double x ,double y){
        this.valueOne =x;
        this.valueTwo =y;
    }*/
    public void setValue() {
        this.tvExpression.setText(tvExpression.getText() + "" + this.valueTwo);
        this.CURRENT_ACTION = this.ADDITION;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        btZero = (Button) findViewById(R.id.tvZero);
        btOne = (Button) findViewById(R.id.tvOne);
        btTwo = (Button) findViewById(R.id.tvTwo);
        btThree = (Button) findViewById(R.id.tvThree);
        btFour = (Button) findViewById(R.id.tvFour);
        btFive = (Button) findViewById(R.id.tvFive);
        btSix = (Button) findViewById(R.id.tvSix);
        btSeven = (Button) findViewById(R.id.tvSeven);
        btEight = (Button) findViewById(R.id.tvEight);
        btNine = (Button) findViewById(R.id.tvNine);
        btDot = (Button) findViewById(R.id.tvDot);
        btRoot = (Button) findViewById(R.id.btRoot);
        btPow = (Button) findViewById(R.id.btPower);
        btMod = (Button) findViewById(R.id.btMod);

        btAdd = (Button) findViewById(R.id.tvPlus);
        btSub = (Button) findViewById(R.id.tvMinus);
        btMul = (Button) findViewById(R.id.tvMul);
        btDiv = (Button) findViewById(R.id.tvDivide);
        btEqual = (Button) findViewById(R.id.tvEquals);
        tvExpression = (TextView) findViewById(R.id.tvExpression);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btDel = (ImageButton) findViewById(R.id.tvBack);
        btCe = (Button) findViewById(R.id.tvClear);

        btDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpression.setText(tvExpression.getText() + ".");
                if (!Double.isNaN(valueOne))
                    secondValue += '.';
            }
        });
        btZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpression.setText(tvExpression.getText() + "0");
                if (!Double.isNaN(valueOne))
                    secondValue += '0';
            }
        });
        btOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpression.setText(tvExpression.getText()+"1");
                if (!Double.isNaN(valueOne))
                    secondValue+='1';
            }
        });
        btTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpression.setText(tvExpression.getText()+"2");
                if (!Double.isNaN(valueOne))
                    secondValue+='2';
            }
        });
        btThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpression.setText(tvExpression.getText()+"3");
                if (!Double.isNaN(valueOne))
                    secondValue+='3';
            }
        });
        btFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpression.setText(tvExpression.getText()+"4");
                if (!Double.isNaN(valueOne))
                    secondValue+='4';
            }
        });
        btFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpression.setText(tvExpression.getText()+"5");
                if (!Double.isNaN(valueOne))
                    secondValue+='5';
            }
        });
        btSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpression.setText(tvExpression.getText()+"6");
                if (!Double.isNaN(valueOne))
                    secondValue+='6';
            }
        });
        btSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpression.setText(tvExpression.getText()+"7");
                if (!Double.isNaN(valueOne))
                    secondValue+='7';
            }
        });
        btEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpression.setText(tvExpression.getText()+"8");
                if (!Double.isNaN(valueOne))
                    secondValue+='8';
            }
        });
        btNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpression.setText(tvExpression.getText()+"9");
                if (!Double.isNaN(valueOne))
                    secondValue+='9';
            }
        });
        //  operation
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computeCalculation();
                CURRENT_ACTION = ADDITION;
                // tvResult.setText(valueOne + "+");
                tvExpression.setText(tvExpression.getText()+""+"+");
                //tvExpression.setText(null);
               /* if (tvExpression == null) {
                    tvResult.setText("");
                } else {
                    v1 = Float.parseFloat(tvExpression.getText() + "");
                    opAdd = true;
                    tvExpression.setText(null);
                }*/
            }
        });
        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computeCalculation();
                CURRENT_ACTION = SUBTRACTION;
                //tvResult.setText(valueOne + "-");
                //tvExpression.setText(null);
                tvExpression.setText(tvExpression.getText()+""+"-");
            }
        });
        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computeCalculation();
                CURRENT_ACTION = MULTIPLICATION;
                tvExpression.setText(tvExpression.getText()+""+"*");

            }
        });
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computeCalculation();
                CURRENT_ACTION = DIVISION;
                tvExpression.setText(tvExpression.getText()+""+"/");

            }
        });

        btRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //computeCalculation();
                //tvResult.setText("√"+valueOne);
                CURRENT_ACTION =ROOT;
                //tvResult.setText("√");
                // tvExpression.setText(null);
                tvExpression.setText(tvExpression.getText()+""+"√");
            }
        });
        btPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computeCalculation();
                CURRENT_ACTION = POW;
                tvExpression.setText(tvExpression.getText()+""+"^");
            }
        });
        btMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computeCalculation();
                CURRENT_ACTION = MOD;
                tvExpression.setText(tvExpression.getText()+""+"%");
            }
        });

        btEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computeCalculation();
                if (CURRENT_ACTION == ROOT) {
                    valueTwo =valueOne;
                    CharSequence s= tvExpression.getText();
                    s=s.subSequence(1,s.length());
                    valueOne =Double.parseDouble(s+"");
                    tvResult.setText("ok");
                    //tvExpression.setText(tvExpression.getText()+""+valueOne);
                    valueOne = Math.sqrt(valueOne);
                }

                tvResult.setText(""+valueOne);
                // tvExpression.setText(tvExpression.getText()+""+valueTwo);
                valueOne=Double.NaN;
                CURRENT_ACTION =NOT;
                secondValue="";
                /*v2 = Float.parseFloat(tvExpression.getText()+ "");

                if (opAdd == true) {
                    tvResult.setText(v1 + v2 + "");
                    opAdd = false;
                }*/
            }
        });



        btDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvExpression.getText().length() > 0) {
                    CharSequence currentText = tvExpression.getText();
                    tvExpression.setText(currentText.subSequence(0, currentText.length()-1));
                }
                else {
                    valueOne = Double.NaN;
                    valueTwo = Double.NaN;
                    tvExpression.setText("");
                    tvResult.setText("");
                }
            }
        });
        btDel.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                valueOne = Double.NaN;
                valueTwo = Double.NaN;
                tvResult.setText("");
                tvExpression.setText("");
                return true;
            }
        });
        btCe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Double.NaN;
                valueTwo = Double.NaN;
                tvResult.setText("");
                tvExpression.setText("");
                secondValue="";
            }
        });
    }
    public void computeCalculation() {
        if (!Double.isNaN(valueOne)) {
            //CharSequence sequence  =tvExpression.getText();
            //tvExpression.setText(null);
            //binding.editText.setText(null);
            valueTwo = Double.parseDouble(secondValue);

            if (CURRENT_ACTION == ADDITION)
                valueOne = this.valueOne + valueTwo;
            else if (CURRENT_ACTION == SUBTRACTION)
                valueOne = this.valueOne - valueTwo;
            else if (CURRENT_ACTION == MULTIPLICATION)
                valueOne = this.valueOne * valueTwo;
            else if (CURRENT_ACTION == DIVISION)
                valueOne = this.valueOne / valueTwo;
            else if (CURRENT_ACTION == ROOT)
                valueOne = Math.sqrt(this.valueOne);
            else if (CURRENT_ACTION == POW)
                valueOne = Math.pow(this.valueOne, valueTwo);
            else if (CURRENT_ACTION == MOD)
                valueOne = valueOne % valueTwo;

        } else {
            try {

                valueOne = Double.parseDouble(tvExpression.getText() + "");
                   /* if(CURRENT_ACTION==ROOT){
                        CharSequence s= tvExpression.getText();
                        s=s.subSequence(1,s.length());
                        valueOne =Double.parseDouble(s+"");
                        tvResult.setText("ok");
                    }*/
            } catch (Exception e) {
            }
        }
    }
}
