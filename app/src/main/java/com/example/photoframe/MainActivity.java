package com.example.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String [] names= {"Bill","Cannary","Black","Weed","elsa"};
    ImageButton prev,next;
    ImageView pic;
    TextView text=findViewById(R.id.text);
    int currentimage = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void prev(View v){
        String idX="pic" + currentimage;
        int x=this.getResources().getIdentifier("pic1","id",getPackageName());
        pic=findViewById(x);
        pic.setAlpha(0f);

        currentimage=(5 + currentimage-1) % 5;
        String idY="pic" + currentimage;
        int y=this.getResources().getIdentifier("pic1","id",getPackageName());
        pic=findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentimage]);

    }
    public void next(View v){
        String idX="pic" + currentimage;
        int x=this.getResources().getIdentifier("pic1","id",getPackageName());
        pic=findViewById(x);
        pic.setAlpha(0f);

        currentimage=(currentimage + 1) % 5;
        String idY="pic" + currentimage;
        int y=this.getResources().getIdentifier("pic1","id",getPackageName());
        pic=findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentimage]);
    }
}
