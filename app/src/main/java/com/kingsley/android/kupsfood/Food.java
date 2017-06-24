package com.kingsley.android.kupsfood;

/**
 * Created by jioke on 6/23/17.
 */

public class Food {

  private String mFoodName;

  private String mFoodAmount;

  private int mImageResourceId;

  public Food(String vFoodName, String vFoodAmount, int imageResourceId) {
    mFoodName = vFoodName;
    mFoodAmount = vFoodAmount;
    mImageResourceId = imageResourceId;
  }

  /**
   * Get the name of the food
   */

  public String getFoodName() {
    return mFoodName;
  }

  /**
   * Get the amount of the food
   */

  public String getFoodAmount() {
    return mFoodAmount;
  }

  /**
   * Get the image resource ID
   */

  public int getImageResourceId() {
    return mImageResourceId;
  }
}
