package com.example.alarmappp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainActivity extends AppCompatActivity {


    private TimePicker time;
    private TextView rslt;
    private Button btn1;
    private TextView rslt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a=10;

        time=(TimePicker) findViewById(R.id.alm1);
        rslt=(TextView) findViewById(R.id.tvrslt);
        rslt1=(TextView) findViewById(R.id.et2);
        btn1=(Button) findViewById(R.id.btn);


        time.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                String am="";
                if(hourOfDay>12)
                {
                    am="PM";
                }else{
                    am="AM";
                }
                if (hourOfDay==13){
                    hourOfDay=1;
                }else if(hourOfDay==14){
                    hourOfDay=2;
                }else if(hourOfDay==15){
                    hourOfDay=3;
                }else if(hourOfDay==16){
                    hourOfDay=4;
                }else if(hourOfDay==17){
                    hourOfDay=5;
                }else if(hourOfDay==18){
                    hourOfDay=6;
                }else if(hourOfDay==19){
                    hourOfDay=7;
                }else if(hourOfDay==20){
                    hourOfDay=8;
                }else if(hourOfDay==21){
                    hourOfDay=9;
                }else if(hourOfDay==22){
                    hourOfDay=10;
                }else if(hourOfDay==23){
                    hourOfDay=11;
                }else if(hourOfDay==24){
                    hourOfDay=12;
                }
                final String ab="Hour:"+hourOfDay+" , Minute:"+minute+":"+am;
                rslt.setText(ab);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String xyz=ab;
                        rslt1.setText(String.valueOf(a));

                        rslt1.setText(xyz);
                        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                        LocalDateTime now=LocalDateTime.now();
                        System.out.println(dtf.format(now));
                    }
                });



            }
        });



    }
}
