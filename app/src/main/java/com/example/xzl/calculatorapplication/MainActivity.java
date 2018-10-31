package com.example.xzl.calculatorapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOne=(Button)findViewById(R.id.ButtonOne);
        Button btnTwo=(Button)findViewById(R.id.ButtonTwo);
        Button btnThree=(Button)findViewById(R.id.ButtonThree);
        Button btnFour=(Button)findViewById(R.id.ButtonFour);
        Button btnFive=(Button)findViewById(R.id.ButtonFive);
        Button btnSix=(Button)findViewById(R.id.ButtonSix);
        Button btnSeven=(Button)findViewById(R.id.ButtonSeven);
        Button btnEight=(Button)findViewById(R.id.ButtonEight);
        Button btnNine=(Button)findViewById(R.id.ButtonNine);
        Button btnAdd=(Button)findViewById(R.id.ButtonAdd);
        Button btnSub=(Button)findViewById(R.id.ButtonSub);
        Button btnMul=(Button)findViewById(R.id.ButtonMul);
        Button btnDiv=(Button)findViewById(R.id.ButtonDiv);
        Button btnEqual=(Button)findViewById(R.id.ButtonEqual);
        Button btnDel=(Button)findViewById(R.id.ButtonDel);
        Button btnClear=(Button)findViewById(R.id.ButtonClear);
        Button btnPoint=(Button)findViewById(R.id.ButtonPoint);
        Button btnZero=(Button)findViewById(R.id.ButtonZero);
        final TextView ClaSc=(TextView)findViewById(R.id.ClaSc);
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClaSc.setText(ClaSc.getText() + "0");
            }});
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClaSc.setText(ClaSc.getText() + "1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClaSc.setText(ClaSc.getText() + "2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClaSc.setText(ClaSc.getText() + "3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClaSc.setText(ClaSc.getText() + "4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClaSc.setText(ClaSc.getText() + "5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClaSc.setText(ClaSc.getText() + "6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClaSc.setText(ClaSc.getText() + "7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClaSc.setText(ClaSc.getText() + "8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClaSc.setText(ClaSc.getText() + "9");
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] last=ClaSc.getText().toString().split("[-+*/]");
                if(last[last.length-1].equals(""))
                    ClaSc.setText(ClaSc.getText() + "0");
                if(!last[last.length-1].contains("."))
                ClaSc.setText(ClaSc.getText() + ".");

            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ClaSc.getText().equals(""))
                if(!ClaSc.getText().subSequence(ClaSc.getText().length()-1,ClaSc.getText().length()).toString().equals("+"))
                    if(!ClaSc.getText().subSequence(ClaSc.getText().length()-1,ClaSc.getText().length()).toString().equals("-"))
                        if(!ClaSc.getText().subSequence(ClaSc.getText().length()-1,ClaSc.getText().length()).toString().equals("*"))
                            if(!ClaSc.getText().subSequence(ClaSc.getText().length()-1,ClaSc.getText().length()).toString().equals("/"))
                    ClaSc.setText(ClaSc.getText() + "+");
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ClaSc.getText().equals(""))
                if(!ClaSc.getText().subSequence(ClaSc.getText().length()-1,ClaSc.getText().length()).toString().equals("+"))
                    if(!ClaSc.getText().subSequence(ClaSc.getText().length()-1,ClaSc.getText().length()).toString().equals("-"))
                        if(!ClaSc.getText().subSequence(ClaSc.getText().length()-1,ClaSc.getText().length()).toString().equals("*"))
                            if(!ClaSc.getText().subSequence(ClaSc.getText().length()-1,ClaSc.getText().length()).toString().equals("/"))
                ClaSc.setText(ClaSc.getText() + "-");
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ClaSc.getText().equals(""))
                if(!ClaSc.getText().subSequence(ClaSc.getText().length()-1,ClaSc.getText().length()).toString().equals("+"))
                    if(!ClaSc.getText().subSequence(ClaSc.getText().length()-1,ClaSc.getText().length()).toString().equals("-"))
                        if(!ClaSc.getText().subSequence(ClaSc.getText().length()-1,ClaSc.getText().length()).toString().equals("*"))
                            if(!ClaSc.getText().subSequence(ClaSc.getText().length()-1,ClaSc.getText().length()).toString().equals("/"))
                ClaSc.setText(ClaSc.getText() + "*");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ClaSc.getText().equals(""))
                if(!ClaSc.getText().subSequence(ClaSc.getText().length()-1,ClaSc.getText().length()).toString().equals("+"))
                    if(!ClaSc.getText().subSequence(ClaSc.getText().length()-1,ClaSc.getText().length()).toString().equals("-"))
                        if(!ClaSc.getText().subSequence(ClaSc.getText().length()-1,ClaSc.getText().length()).toString().equals("*"))
                            if(!ClaSc.getText().subSequence(ClaSc.getText().length()-1,ClaSc.getText().length()).toString().equals("/"))
                ClaSc.setText(ClaSc.getText() + "/");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClaSc.setText("");
            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ClaSc.getText().equals(""))
                ClaSc.setText(ClaSc.getText().subSequence(0,ClaSc.getText().length()-1));
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ClaSc.getText().equals(""))
                getresualt();
            }
        });
    }
    protected void getresualt(){
        final TextView ClaSc=(TextView)findViewById(R.id.ClaSc);
        String[] num=ClaSc.getText().toString().split("[-+*/]");
        String[] ope=ClaSc.getText().toString().split("[0123456789.]+");
        int i=0;
        Log.v("TAGHJULJ","error*"+ope[i+1]+"error*");
        Log.v("TAGHJULJ","error*"+num[i]+"error*");
        Log.v("TAGHJULJ","error*"+"error*");
        while(ope.length>i+1)
        {
            if(ope[i+1].equals("*")){
                Log.v("TAGHJULJ","error*");
                num[i+1]=Float.toString(Float.parseFloat(num[i])*Float.parseFloat(num[++i]));
            }
            else if(ope[i+1].equals("/")){
                Log.v("TAGHJULJ","error/");
               num[i+1]=Float.toString(Float.parseFloat(num[i])/Float.parseFloat(num[++i]));
            }

            else if(ope[i+1].equals("+")&ope.length>i+2) {
                if(ope[i+2].equals("*")){
                Log.v("TAGHJULJ","error+*");
                ope[i+2]=ope[i+1];
                num[i+2]=Float.toString(Float.parseFloat(num[i+2])*Float.parseFloat(num[++i]));
                num[i]=num[i-1];
                }
                else if(ope[i+2].equals("/")){
                    Log.v("TAGHJULJ","error+/");
                ope[i+2]=ope[i+1];
                num[i+2]=Float.toString(Float.parseFloat(num[i+2])/Float.parseFloat(num[++i]));
                num[i]=num[i-1];
                }
                else num[i+1]=Float.toString(Float.parseFloat(num[i])+Float.parseFloat(num[++i]));
            }
            else if(ope[i+1].equals("+")){
                Log.v("TAGHJULJ","error+");
                num[i+1]=Float.toString(Float.parseFloat(num[i])+Float.parseFloat(num[++i]));}
            else if(ope[i+1].equals("-")&ope.length>i+2) {
                if(ope[i+2].equals("*")){
                    Log.v("TAGHJULJ","error-*");
                    ope[i+2]=ope[i+1];
                    num[i+2]=Float.toString(Float.parseFloat(num[i+2])*Float.parseFloat(num[++i]));
                    num[i]=num[i-1];
                }
                else if(ope[i+2].equals("/")){
                    Log.v("TAGHJULJ","error-/");
                    ope[i+2]=ope[i+1];
                    num[i+2]=Float.toString(Float.parseFloat(num[i+2])/Float.parseFloat(num[++i]));
                    num[i]=num[i-1];
                }
                else num[i+1]=Float.toString(Float.parseFloat(num[i])- Float.parseFloat(num[++i]));
            }
            else if(ope[i+1].equals("-")){
                Log.v("TAGHJULJ","error-");
                num[i+1]=Float.toString(Float.parseFloat(num[i])-Float.parseFloat(num[++i]));}
        }

        if(num[i].split("\\.")[1].equals("0"))
            ClaSc.setText(num[i].toCharArray(),0,num[i].length()-2);
            else ClaSc.setText(num[i]);
        Log.v("TAGHJULJ","error**");
    }
    protected void getres(){
        final TextView ClaSc=(TextView)findViewById(R.id.ClaSc);
        String[] num={"0","0"};
        float res=0;
        if(ClaSc.getText().toString().contains("+")){
            num= ClaSc.getText().toString().split("\\+");
            res=  Float.parseFloat(num[0])+Float.parseFloat(num[1]);
        }
        else if (ClaSc.getText().toString().contains("-")){
            num= ClaSc.getText().toString().split("-");
            res= Float.parseFloat(num[0])-Float.parseFloat(num[1]);
        }
        else if (ClaSc.getText().toString().contains("*")) {
            num= ClaSc.getText().toString().split("\\*");
            res=  Float.parseFloat(num[0])*Float.parseFloat(num[1]);
        }
        else if (ClaSc.getText().toString().contains("/")) {
            num= ClaSc.getText().toString().split("/");
            res=  Float.parseFloat(num[0])+Float.parseFloat(num[1]);
        }
        if(ClaSc.getText().toString().contains("."))
            ClaSc.setText(Float.toString(res));
        else ClaSc.setText(Integer.toString((int)res));
    }
}

