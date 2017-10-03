package com.demo.recyclerviewdemo;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by t430 on 9/27/2017.
 */

public class MyAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private LayoutInflater mInflater;
    private ArrayList<User> items;
    private MainActivity mActivity;
    public MyAdapter(ArrayList<User> data, MainActivity activity) {
        this.items = data;
        this.mActivity = activity;
        this.mInflater = LayoutInflater.from(mActivity);
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootCategoryView = mInflater.inflate(R.layout.row_item, parent, false);
        return new MessageViewHolder(rootCategoryView, this);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        User model = items.get(position);
        MessageViewHolder messageViewHolder = (MessageViewHolder) holder;
        Picasso.with(mActivity).load(model.getAvatar()).into(messageViewHolder.imageViewIcon);
        messageViewHolder.textViewName.setText(model.getName());
        messageViewHolder.textViewStatus.setText(model.getStatus());
        messageViewHolder.textViewMobile.setText(model.getMobile());
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }
    private class MessageViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageViewIcon;
        private TextView textViewName;
        private TextView textViewStatus;
        private TextView textViewMobile;
        private CardView cardView;

        private MessageViewHolder(View itemView, MyAdapter adapter) {
            super(itemView);
            imageViewIcon = (ImageView) itemView.findViewById(R.id.imageViewIcon);
            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            textViewStatus = (TextView) itemView.findViewById(R.id.textViewStatus);
            textViewMobile = (TextView) itemView.findViewById(R.id.textViewMobile);
            cardView = (CardView) itemView.findViewById(R.id.cardView);

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final int pos = getAdapterPosition();
                    if (pos >= 0) {
                        Toast.makeText(mActivity, "Selected Item Position "+pos, Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

    }
}
