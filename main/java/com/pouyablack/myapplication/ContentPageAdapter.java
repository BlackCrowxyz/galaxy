package com.pouyablack.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ContentPageAdapter extends RecyclerView.Adapter<ContentPageAdapter.ContentViewHolder> {

    private Context context;
    private List<Items> contents = new ArrayList<>();

    ContentPageAdapter(Context context) {
        this.context = context;
    }

    public void setContentPageAdapter(List<Items> contents){
        this.contents = contents;
        notifyDataSetChanged(); //???what is this???
    }

    @NonNull
    @Override
    public ContentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContentViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_for_listview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContentViewHolder holder, int position) {
        holder.bindItems(contents.get(position));
    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    static class ContentViewHolder extends RecyclerView.ViewHolder{
        private ImageButton imageView;
        private TextView chapterTitle;
        ContentViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageBtn);
            chapterTitle = itemView.findViewById(R.id.imageName_tv);
        }

        void bindItems(final Items items){
            Picasso.get().load(items.getFeatureImage()).into(imageView);
            chapterTitle.setText(items.getText());
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(), items.getDestinationActivity()));
                }
            });
        }
    }

}