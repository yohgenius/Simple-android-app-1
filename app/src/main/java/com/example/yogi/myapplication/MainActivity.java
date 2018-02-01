package com.example.yogi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Komunikasi> komunikasiList = new ArrayList<>();
    private RecyclerView recyclerView;
    private KomunikasiAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new KomunikasiAdapter(this,komunikasiList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                goToSecondActivity();
            }
        });

        prepareKomunikasiData();
    }

    private void prepareKomunikasiData() {
        Komunikasi komunikasi = new Komunikasi(R.mipmap.ic_launcher, "Action & Adventure", "2015");
        komunikasiList.add(komunikasi);

        komunikasi = new Komunikasi(R.mipmap.ic_launcher, "Animation", "2016");
        komunikasiList.add(komunikasi);

        komunikasi = new Komunikasi(R.mipmap.ic_launcher, "Kids", "2017");
        komunikasiList.add(komunikasi);

        komunikasi = new Komunikasi(R.mipmap.ic_launcher, "Family", "2018");
        komunikasiList.add(komunikasi);
        mAdapter.notifyDataSetChanged();
    }

    private void goToSecondActivity(){
        Intent intent= new Intent(this, KudaActivity.class);
        startActivity(intent);
    }
}