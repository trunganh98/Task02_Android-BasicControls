package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
        import android.widget.Button;
import android.widget.ImageSwitcher;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

//    boolean iscat1 = true;
//    public void switchimg(View view) {
//        Log.i("Info", "Change pressed");
//
//        ImageView image = findViewById(R.id.catImageView);
//        if (iscat1) {
//            image.setImageResource(R.drawable.aaa);
//            iscat1 = false;
//        }else {
//            image.setImageResource(R.drawable.bbb);
//            iscat1 = true;
//        }
//}

    private Button btnNext;
    private Button btnPrevious;
    private ImageSwitcher imgSwitcher;
    int i = 0;
    Random random = new Random();
    int[] imgHotFace = {R.drawable.a1, R.drawable.a2, R.drawable.a4, R.drawable.a5, R.drawable.a3};

    int value;

    public void hotface(View view){
        value = random.nextInt(2);
        Log.i("value", " " + R.drawable.a1);

        imgSwitcher.setBackground(getDrawable(imgHotFace[value]));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNext = findViewById(R.id.btnNext);
        btnPrevious = findViewById(R.id.btnPrevious);
        imgSwitcher = findViewById(R.id.imgSwitcher);
        Drawable[] imgName = {getDrawable(R.drawable.a1), getDrawable(R.drawable.a4), getDrawable(R.drawable.a5)};
        imgSwitcher.setBackground(getDrawable(R.drawable.a1));

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( i< 2){
                    i++;
                    imgSwitcher.setBackground(imgName[i]);
                }
            }
        });

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( i> 0){
                    i--;
                    imgSwitcher.setBackground(imgName[i]);
                }
            }
        });
    }

}