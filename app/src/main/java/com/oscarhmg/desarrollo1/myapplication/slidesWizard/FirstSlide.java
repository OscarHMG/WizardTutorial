package com.oscarhmg.desarrollo1.myapplication.slidesWizard;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oscarhmg.desarrollo1.myapplication.R;

/**
 * Created by desarrollo1 on 19/5/2017.
 */

public class FirstSlide extends android.support.v4.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.first_slide, container, false);
        return v;
    }

}
