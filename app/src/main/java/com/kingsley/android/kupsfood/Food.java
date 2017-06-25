package com.kingsley.android.kupsfood;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jioke on 6/23/17.
 */

public class Food implements Parcelable {

  private String mFoodName;

  private String mFoodAmount;

  private int mImageResourceId;

  @Override
  public int describeContents() {
    return 0;
  }

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

  public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(mFoodName);
    dest.writeInt(mImageResourceId);
    dest.writeString(mFoodAmount);
  }

  public Food(Parcel parcel) {
    mFoodName = parcel.readString();
    mImageResourceId = parcel.readInt();
    mFoodAmount = parcel.readString();
  }

  public static final Parcelable.Creator<Food> CREATOR = new Parcelable.Creator<Food>() {

    @Override
    public  Food createFromParcel(Parcel parcel) {
      return new Food(parcel);
    }

    @Override
    public Food[] newArray(int size) {
      return new Food[size];
    }
  };
}
