package com.example.nhom4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class BaitapListV extends AppCompatActivity {

    private ListView listView;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baitap_list_v);
        listView=findViewById(R.id.lv3);
        initListView();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int vitri, long l) {
                String s= adapter.getItem(vitri);
                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initListView() {
        String[] list =getResources().getStringArray(R.array.sanpham);
        adapter = new ArrayAdapter<>(this,R.layout.itemlistview,list);
        listView.setAdapter(adapter);
    }
}