package com.kingsley.android.kupsfood.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.kingsley.android.kupsfood.Food;
import com.kingsley.android.kupsfood.R;

/**
 * Created by jioke on 6/23/17.
 */

public class FoodAdapter extends ArrayAdapter<Food> {
  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    // Check if the existing view is being reused, otherwise inflate the view
    View listView = convertView;
    if(listView == null) {
      listItemView = LayoutInflater.from(getContext()).inflate(
              R.layout.list_item,parent,false);
    }

    Food currentFood = getItem(position);
    TextView foodName = (TextView) listItemView.findViewById(R.id.food_name);
    foodName.setText(currentFood.getFoodAmount());
  }
}
