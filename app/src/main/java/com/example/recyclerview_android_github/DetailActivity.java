package com.example.recyclerview_android_github;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recyclerview_android_github.Model.DataItem;
import com.example.recyclerview_android_github.SampleDataProvider.SampleDataProvider;

import java.io.IOException;
import java.io.InputStream;
import java.text.NumberFormat;
import java.util.Locale;

public class DetailActivity extends AppCompatActivity {

    private TextView stickerName,stickerPrice,stickerDescription;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        DataItem dataItem = getIntent().getExtras().getParcelable(DataItemAdapter.ITEM_KEY);
        if (dataItem != null) {

            Toast.makeText(this,"Received Sticker : "+dataItem.getStickerName(),Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(getApplicationContext(),"Didnt get any data",Toast.LENGTH_SHORT).show();
        }

        stickerName = findViewById(R.id.sticker_title_textview);
        stickerPrice = findViewById(R.id.sticker_price_textview);
        stickerDescription = findViewById(R.id.sticker_description_textview);

        imageView = findViewById(R.id.sticker_imageview_details);

        stickerName.setText(dataItem.getStickerName());
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.getDefault());
        stickerPrice.setText(numberFormat.format(dataItem.getStickerPrice()));

        stickerDescription.setText(dataItem.getStickerDescription());
        try {
            String imageFile = dataItem.getStickerImage();
            InputStream inputStream = getAssets().open(imageFile);
            Drawable drawable = Drawable.createFromStream(inputStream,null);
            imageView.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
