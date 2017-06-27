package com.kingsley.android.kupsfood;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.kingsley.android.kupsfood.activities.FoodDescriptionActivity;
import com.kingsley.android.kupsfood.adapters.FoodAdapter;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      // Create a list of food.
      final ArrayList<Food> foods = new ArrayList<Food>();
      foods.add(new Food("Yam Pottage", "#1,200", R.drawable.yam_pottage));
      foods.add(new Food("Egusi Soup", "#1,200", R.drawable.egusi_soup));

      FoodAdapter foodAdapter = new FoodAdapter(this, foods);

      ListView listView = (ListView) findViewById(R.id.list);

      listView.setAdapter(foodAdapter);

      listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
        @Override
        public void onItemClick(AdapterView<?>adapter, View v,int position, long id) {

          Intent intent = new Intent(MainActivity.this, FoodDescriptionActivity.class);
          intent.putExtra("Food", food);
          startActivity(intent);
        }
      });
    }

}
