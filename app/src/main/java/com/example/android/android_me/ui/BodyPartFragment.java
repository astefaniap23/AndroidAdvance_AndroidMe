package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;

import java.util.List;

/**
 * Created by aportillo on 22/05/2017.
 */

public class BodyPartFragment extends Fragment {

    private List<Integer> mImageIds;
    private int mListIndex;
    private static final String TAG = "BodyPartFragment";

    public BodyPartFragment() {

    }

    // TODO:
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);
        //imageView.setImageResource(AndroidImageAssets.getBodies().get(0));
        if (mImageIds != null) {
            imageView.setImageResource(mImageIds.get(mListIndex));
        } else {
            Log.v(TAG, "List empty");
        }

        return rootView;
    }

    public List<Integer> getImageIds() {
        return mImageIds;
    }

    public void setImageIds(List<Integer> mImageIds) {
        this.mImageIds = mImageIds;
    }

    public int getListIndex() {
        return mListIndex;
    }

    public void setListIndex(int mListIndex) {
        this.mListIndex = mListIndex;
    }
}
