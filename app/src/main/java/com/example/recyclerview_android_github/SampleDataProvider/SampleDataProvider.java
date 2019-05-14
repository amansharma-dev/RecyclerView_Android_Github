package com.example.recyclerview_android_github.SampleDataProvider;

import com.example.recyclerview_android_github.Model.DataItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleDataProvider {
    public static List<DataItem> dataItemList;
    public static Map<String,DataItem> stringDataItemMap;

    static {
        dataItemList = new ArrayList<>();
        stringDataItemMap = new HashMap<>();

        addItem(new DataItem(null,"Banana",5.99,"This Sticker is inspired from Banana","one.png"));
        addItem(new DataItem(null,"Fries",9.99,"This Sticker is inspired from Fries","two.png"));
        addItem(new DataItem(null,"Cat",7.99,"This Sticker is inspired from Cat","three.png"));
        addItem(new DataItem(null,"Heart",7.99,"This Sticker is inspired from Heart","four.png"));
        addItem(new DataItem(null,"Electric Bolt",5.99,"This Sticker is inspired from Electric Bolt","five.png"));
        addItem(new DataItem(null,"Alien",5.99,"This Sticker is inspired from Alien","six.png"));

        addItem(new DataItem(null,"Banana",5.99,"This Sticker is inspired from Banana","one.png"));
        addItem(new DataItem(null,"Fries",9.99,"This Sticker is inspired from Fries","two.png"));
        addItem(new DataItem(null,"Cat",7.99,"This Sticker is inspired from Cat","three.png"));
        addItem(new DataItem(null,"Heart",7.99,"This Sticker is inspired from Heart","four.png"));
        addItem(new DataItem(null,"Electric Bolt",5.99,"This Sticker is inspired from Electric Bolt","five.png"));
        addItem(new DataItem(null,"Alien",5.99,"This Sticker is inspired from Alien","six.png"));

        addItem(new DataItem(null,"Banana",5.99,"This Sticker is inspired from Banana","one.png"));
        addItem(new DataItem(null,"Fries",9.99,"This Sticker is inspired from Fries","two.png"));
        addItem(new DataItem(null,"Cat",7.99,"This Sticker is inspired from Cat","three.png"));
        addItem(new DataItem(null,"Heart",7.99,"This Sticker is inspired from Heart","four.png"));
        addItem(new DataItem(null,"Electric Bolt",5.99,"This Sticker is inspired from Electric Bolt","five.png"));
        addItem(new DataItem(null,"Alien",5.99,"This Sticker is inspired from Alien","six.png"));

        addItem(new DataItem(null,"Banana",5.99,"This Sticker is inspired from Banana","one.png"));
        addItem(new DataItem(null,"Fries",9.99,"This Sticker is inspired from Fries","two.png"));
        addItem(new DataItem(null,"Cat",7.99,"This Sticker is inspired from Cat","three.png"));
        addItem(new DataItem(null,"Heart",7.99,"This Sticker is inspired from Heart","four.png"));
        addItem(new DataItem(null,"Electric Bolt",5.99,"This Sticker is inspired from Electric Bolt","five.png"));
        addItem(new DataItem(null,"Alien",5.99,"This Sticker is inspired from Alien","six.png"));
    }

    private static void addItem(DataItem item){
        dataItemList.add(item);
        stringDataItemMap.put(item.getStickerId(),item);
    }
}
