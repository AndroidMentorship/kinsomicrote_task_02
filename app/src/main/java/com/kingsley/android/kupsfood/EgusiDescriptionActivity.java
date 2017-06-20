package com.kingsley.android.kupsfood;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EgusiDescriptionActivity extends Activity {

  int quantity = 3;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_egusi_description);
  }

  public void decreaseFoodQuantity(View view){
    quantity = quantity - 1;
    displayQuantity(quantity);
  }

  public void increaseFoodQuantity(View view){
    quantity = quantity + 1;
    displayQuantity(quantity);
  }

  private void displayQuantity(int foodQuantity) {
    TextView foodQuantityTextView = (TextView) findViewById(R.id.food_quantity_text_view);
    foodQuantityTextView.setText("" + foodQuantity);
  }
}
