package com.example.laporin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_form);

        View randview = new View(getBaseContext());
        randview = (View)findViewById(R.id.hedaerMenu);

        String menu = getIntent().getStringExtra("menu");
        switch (menu){
            case "menu4":
                randview.setBackground(getResources().getDrawable(R.drawable.menu4));
                break;

            case "menu2":
                randview.setBackground(getResources().getDrawable(R.drawable.menu2));
                break;

            case "menu5":
                randview.setBackground(getResources().getDrawable(R.drawable.menu5));
                break;

            case "menu3":
                randview.setBackground(getResources().getDrawable(R.drawable.menu3));
                break;
        }
    }
}
