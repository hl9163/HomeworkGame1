package com.example.homeworkgame1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean first =true;
    boolean second =false;
    boolean thered = false;

    int sum1 = 0;
    int sum2=0;
    int sum3 =0;
    int count_c =0;

    TextView tv;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    EditText et1;
    EditText et2;
    EditText et3;
    ImageView iv;
    ImageView iv1;
    ImageView iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv =(TextView) findViewById(R.id.textView);
        tv1 =(TextView) findViewById(R.id.textView2);
        et1 = (EditText) findViewById(R.id.editTextNumber);
        iv = (ImageView) findViewById(R.id.imageView);

        tv2 =(TextView) findViewById(R.id.textView3);
        tv3 =(TextView) findViewById(R.id.textView4);
        et2 = (EditText) findViewById(R.id.editTextNumber2);
        iv1 = (ImageView) findViewById(R.id.imageView2);

        tv4 = (TextView) findViewById(R.id.textView5);
        tv5 = (TextView) findViewById(R.id.textView6);
        et3 = (EditText) findViewById(R.id.editTextNumber3);
        iv2 = (ImageView) findViewById(R.id.imageView4);
        if (first == true){
            int num = getRandom();
            String msg1 = String.valueOf(num);
            tv.setText(msg1);

            int num2 = getRandom();
            String msg2 = String.valueOf(num2);
            tv1.setText(msg2);

            sum1 = num+num2;

        }
    }

    public void gofirst(View view) {
        if(first == true){
            String st = et1.getText().toString();
            int an = Integer.parseInt(st);
            if (an == sum1){
                iv.setImageResource(R.drawable.good);
                count_c++;
            }
            else{
                iv.setImageResource(R.drawable.notgood);
            }
            second = true;
            if (second == true){
                String msg3 = String.valueOf(sum1);
                tv2.setText(msg3);

                int num2 = getRandom();
                String msg4 = String.valueOf(num2);
                tv3.setText(msg4);

                sum2 = sum1+num2;
            }
        }
        first= false;

    }
    public static int getRandom(){
        double v = Math.random() * (99 - 10) + 10;
        int ran = (int)v;
        return ran;
    }

    public void gosecond(View view) {
        if (second==true){
            String st = et2.getText().toString();
            int an = Integer.parseInt(st);
            if (an == sum2){
                iv1.setImageResource(R.drawable.good);
                count_c++;
            }
            else{
                iv1.setImageResource(R.drawable.notgood);
            }
            thered=true;
            if (thered==true){
                String msg5 = String.valueOf(sum2);
                tv4.setText(msg5);

                int num2 = getRandom();
                String msg6 = String.valueOf(num2);
                tv5.setText(msg6);

                sum3 = sum2+num2;

            }
        }
        second=false;
    }

    public void golast(View view) {
        if (thered==true){
            String st = et3.getText().toString();
            int an = Integer.parseInt(st);
            if (an == sum3){
                iv2.setImageResource(R.drawable.good);
                count_c++;
            }
            else{
                iv2.setImageResource(R.drawable.notgood);
            }
            String fainal_msg = "";
            if (count_c ==3){
                fainal_msg = "100/100%, 3/3";
            }
            else if(count_c ==2){
                fainal_msg = "66.66/100%, 2/3";
            }
            else if(count_c == 1){
                fainal_msg = "33.33/100%, 1/3";
            }
            else{
                fainal_msg = "0/100%, 0/3";
            }
            Toast.makeText(this, fainal_msg, Toast.LENGTH_LONG).show();

        }
        thered=false;
    }

    public void goreset(View view) {
        first =true;
        second =false;
        thered = false;
        count_c =0;
        sum1 =0;
        sum2 =0;
        tv.setText("");
        tv1.setText("");
        tv2.setText("");
        tv3.setText("");
        tv4.setText("");
        tv5.setText("");
        iv.setImageResource(R.drawable.white2);
        iv1.setImageResource(R.drawable.white2);
        iv2.setImageResource(R.drawable.white2);
        if (first == true){
            int num = getRandom();
            String msg1 = String.valueOf(num);
            tv.setText(msg1);

            int num2 = getRandom();
            String msg2 = String.valueOf(num2);
            tv1.setText(msg2);

            sum1 = num+num2;

        }
    }
}