package com.kingsley.android.kupsfood;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView egusi = (TextView) findViewById(R.id.egusi_text_view);

        egusi.setOnClickListener(new OnClickListener() {

          @Override
          public void onClick(View view) {
            Intent egusiIntent = new Intent(MainActivity.this, EgusiDescriptionActivity.class);
            startActivity(egusiIntent);
          }
        });
    }

}
