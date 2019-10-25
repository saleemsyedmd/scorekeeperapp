package com.example.recyclerview2;


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

    public WordListAdapter() {
        mWordList = new LinkedList<>();

        private LayoutInflater mInflater;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {

    }


    class WordViewHolder extends RecyclerView.ViewHolder {
        public final TextView wordItemView;
        final WordListAdapter mAdapter;
        private final LayoutInflater mInflater;


        public WordViewHolder(View itemView, WordListAdapter adapter, LayoutInflater mInflater) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word);
            this.mAdapter = adapter;
            this.mInflater = mInflater;
        }

        public WordViewHolder(View mItemView, WordViewHolder wordViewHolder, TextView wordItemView, WordListAdapter mAdapter) {

            this.wordItemView = wordItemView;
            this.mAdapter = mAdapter;
            mInflater =;
        }

        @NonNull
        @Override
        public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View mItemView = mInflater.inflate(R.layout.wordlist_item,
                    parent, false);
            return new WordViewHolder(mItemView, this, wordItemView, mAdapter);

        }

        @Override
        public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
            String mCurrent = mWordList.get(position);
            holder.wordItemView.setText(mCurrent);
        }
        }

        @Override
        public int getItemCount() {
            return mWordList.size();
        }


    }
    private LayoutInflater mInflater;
}