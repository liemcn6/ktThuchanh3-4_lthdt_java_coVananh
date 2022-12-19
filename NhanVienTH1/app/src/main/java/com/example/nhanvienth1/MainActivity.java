package com.example.nhanvienth1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.nhanvienth1.model.Employee;
import com.example.nhanvienth1.model.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private EditText editTextMaNV,editTextTenNV;
    private RadioGroup radioGroup;
    private RadioButton radioButtonNam,radioButtonNu;
    private Button buttonAdd,buttonUpdate;

    private MyAdapter adapter;
    private int currposition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Employee> listEmployee = new ArrayList<>();
        listEmployee.add(new Employee("125","Liem Hung",Employee.MALE));
        listEmployee.add(new Employee("124","Qang Hung",Employee.FEMALE));
        listEmployee.add(new Employee("122","A H Hung",Employee.MALE));
        listEmployee.add(new Employee("12","Long Hung",Employee.FEMALE));
        listEmployee.add(new Employee("15","Liem Long",Employee.MALE));

        initView();

        List<String> listMaNV = new ArrayList<>(),listTenNV=new ArrayList<>(),listGender=new ArrayList<>();
        for(Employee e : listEmployee){
            listMaNV.add(e.getMaNV());
            listTenNV.add(e.getTenNV());
            listGender.add(e.getGioiTinh());
        }
        adapter = new MyAdapter(listMaNV,listTenNV,listGender);
        adapter.setMyItemClick(new MyAdapter.OnMyItemClick() {
            @Override
            public void doSomething(int position) {
                currposition=position;
                editTextMaNV.setText(adapter.listText1.get(position));
                editTextTenNV.setText(adapter.listText2.get(position));
                if(adapter.listTextGender.get(position)==Employee.MALE)
                    radioButtonNam.setChecked(true);
                else radioButtonNu.setChecked(true);
                buttonAdd.setEnabled(false);
                buttonUpdate.setEnabled(true);
            }
        });

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

        handleAddClick();
        handleUpdateClick();
    }

    private void handleUpdateClick() {

        buttonUpdate.setOnClickListener(view -> {
            Employee e= packDatafromForm();
            adapter.updateItem(currposition,e.getMaNV(),e.getTenNV(),e.getGioiTinh());
            clearForm();
            buttonAdd.setEnabled(true);
            buttonUpdate.setEnabled(false);
        });
    }


    private Employee packDatafromForm() {
        String maNV=editTextMaNV.getText().toString();
        String tenNV=editTextTenNV.getText().toString();
        int radioId=radioGroup.getCheckedRadioButtonId();
        String gtinh=radioId==R.id.radio_btNam ? Employee.MALE : Employee.FEMALE;
        return new Employee(maNV,tenNV,gtinh);
    }

    private void handleAddClick() {
        buttonAdd.setOnClickListener(view -> {
            Employee e = packDatafromForm();
            adapter.addItem(e.getMaNV(),e.getTenNV(),e.getGioiTinh());
            clearForm();
        });
    }

    private void clearForm() {
        editTextMaNV.setText("");
        editTextTenNV.setText("");
        radioButtonNam.setChecked(true);
    }

    private void initView() {
        recyclerView=findViewById(R.id.recycleView);
        editTextMaNV=findViewById(R.id.edit_text_maNV);
        editTextTenNV=findViewById(R.id.edit_text_tenNV);
        radioGroup=findViewById(R.id.radioGroup);
        radioButtonNam=findViewById(R.id.radio_btNam);
        radioButtonNu=findViewById(R.id.radio_btNu);
        buttonAdd=findViewById(R.id.btn_add);
        buttonUpdate=findViewById(R.id.btn_update);
    }
}