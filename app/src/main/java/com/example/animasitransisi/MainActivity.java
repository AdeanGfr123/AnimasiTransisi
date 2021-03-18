package com.example.animasitransisi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageview;
    Button button;
    Boolean turnOn=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview=(ImageView)findViewById(R.id.imageView);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View().OnClickListener() {
            @Override
            public void onClick(View void) {
                if(!turnOn){
                    imageview.setImageResource(R.drawable.lamp1);
                    ((TransitionDrawable)imageview.getDrawable()).startTransition(3000);
                    turnOn=true;
                }else {
                    imageview.setImageResource(R.drawable.lamp2);
                    ((TransitionDrawable)imageview.getDrawable()).startTransition(3000);
                    turnOn=false;

                }



            }
        });
    }
}