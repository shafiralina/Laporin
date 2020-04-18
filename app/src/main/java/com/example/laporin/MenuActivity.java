package com.example.laporin;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.view.View;

import java.io.ByteArrayOutputStream;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener{

    CardView menu4,menu2,menu5,menu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menu4 = findViewById(R.id.layout_jalan_raya);
        menu4.setOnClickListener(this);

        menu2 = findViewById(R.id.layout_lampu);
        menu2.setOnClickListener(this);

        menu5 = findViewById(R.id.layout_sampah);
        menu5.setOnClickListener(this);

        menu3 = findViewById(R.id.layout_kejahatan);
        menu3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.layout_jalan_raya:
                Intent moveToForm = new Intent(this,FormActivity.class);
                moveToForm.putExtra("menu", "menu4");
                startActivity(moveToForm);
                break;

            case R.id.layout_lampu:
                Intent moveToForm2 = new Intent(this,FormActivity.class);
                moveToForm2.putExtra("menu", "menu2");
                startActivity(moveToForm2);
                break;

            case R.id.layout_sampah:
                Intent moveToForm5 = new Intent(this,FormActivity.class);
                moveToForm5.putExtra("menu", "menu5");
                startActivity(moveToForm5);
                break;

            case R.id.layout_kejahatan:
                Intent moveToForm3 = new Intent(this,FormActivity.class);
                moveToForm3.putExtra("menu", "menu3");
                startActivity(moveToForm3);
                break;
        }

    }
}
