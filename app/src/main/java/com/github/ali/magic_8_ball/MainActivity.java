package com.github.ali.magic_8_ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

     Button mButton;
     ImageView mImageView;

     int[] ballArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.button);
        mImageView = findViewById(R.id.image_eight_ball);

        ballArray = new int[]{R.drawable.icon1,
                R.drawable.icon2,
                R.drawable.icon3,
                R.drawable.icon4,
                R.drawable.icon5};


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();

                int number = random.nextInt(ballArray.length);
                mImageView.setImageResource(ballArray[number]);

            }
        });


    }
}
