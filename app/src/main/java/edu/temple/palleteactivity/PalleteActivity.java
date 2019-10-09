package edu.temple.palleteactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Spinner;

public class PalleteActivity extends AppCompatActivity {

    String[] colors = {"WHITE", "RED", "YELLOW", "GREEN", "BLUE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner colorSpinner = (Spinner) findViewById(R.id.colorSpinner);
        colorSpinner.setBackgroundColor(Color.parseColor("WHITE"));
        CustomAdapter colorAdapter = new CustomAdapter(this, colors);
        colorSpinner.setAdapter(colorAdapter);

        colorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                CustomAdapter clickedItem = (CustomAdapter) adapterView.getItemAtPosition(i);
                Intent launchIntent = new Intent(PalleteActivity.this, CanvasActivity.class);
                launchIntent.putExtra("BackgroundColor", colors[i]);
                startActivity(launchIntent);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView){

            }
        });
    }
}