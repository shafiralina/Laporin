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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FormActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textForm;
    Spinner spinner;
    Button buttonCek, buttonKirimLaporan;
    EditText formKoordinat;

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

        textForm = findViewById(R.id.textForm);
        switch (menu){
            case "menu4":
                Drawable gambar = getResources().getDrawable(R.drawable.menu4);
                randview.setBackground(gambar);
                textForm.setText("Beritahu Kami Jika Ada Masalah di jalan Raya");
                spinner = findViewById(R.id.spinner);

                String[] data = getResources().getStringArray(R.array.masalahJalan);
                List<String> list = new ArrayList<String>();
                for(int i=0; i<data.length; i++){
                    list.add(data[i]);
                }
                ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, list);
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(dataAdapter);
                break;

            case "menu2":
                randview.setBackground(getResources().getDrawable(R.drawable.menu2));
                textForm.setText("Beritahu Kami Jika Ada Masalah di Penerangan");
                spinner = findViewById(R.id.spinner);

                String[] data2 = getResources().getStringArray(R.array.masalahPenerangan);
                List<String> list2 = new ArrayList<String>();
                for(int i=0; i<data2.length; i++){
                    list2.add(data2[i]);
                }
                ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, list2);
                dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(dataAdapter2);
                break;

            case "menu5":
                randview.setBackground(getResources().getDrawable(R.drawable.menu5));
                textForm.setText("Beritahu Kami Jika Ada Masalah di Kebersihan");
                spinner = findViewById(R.id.spinner);

                String[] data5 = getResources().getStringArray(R.array.masalahKebersihan);
                List<String> list5 = new ArrayList<String>();
                for(int i=0; i<data5.length; i++){
                    list5.add(data5[i]);
                }
                ArrayAdapter<String> dataAdapter5 = new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, list5);
                dataAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(dataAdapter5);
                break;

            case "menu3":
                randview.setBackground(getResources().getDrawable(R.drawable.menu3));
                textForm.setText("Beritahu Kami Jika Ada Masalah di Kriminal");
                spinner = findViewById(R.id.spinner);

                String[] data3 = getResources().getStringArray(R.array.masalahKriminal);
                List<String> list3 = new ArrayList<String>();
                for(int i=0; i<data3.length; i++){
                    list3.add(data3[i]);
                }
                ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, list3);
                dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(dataAdapter3);
                break;
        }

        buttonCek = findViewById(R.id.buttonCek);
        buttonCek.setOnClickListener(this);

        buttonKirimLaporan = findViewById(R.id.buttonKirimLaporan);
        buttonKirimLaporan.setOnClickListener(this);

        formKoordinat = findViewById(R.id.edt_koordinat);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonCek:
                formKoordinat.setText("-7.2413975,112.7322592");
            break;

            case R.id.buttonKirimLaporan:
                CharSequence text = "Aplikasi sedang dalam pengembangan";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(this, text, duration);
                toast.show();
        }

    }
}
