package com.kingsley.android.kupsfood.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kingsley.android.kupsfood.Food;
import com.kingsley.android.kupsfood.R;

import java.util.ArrayList;

/**
 * Created by jioke on 6/23/17.
 */

public class FoodAdapter extends ArrayAdapter<Food> {

  public FoodAdapter(Activity context, ArrayList<Food> foods) {

    super(context, 0, foods);
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    // Check if the existing view is being reused, otherwise inflate the view
    View listItemView = convertView;
    if(listItemView == null) {
      listItemView = LayoutInflater.from(getContext()).inflate(
              R.layout.list_item,parent,false);
    }

    Food currentFood = getItem(position);

    TextView foodNameTextView = (TextView) listItemView.findViewById(R.id.food_name);
    foodNameTextView.setText(currentFood.getFoodName());

    TextView foodAmountTextView = (TextView) listItemView.findViewById(R.id.food_amount);
    foodAmountTextView.setText(currentFood.getFoodAmount());

    ImageView foodImageView = (ImageView) listItemView.findViewById(R.id.food_image_view);
    foodImageView.setImageResource(currentFood.getImageResourceId());

    return listItemView;
  }
}
