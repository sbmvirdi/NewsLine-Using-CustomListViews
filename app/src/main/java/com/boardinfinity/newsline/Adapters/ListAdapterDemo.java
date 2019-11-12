package com.boardinfinity.newsline.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.boardinfinity.newsline.R;


public class ListAdapterDemo extends ArrayAdapter<String> {
    private String newsname[],newsrating[];
    private Integer newsimage[];
    private Context mContext;

    public ListAdapterDemo(@NonNull Context context, int resource, String newsname[],String newsrating[],Integer newsImage[]) {
        super(context, resource,newsname) ;
        this.newsname = newsname;
        this.newsrating = newsrating;
        this.newsimage  = newsImage;
        this.mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.news_row,parent,false);
        TextView name = v.findViewById(R.id.newsname);
        TextView rating = v.findViewById(R.id.newsrating);
        ImageView logo = v.findViewById(R.id.newsicon);
        name.setText(newsname[position]);
        rating.setText(newsrating[position]);
        logo.setImageResource(newsimage[position]);
        return v;


    }



}
