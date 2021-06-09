package com.example.gridview_with_base_adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import android.widget.GridView;
import android.widget.ImageView;

public class imageAdapter extends BaseAdapter {

    public Integer[] imagearry={R.drawable.err,R.drawable.hild_care_black_24dp,R.drawable.bubble_chart_black_24dp,R.drawable.restaurant_menu,R.drawable.err,R.drawable.hild_care_black_24dp,R.drawable.bubble_chart_black_24dp,R.drawable.restaurant_menu};
    private Context mcontext;

    public imageAdapter( Context c) {
        mcontext = c;
    }

    @Override
    public int getCount() {
        return imagearry.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if(convertView==null){
            imageView=new ImageView(mcontext);
            imageView.setLayoutParams(new GridView.LayoutParams(100,100));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);
        }
        else{
            imageView= (ImageView) convertView;
        }
        imageView.setImageResource(imagearry[position]);
        return imageView;
    }
}
