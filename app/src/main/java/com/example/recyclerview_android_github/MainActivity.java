package com.example.recyclerview_android_github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerview_android_github.Model.DataItem;
import com.example.recyclerview_android_github.SampleDataProvider.SampleDataProvider;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DataItemAdapter dataItemAdapter;
    private List<DataItem> dataItemList = SampleDataProvider.dataItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        dataItemAdapter = new DataItemAdapter(this,dataItemList);

        recyclerView.setAdapter(dataItemAdapter);
    }
}
