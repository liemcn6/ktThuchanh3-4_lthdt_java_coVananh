package com.example.nhom4.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.nhom4.R;

public class TechnologyAdapter extends ArrayAdapter<Technology> {
    private Context context;
    private Technology[] mList;

    public TechnologyAdapter(@NonNull Context context, Technology[] mList) {
        super(context, R.layout.item_tech,mList);
        this.context=context;
        this.mList=mList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.item_tech,null,true);

        ImageView img=view.findViewById(R.id.img);
        TextView tName=view.findViewById(R.id.tName);
        TextView tSub=view.findViewById(R.id.tSub);
        TextView tDescribe=view.findViewById(R.id.tDescribe);
        Technology t=mList[position];
        img.setImageResource(t.getImg());
        tName.setText(t.getName());
        tSub.setText(t.getSub());
        tDescribe.setText(t.getDescribe());

        return view;
    }
    public Technology getItem(int position){
        return mList[position];
    }
}
