package com.example.chapher04;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Simpleimage extends AppCompatActivity {
    private Button plus;
    private  Button minus;
    private  Button next;
    private ImageView image1;
    private ImageView image2;


    private int[] images=new int[]{R.mipmap.image111,R.mipmap.image222,R.mipmap.image333,R.mipmap.image444,R.drawable.image555};
    private int currentImg=2;
    private int alpha=255;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpleimage);
        plus=(Button) findViewById(R.id.btn_1);
        minus= (Button) findViewById(R.id.btn_2);
        image1=(ImageView) findViewById(R.id.image1);
        image2=(ImageView) findViewById(R.id.image2);
        next=(Button) findViewById(R.id.btn_3);
       next.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               image1.setImageResource(images[++currentImg %images.length]);
           }
       });
       // next.setOnClickListener(source -> {image1.setImageResource(images[++currentImg % images.length]);});
        View.OnClickListener listener=view -> {
          if(view==plus){
              alpha+=20;
          }
          if (view==minus){
              alpha-=20;
          }
          if (alpha >=255){
              alpha =255;
          }
          if (alpha<=0){
              alpha=0;
          }
          image1.setImageAlpha(alpha);
        };
        plus.setOnClickListener(listener);
        minus.setOnClickListener(listener);
        image1.setOnTouchListener((view, motionEvent) -> {
            BitmapDrawable bitmapDrawable=(BitmapDrawable) image1.getDrawable();
            Bitmap bitmap=bitmapDrawable.getBitmap();
            double scale =1.0 * bitmap.getHeight()/ image1.getHeight();
            long x=Math.round(motionEvent.getX() *scale);
            long y=Math.round(motionEvent.getY() *scale);
            if(x+120>bitmap.getWidth()){
                x=bitmap.getWidth()-120;
            }
            if (y+120>bitmap.getHeight()){
                y=bitmap.getHeight()-120;
            }
            image2.setImageBitmap(Bitmap.createBitmap(bitmap,(int)x,(int)y,120,120));
            image2.setImageAlpha(alpha);

            return false;
        });
    }
}