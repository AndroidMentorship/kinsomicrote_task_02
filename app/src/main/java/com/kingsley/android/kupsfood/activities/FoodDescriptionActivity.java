package com.kingsley.android.kupsfood.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.kingsley.android.kupsfood.Food;

public class FoodDescriptionActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    Intent intent = getIntent();
    Food food = intent.getParcelableExtra("Food");

    String mFoodName = food.getFoodName();
    Integer mImageResourceId = food.getImageResourceId();
    String mFoodAmount = food.getFoodAmount();
  }
}
