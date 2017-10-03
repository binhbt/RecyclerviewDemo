package com.demo.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String[] imageArray = {
            "https://pbs.twimg.com/media/C5TmUksXUAgWknF.jpg",
            "https://st.depositphotos.com/1589996/2855/i/950/depositphotos_28556887-stock-photo-cartoon-character-funny-avatar.jpg",
            "https://pbs.twimg.com/media/C5TmUksXUAgWknF.jpg",
            "https://st.depositphotos.com/1589996/2855/i/950/depositphotos_28556887-stock-photo-cartoon-character-funny-avatar.jpg",
            "https://pbs.twimg.com/media/C5TmUksXUAgWknF.jpg",
            "https://st.depositphotos.com/1589996/2855/i/950/depositphotos_28556887-stock-photo-cartoon-character-funny-avatar.jpg",
            "https://pbs.twimg.com/media/C5TmUksXUAgWknF.jpg",
            "https://st.depositphotos.com/1589996/2855/i/950/depositphotos_28556887-stock-photo-cartoon-character-funny-avatar.jpg",
            "https://pbs.twimg.com/media/C5TmUksXUAgWknF.jpg",
            "https://st.depositphotos.com/1589996/2855/i/950/depositphotos_28556887-stock-photo-cartoon-character-funny-avatar.jpg",
            "http://68.media.tumblr.com/efb16f585d5b4da38126ee347a1a2c96/tumblr_ok8ti3bLK91vuzd7xo3_250.png"
    };

    String[] nameArray = {
            "Nguyễn văn A",
            "Nguyễn văn B",
            "Nguyễn văn C",
            "Nguyễn văn D",
            "Nguyễn văn E",
            "Nguyễn văn F",
            "Nguyễn văn G",
            "Nguyễn văn H",
            "Nguyễn văn I",
            "Nguyễn văn K",
            "Nguyễn văn X"
    };

    String[] statusArray = {
            "Active",
            "Active",
            "Active",
            "Not Active",
            "Active",
            "Active",
            "Not Active",
            "Active",
            "Active",
            "Active",
            "Not Active"
    };

    String[] mobileArray = {
            "01692353048",
            "01692353049",
            "01692353050",
            "01692353051",
            "01692353052",
            "01692353053",
            "01692353054",
            "01692353055",
            "01692353056",
            "01692353057",
            "01692353058"
    };
    private RecyclerView recyclerView;
    private MyAdapter mAdapter;
    private ArrayList<User> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        data = new ArrayList<>();
        for (int i =0; i< nameArray.length; i++){
            User user = new User(imageArray[i], nameArray[i], statusArray[i], mobileArray[i]);
            data.add(user);
        }
        mAdapter = new MyAdapter(data, this);
        recyclerView.setAdapter(mAdapter);
    }
}
