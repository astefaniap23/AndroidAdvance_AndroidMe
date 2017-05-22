package com.example.android.android_me.ui;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

// This activity will display a custom Android image composed of three body parts: head, body, and legs
public class AndroidMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);
        //Fragmente transaction
        FragmentManager fragmentManager = getSupportFragmentManager();

        BodyPartFragment headFragment = new BodyPartFragment();
        headFragment.setImageIds(AndroidImageAssets.getHeads());
        headFragment.setListIndex(2);
        fragmentManager.beginTransaction()
                .add(R.id.head_container, headFragment)
                .commit();

        BodyPartFragment bodyFragment = new BodyPartFragment();
        bodyFragment.setImageIds(AndroidImageAssets.getBodies());
        bodyFragment.setListIndex(2);
        fragmentManager.beginTransaction()
                .add(R.id.body_container, bodyFragment)
                .commit();

        BodyPartFragment legsFragment = new BodyPartFragment();
        legsFragment.setImageIds(AndroidImageAssets.getLegs());
        legsFragment.setListIndex(2);
        fragmentManager.beginTransaction()
                .add(R.id.legs_container, legsFragment)
                .commitNow();
    }


}
