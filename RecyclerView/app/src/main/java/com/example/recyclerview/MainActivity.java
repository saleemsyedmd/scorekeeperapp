 package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView r1 ;
    String s1[],s2[];
    int imageResource[] ={R.drawable.catimage, R.drawable.dogimage,R.drawable.orangutan,R.drawable.rabbit,R.drawable.sheep,R.drawable.snake};
    MyOwnAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = findViewById(R.id.myRecycler);
        s1 = getResources().getStringArray(R.array.petname);
        s2 = getResources().getStringArray(R.array.pet_desc);
        ad = new  MyOwnAdapter(this,s1,s2,imageResource);
        r1.setAdapter(ad);
        r1.setLayoutManager(new LinearLayoutManager(this));
    }
}
