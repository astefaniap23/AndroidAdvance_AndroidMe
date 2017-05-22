package com.example.android.android_me.ui;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.android_me.R;

// This activity will display a custom Android image composed of three body parts: head, body, and legs
public class AndroidMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);

        HeadPartFragment headFragment = new HeadPartFragment();
        //Fragmente transaction
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.head_container,headFragment).commit();

        BodyPartFragment bodyFragment = new BodyPartFragment();
        fragmentManager.beginTransaction().add(R.id.body_container,bodyFragment).commit();
    }
}
