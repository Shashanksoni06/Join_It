package com.shashank.join_it;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Integer> p1= new ArrayList<Integer>();
    ArrayList<Integer> p2= new ArrayList<Integer>();
    int act=1;

    public void fn(View view)
    {
        int clicked=0;
        Button k = (Button)view ;
        switch ((int)k.getId())
        {
            case R.id.b1:clicked=1;
            break;
            case R.id.b2:clicked=2;
                break;
            case R.id.b3:clicked=3;
                break;
            case R.id.b4:clicked=4;
                break;
            case R.id.b5:clicked=5;
                break;
            case R.id.b6:clicked=6;
                break;
            case R.id.b7:clicked=7;
                break;
            case R.id.b8:clicked=8;
                break;
            case R.id.b9:clicked=9;
                break;
        }

        play(clicked,k);
        cw();


    }

    public void play(int cid,Button k)
    {
        if (act ==1)
        {
            p1.add(cid);
            act=2;
            k.setBackgroundResource(R.drawable.p1);

        }
        else
        {
            p2.add(cid);
            act=1;
            k.setBackgroundResource(R.drawable.p2);
        }
    }
    public void cw()
    {
        int wi=-1;
        if(p1.contains(1)&&p1.contains(2)&& p1.contains(3))
        { wi=1;}
        if(p2.contains(1)&&p2.contains(2)&& p2.contains(3))
        { wi=2;}

        if(p1.contains(4)&&p1.contains(5)&& p1.contains(6))
        {   wi=1;}
        if(p2.contains(4)&&p2.contains(5)&& p2.contains(6))
        {   wi=2;}

        if(p1.contains(7)&&p1.contains(8)&& p1.contains(9))
        {   wi=1;}
        if(p2.contains(7)&&p2.contains(8)&& p2.contains(9))
        {  wi=2;}

        if(p1.contains(1)&&p1.contains(5)&& p1.contains(9))
        {wi=1;}
        if(p2.contains(1)&&p2.contains(5)&& p2.contains(9))
        {wi=2;}

        if(p1.contains(3)&&p1.contains(5)&& p1.contains(7))
        {wi=1;}
        if(p2.contains(3)&&p2.contains(5)&& p2.contains(7))
        {wi=2;}

        if(p1.contains(1)&&p1.contains(4)&& p1.contains(7))
        {wi=1;}
        if(p2.contains(1)&&p2.contains(4)&& p2.contains(7))
        {wi=2;}

        if(p1.contains(2)&&p1.contains(5)&& p1.contains(8))
        {wi=1;}
        if(p2.contains(2)&&p2.contains(5)&& p2.contains(8))
        {wi=2;}

        if(p1.contains(3)&&p1.contains(6)&& p1.contains(9))
        {wi=1;}
        if(p2.contains(3)&&p2.contains(6)&& p2.contains(9))
        {wi=2;}


        if(wi!=-1)
        {
            if(wi==1)
            {
                ImageView win = (ImageView) findViewById(R.id.img1);
                win.animate().alpha(1f).setDuration(2000);



            }
            else
            {
               ImageView win = (ImageView) findViewById(R.id.img2);
                win.animate().alpha(1f).setDuration(2000);


            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
