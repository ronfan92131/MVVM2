package com.doyen.fans.mvvm;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NoteAdapter extends RecyclerView.Adapter {

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class NoteHolder extends RecyclerView.ViewHolder{

        private TextView textViewTitle;
        private TextView textViewDescription;
        private TextView textViewPriority;

     //   public NoteHolder{

 //       }

        public NoteHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
