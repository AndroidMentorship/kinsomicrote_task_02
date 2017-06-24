package com.kingsley.android.kupsfood.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.kingsley.android.kupsfood.R;

public class EgusiDescriptionActivity extends Activity {

  int quantity = 3;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_egusi_description);

    Button guestButton = (Button) findViewById(R.id.guest_order_button);

    guestButton.setOnClickListener(new OnClickListener () {

      @Override
      public void onClick(View view) {
        Intent guestIntent = new Intent(EgusiDescriptionActivity.this, ShippingConfirmationActivity.class);
        startActivity(guestIntent);
      }
    });
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
