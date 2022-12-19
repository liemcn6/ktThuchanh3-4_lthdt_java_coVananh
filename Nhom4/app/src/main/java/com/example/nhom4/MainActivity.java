package com.example.nhom4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner sp,sp1,sp2;
    private CheckBox c1,c2,c3;
    private RadioButton r1,r2;
    private RatingBar rb1;
    private TextView tv1;
    private Button bt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1);
        sp=findViewById(R.id.sp2);
        String[] list={"PTIT","HUC","HUST","NUCE"};
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.item,list);
        sp.setAdapter(adapter);
        initView();
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kq="";
                String temp="";
                String temp1="";
                if(c1.isChecked()) {
                    temp+=c1.getText()+",";
                }
                if(c2.isChecked()) {
                    temp+=c2.getText()+",";
                }
                if(c3.isChecked()) {
                    temp+=c3.getText()+",";
                }
                if(temp.endsWith(",")) {
                    temp=temp.substring(0,temp.length()-1);
                }
                if(r1.isSelected()){
                    temp1+=r1.getText();
                }else temp1+=r2.getText();

                try {
                    kq = "Platform :"+ temp +"\n"
                            +"Gender :"+temp1 +"\n"
                            +"Rate :"+rb1.getRating()+"\n"
                            +"Country :"+sp1.getSelectedItem().toString()+"\n"
                            +"University :"+sp2.getSelectedItem().toString();
                    tv1.setText(kq);
                }catch (NumberFormatException e){

                }
            }
        });
    }

    private void initView() {
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        rb1=findViewById(R.id.rb1);
        sp1=findViewById(R.id.sp1);
        sp2=findViewById(R.id.sp2);
        tv1=findViewById(R.id.tv1);
        bt1=findViewById(R.id.bt1);
    }

//    public void hienthi(View v){
//    String kq="";
//    String temp="",temp1="";
//    if(c1.isSelected()) {
//        temp+=c1.getText().toString()+",";
//    }
//    if(c2.isSelected()) {
//            temp+=c2.getText().toString()+",";
//    }
//    if(c3.isSelected()) {
//            temp+=c3.getText().toString();
//    }
//    if(r1.isSelected()){
//        temp1+=r1.getText().toString();
//    }else temp1+=r2.getText().toString();
//
//    try {
//        kq = "Platform :"+ temp +"\n"
//                +"Gender :"+temp1 +"\n"
//                +"Rate :"+rb1.getRating()+"\n"
//                +"Country :"+sp1.getSelectedItem().toString()+"\n"
//                +"University :"+sp2.getSelectedItem().toString();
//        tv1.setText(kq);
//    }catch (NumberFormatException e){
//
//    }

//
//    }
}