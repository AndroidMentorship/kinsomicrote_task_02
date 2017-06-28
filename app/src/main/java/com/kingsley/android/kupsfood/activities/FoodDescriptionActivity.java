package com.kingsley.android.kupsfood.activities;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.kingsley.android.kupsfood.Food;
import com.kingsley.android.kupsfood.R;

import java.util.ArrayList;

public class FoodDescriptionActivity extends Activity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_food_description);

    Intent intent = getIntent();

    // Get food image

    final int image = getIntent().getIntExtra("image", 0);

    ImageView foodImage = (ImageView) findViewById(R.id.food_image_desc);
    foodImage.setImageResource(image);

    // Get food name

    TextView foodNameTextView = (TextView) findViewById(R.id.food_name_text_view);
    foodNameTextView.setText(intent.getStringExtra("name"));

    // Get food price

    TextView foodPriceTextView = (TextView) findViewById(R.id.food_price_text_view);
    foodPriceTextView.setText(intent.getStringExtra("price"));
  }
}
