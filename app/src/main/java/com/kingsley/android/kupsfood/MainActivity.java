package com.kingsley.android.kupsfood;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.kingsley.android.kupsfood.adapters.FoodAdapter;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      // Create a list of food.
      ArrayList<Food> foods = new ArrayList<Food>();
      foods.add(new Food("Yam Pottage", "#1,200", R.drawable.yam_pottage));
      foods.add(new Food("Egusi Soup", "#1,200", R.drawable.egusi_soup));

      FoodAdapter foodAdapter = new FoodAdapter(this, foods);

      ListView listView = (ListView) findViewById(R.id.list);

      listView.setAdapter(foodAdapter);


    }

}
