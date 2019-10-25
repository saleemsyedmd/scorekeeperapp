package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyOwnHolder> {
 String data1[],data2[];
 int img[];
 Context ctx;


    public MyOwnAdapter(Context ct, String s1[],String s2[], int i1[]){
        ctx = ct;
        data1 = s1;
        data2 = s2;
        img = i1;

    }

    @Override
    public MyOwnHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater myInflater = LayoutInflater.from(ctx);
        View myOwnView = myInflater.inflate(R.layout.my_row,parent ,false);
        return new MyOwnHolder(myOwnView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyOwnHolder holder, int position) {
        holder.t1.setText(data1[position]);
        holder.t2.setText(data2[position]);
        holder.imageView.setImageDrawable( img[position]);

    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder {
        TextView t1,t2;
        ImageView imageView;

        public MyOwnHolder( View itemView) {
            super();
            t1 = itemView.findViewById(R.id.textView3);
            t2 = itemView.findViewById(R.id.textView4);
            imageView= itemView.findViewById(R.id.imageView);
        }
    }
}
