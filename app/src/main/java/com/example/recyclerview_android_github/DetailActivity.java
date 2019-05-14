package com.example.recyclerview_android_github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.recyclerview_android_github.Model.DataItem;
import com.example.recyclerview_android_github.SampleDataProvider.SampleDataProvider;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String stickerId = getIntent().getExtras().getString(DataItemAdapter.ITEM_ID_KEY);
        DataItem dataItem = SampleDataProvider.stringDataItemMap.get(stickerId);
        Toast.makeText(this,"Received Sticker : "+dataItem.getStickerName(),Toast.LENGTH_SHORT).show();

    }
}
