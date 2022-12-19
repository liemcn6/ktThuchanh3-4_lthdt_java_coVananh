package com.example.nhom4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class DateTime extends AppCompatActivity implements View.OnClickListener {

    private EditText et,ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);
        et=findViewById(R.id.eTime);
        ed=findViewById(R.id.eDate);
        et.setOnClickListener(this);
        ed.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view==et){
            Calendar c = Calendar.getInstance();
            int h = c.get(Calendar.HOUR_OF_DAY);
            int m= c.get(Calendar.MINUTE);
            TimePickerDialog timePickerDialog=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int hh, int mm) {
                    et.setText(hh +":"+mm);
                }
            },h,m,true);
            timePickerDialog.show();
        }
        if(view==ed){
        Calendar c=Calendar.getInstance();
        int y=c.get(Calendar.YEAR);
        int m=c.get(Calendar.MONTH);
        int d=c.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog dialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int yy, int mm, int dd) {
                    ed.setText(dd+"/"+(mm+1)+"/"+yy);
                }
            },y,m,d);
            dialog.show();
        }
    }
}