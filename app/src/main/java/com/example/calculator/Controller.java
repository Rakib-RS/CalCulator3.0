package com.example.calculator;

public class Controller extends  MainActivity {
    public void computeCalculation() {
        if(!Double.isNaN(valueOne)) {
            //CharSequence sequence  =tvExpression.getText();
            //tvExpression.setText(null);
            //binding.editText.setText(null);
            valueTwo =Double.parseDouble(secondValue);

            if(CURRENT_ACTION == ADDITION)
                valueOne = this.valueOne + valueTwo;
            else if(CURRENT_ACTION == SUBTRACTION)
                valueOne = this.valueOne - valueTwo;
            else if(CURRENT_ACTION == MULTIPLICATION)
                valueOne = this.valueOne * valueTwo;
            else if(CURRENT_ACTION == DIVISION)
                valueOne = this.valueOne / valueTwo;
            else if(CURRENT_ACTION==ROOT)
                valueOne = Math.sqrt(this.valueOne);
            else if(CURRENT_ACTION == POW)
                valueOne =Math.pow(this.valueOne,valueTwo);
            else if(CURRENT_ACTION == MOD)
                valueOne =valueOne%valueTwo;

        }
        else {
            try{

                valueOne = Double.parseDouble(tvExpression.getText()+"");
                   /* if(CURRENT_ACTION==ROOT){
                        CharSequence s= tvExpression.getText();
                        s=s.subSequence(1,s.length());
                        valueOne =Double.parseDouble(s+"");
                        tvResult.setText("ok");
                    }*/
            }
            catch (Exception e){}
        }
    }
}
