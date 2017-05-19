package com.oscarhmg.desarrollo1.myapplication.slidesWizard;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oscarhmg.desarrollo1.myapplication.R;

/**
 * Created by desarrollo1 on 19/5/2017.
 */

public class SecondSlide extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.second_slide, container, false);
        return v;
    }

}
