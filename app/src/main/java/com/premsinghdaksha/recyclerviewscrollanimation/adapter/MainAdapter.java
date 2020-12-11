package com.premsinghdaksha.recyclerviewscrollanimation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.premsinghdaksha.recyclerviewscrollanimation.R;
import com.premsinghdaksha.rvscrollanimation.RvScrollAnimation;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    Context mContext;
    ArrayList<String> data;
    RvScrollAnimation rvScrollAnimation;

    public MainAdapter(Context mContext, ArrayList<String> data) {
        this.mContext = mContext;
        this.data = data;
        this.rvScrollAnimation = new RvScrollAnimation();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.ansFaqs.setText(data.get(position));
        //here we callback rvScrollAnimation
        //rvScrollAnimation.scrollDownToTop(mContext, holder.crd);
        // rvScrollAnimation.scrollTopToDown(mContext, holder.crd);
        //  rvScrollAnimation.scrollLeftToRight(mContext, holder.crd);
        rvScrollAnimation.scrollrightToLeft(mContext, holder.crd);


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView ansFaqs;
        public CardView crd;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ansFaqs = itemView.findViewById(R.id.ansFaqs);
            crd = itemView.findViewById(R.id.crd);
        }
    }
}

