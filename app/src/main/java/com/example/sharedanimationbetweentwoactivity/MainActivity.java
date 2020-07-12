package com.example.sharedanimationbetweentwoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;
    ImageView imageView;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = findViewById(R.id.profile);
        imageView = findViewById(R.id.myImage);
        textView = findViewById(R.id.myText);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Pair[] pairs= new Pair[2];
                pairs[0] = new Pair<View, String> (imageView , "imageTransation");
                pairs[1] = new Pair<View, String> (textView , "textTransation");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);

                startActivity(new Intent(getApplicationContext(),ShareActivity.class),options.toBundle());
            }
        });
    }
}
