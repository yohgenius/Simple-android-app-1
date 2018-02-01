package com.example.yogi.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.widget.Toast;


import java.util.List;

import static com.example.yogi.myapplication.R.id.mainLayout;
import static com.example.yogi.myapplication.R.id.title;

/**
 * Created by yogi on 31/01/18.
 */

public class KomunikasiAdapter extends RecyclerView.Adapter<KomunikasiAdapter.MyHolder> {

    private Context context;

    public KomunikasiAdapter(Context context, List<Komunikasi> komunikasiList) {
        this.context = context;
        this.komunikasiList = komunikasiList;
    }

    @Override
    public KomunikasiAdapter.MyHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.komunikasi_list_row, viewGroup, false);
        return new MyHolder(itemView);
    }

    @Override
    public void onBindViewHolder(KomunikasiAdapter.MyHolder myHolder, int position) {
        Komunikasi komunikasi = komunikasiList.get(position);
        myHolder.img_android.setImageResource(komunikasiList.get(position).getImgUrl());
        myHolder.title.setText(komunikasi.getTitle());
        myHolder.subtitle.setText(komunikasi.getSubtitle());
    }

    @Override
    public int getItemCount() {
        return komunikasiList.size();
    }

    public KomunikasiAdapter(List<Komunikasi> komunikasiList){
        this.komunikasiList = komunikasiList;

    }

    private List<Komunikasi> komunikasiList;

    public class MyHolder extends RecyclerView.ViewHolder {
        public TextView title, subtitle;
        public ImageView img_android;
        public MyHolder(View itemView) {
            super(itemView);
            img_android = (ImageView) itemView.findViewById(R.id.img_android);
            title = (TextView) itemView.findViewById(R.id.title);
            subtitle = (TextView) itemView.findViewById(R.id.subtitle);
            itemView.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v) {
                    Toast.makeText(context, title.getText(), Toast.LENGTH_LONG).show();
                }

            });
        }
    }
}
