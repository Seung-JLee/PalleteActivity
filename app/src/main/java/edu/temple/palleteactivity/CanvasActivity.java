package edu.temple.palleteactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        String BackgroundColor = getIntent().getStringExtra("BackgroundColor");
        if(BackgroundColor != null) {
            View someView = findViewById(R.id.backGround);
            View root = someView.getRootView();

            root.setBackgroundColor(Color.parseColor(BackgroundColor));

        }
        else{
            Toast.makeText(CanvasActivity.this, "No info imported", Toast.LENGTH_LONG).show();
        }
    }
}
