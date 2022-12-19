package com.example.nhanvienth1.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nhanvienth1.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    public interface OnMyItemClick{
        void doSomething(int position);
    }
    private OnMyItemClick myItemClick;

    public void setMyItemClick(OnMyItemClick myItemClick) {
        this.myItemClick = myItemClick;
    }

    public List<String> listText1,listText2,listTextGender;

    public MyAdapter(List<String> listText1, List<String> listText2, List<String> listTextGender) {
        this.listText1 = listText1;
        this.listText2 = listText2;
        this.listTextGender = listTextGender;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.my_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        int imgId=listTextGender.get(position)==Employee.MALE ? R.drawable.male : R.drawable.female;
        holder.imageView.setImageResource(imgId);
        holder.textView.setText(listText1.get(position)+"-"+listText2.get(position));

        holder.buttonDelete.setOnClickListener(view -> {
            deleteItem(listText1.get(position),listText2.get(position),listTextGender.get(position));
        });

        holder.cardView.setOnClickListener(view -> {
            myItemClick.doSomething(position);
        });

    }

    private void deleteItem(String txt1,String txt2, String txtGender) {
        listText1.remove(txt1);
        listText2.remove(txt2);
        listTextGender.remove(txtGender);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return listTextGender.size();
    }

    public  void addItem(String txt1,String txt2, String txtGender){
        listText1.add(txt1);
        listText2.add(txt2);
        listTextGender.add(txtGender);
        notifyDataSetChanged();
    }
    public void updateItem(int position,String txt1,String txt2, String txtGender){
        listText1.set(position,txt1);
        listText2.set(position,txt2);
        listTextGender.set(position,txtGender);
        notifyDataSetChanged();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private CardView cardView;
        private ImageView imageView;
        private TextView textView;
        private Button buttonDelete;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView=itemView.findViewById(R.id.cardView);
            imageView=itemView.findViewById(R.id.imageView);
            textView=itemView.findViewById(R.id.textView);
            buttonDelete=itemView.findViewById(R.id.btnDelete);
        }
    }
}
