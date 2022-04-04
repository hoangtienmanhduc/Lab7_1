package com.example.baitaplab7_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

public class adapterCity extends BaseAdapter {
    Context context;
    int idLayout;
    List<City> arrayList;

    public adapterCity(Context context, int idLayout, List<City> arrayList) {
        this.context = context;
        this.idLayout = idLayout;
        this.arrayList = arrayList;
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(idLayout,viewGroup,false);
        TextView txtcity =view.findViewById(R.id.name_city);
        ConstraintLayout constraintLayout = view.findViewById(R.id.idLayout);
        txtcity.setText(arrayList.get(i).getNameCity());
        return view;
    }
}
