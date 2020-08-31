package com.offlineprogrammer.scaletypeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    Button scaleImage;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scaleImage = findViewById(R.id.scaleImage);
        radioGroup = findViewById(R.id.radioGroup);
        imageView = findViewById(R.id.imageView);

        scaleImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId = radioGroup.getCheckedRadioButtonId();
                if (selectedId != -1) {
                    RadioButton radioButton
                            = (RadioButton)radioGroup
                            .findViewById(selectedId);
                    imageView.setScaleType(ImageView.ScaleType.valueOf(radioButton.getText().toString()));
                }

            }
        });


    }
}