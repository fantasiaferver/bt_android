package com.example.week4;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodsAdapter extends BaseAdapter {
    Context ctx;
    int layoutItem;
    ArrayList<Goods> arrayList;
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

    public CustomGoodsAdapter(Context ctx, int layoutItem, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // Ánh xạ
        view = LayoutInflater.from(ctx).inflate(layoutItem,viewGroup,false);
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvShopName =  view.findViewById(R.id.textView2);
        ImageView imgGoods = view.findViewById(R.id.imageView);

        // Truyền giá trị
        tvName.setText(arrayList.get(i).getName());
        tvShopName.setText((arrayList.get(i).getShopName()));
        imgGoods.setImageResource(arrayList.get(i).getImageGoods());

        return view;
    }
}
