package com.example.recyclerview_android_github;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recyclerview_android_github.Model.DataItem;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DataItemAdapter extends RecyclerView.Adapter<DataItemAdapter.ViewHolder> {

    public static  final String ITEM_ID_KEY = "item_id_key";
    private List<DataItem> dataItemList;
    private Context context;

    public DataItemAdapter(Context context,List<DataItem> dataItemList) {
        this.dataItemList = dataItemList;
        this.context = context;
    }

    @NonNull
    @Override
    public DataItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.list_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataItemAdapter.ViewHolder viewHolder, final int i) {

        final DataItem dataItem = dataItemList.get(i);

        try {
            viewHolder.stickerName.setText(dataItem.getStickerName());
            String imageFile = dataItem.getStickerImage();
            InputStream inputStream = context.getAssets().open(imageFile);
            Drawable drawable = Drawable.createFromStream(inputStream,null);
            viewHolder.stickerImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        viewHolder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Toast.makeText(context,"You Selected : "+dataItem.getStickerName(),Toast.LENGTH_SHORT).show();

                String stickerId = dataItem.getStickerId();
                Intent intent = new Intent(context,DetailActivity.class);
                intent.putExtra(ITEM_ID_KEY,stickerId);
                context.startActivity(intent);
            }
        });

        viewHolder.view.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(context,"You Long Clicked : "+dataItem.getStickerName(),Toast.LENGTH_SHORT).show();

                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView stickerName;
        ImageView stickerImage;

        View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            stickerImage = itemView.findViewById(R.id.imageView);
            stickerName = itemView.findViewById(R.id.itemNameText);

            view = itemView;
        }
    }
}
