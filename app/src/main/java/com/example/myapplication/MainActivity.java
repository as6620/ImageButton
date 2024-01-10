package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;
    ImageView imageView;
    Random rnd = new Random();
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = findViewById(R.id.imageButton);
        imageView = findViewById(R.id.imageView);
    }
    public void clicked(View view) {
        x = rnd.nextInt(3) + 1;
        if (x == 1) {
            imageButton.setImageResource(R.drawable.num1);
            imageView.setImageResource(R.drawable.image1);
        }
        if (x == 2) {
            imageButton.setImageResource(R.drawable.num2);
            imageView.setImageResource(R.drawable.image2);
        }
        if (x == 3) {
            imageButton.setImageResource(R.drawable.num3);
            imageView.setImageResource(R.drawable.image3);
        }
    }
}