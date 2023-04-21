package com.example.calculatorking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class PhoneActivity extends AppCompatActivity {

    Button mbutton0,mbutton1,mbutton2,mbutton3,mbutton4,mbutton5,mbutton6,mbutton7,mbutton8,mbutton9
            ,mbuttonadd,mbuttonsub,mbuttondiv,mbuttonmul, mbuttondec,
            mbuttonequal,mbuttonclr,mbuttonsqrt,mbuttonsin,mbuttoncos;
    EditText et;
    Double a,b;
    boolean add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);



        et = (EditText) findViewById(R.id.edittext);
        mbutton0 = (Button) findViewById(R.id.n0);
        mbutton1 = (Button) findViewById(R.id.n1);
        mbutton2 = (Button) findViewById(R.id.n2);
        mbutton3 = (Button) findViewById(R.id.n3);
        mbutton4 = (Button) findViewById(R.id.n4);
        mbutton5 = (Button) findViewById(R.id.n5);
        mbutton6 = (Button) findViewById(R.id.n6);
        mbutton7 = (Button) findViewById(R.id.n7);
        mbutton8 = (Button) findViewById(R.id.n8);
        mbutton9 = (Button) findViewById(R.id.n9);
        mbuttonadd = (Button) findViewById(R.id.nadd);
        mbuttonsub = (Button) findViewById(R.id.nsub);
        mbuttondiv = (Button) findViewById(R.id.ndiv);
        mbuttonmul = (Button) findViewById(R.id.nmul);
        mbuttondec = (Button) findViewById(R.id.ndec);
        mbuttonequal = (Button) findViewById(R.id.nequal);
        mbuttonclr = (Button) findViewById(R.id.clr);
        mbuttonsin = (Button) findViewById(R.id.Sin);
        mbuttoncos = (Button) findViewById(R.id.Cos);
        mbuttonsqrt = (Button) findViewById(R.id.sqrt);


        mbutton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"0");
            }
        });

        mbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"1");
            }
        });

        mbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"2");
            }
        });

        mbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"3");
            }
        });

        mbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"4");
            }
        });

        mbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"5");
            }
        });

        mbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"6");
            }
        });

        mbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"7");
            }
        });

        mbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"8");
            }
        });

        mbutton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"9");
            }
        });

        mbuttondec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+".");
            }
        });

        mbuttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(et.getText()+"");
                add=true;
                et.setText(null);
            }
        });

        mbuttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(et.getText()+"");
                sub=true;
                et.setText(null);
            }
        });

        mbuttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(et.getText()+"");
                mul=true;
                et.setText(null);
            }
        });

        mbuttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(et.getText()+"");
                div=true;
                et.setText(null);
            }
        });

        mbuttonclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(null);
            }
        });

        mbuttonsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(et.getText()+"");
                Double x=Math.sin(Math.toRadians(a));
                et.setText(String.valueOf(x));

            }
        });

        mbuttoncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(et.getText()+"");
                Double x=Math.cos(Math.toRadians(a));
                et.setText(String.valueOf(x));

            }
        });

        mbuttoncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(et.getText()+"");
                Double x=Math.cos(Math.toRadians(a));
                et.setText(String.valueOf(x));

            }
        });

        mbuttonsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(et.getText()+"");
                Double x=Math.sqrt(a);
                et.setText(String.valueOf(x));

            }
        });

        mbuttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=Double.parseDouble(et.getText()+"");
                if(add==true)
                {
                    et.setText(""+(a+b));
                    add=false;

                }

                if(sub==true)
                {
                    et.setText((a-b)+"");
                    sub=false;
                }

                if(mul==true)
                {
                    et.setText((a*b)+"");
                    mul=false;
                }

                if(div==true)
                {
                    if(b==0)
                    {
                        et.setText("Infinite");
                    }
                    else
                    {
                        et.setText((a / b) + "");
                    }
                    div=false;
                }
            }
        });
    }
}

