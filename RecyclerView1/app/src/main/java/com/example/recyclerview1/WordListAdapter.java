package com.example.recyclerview1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class WordListAdapter extends
        RecyclerView.Adapter<WordListAdapter.WordViewHolder>  {

    private final LinkedList<String> mWordList;
    private LayoutInflater mInflater;

    public WordListAdapter(MainActivity mainActivity, LinkedList<String> mWordList) {
        this.mWordList = mWordList;
        mInflater= LayoutInflater.from(mainActivity);
    }

    class WordViewHolder extends RecyclerView.ViewHolder {
        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word);
            this.mAdapter = adapter;
        }
        public final TextView wordItemView;
        final WordListAdapter mAdapter;
    }

    @Override
    public WordViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item,parent,false);
        return new WordViewHolder(mItemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {
           String mCurrent = mWordList.get(position);
           holder.wordItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }
}

