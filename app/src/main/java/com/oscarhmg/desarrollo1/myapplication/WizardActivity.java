package com.oscarhmg.desarrollo1.myapplication;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntro2;
import com.oscarhmg.desarrollo1.myapplication.slidesWizard.FirstSlide;
import com.oscarhmg.desarrollo1.myapplication.slidesWizard.FourthSlide;
import com.oscarhmg.desarrollo1.myapplication.slidesWizard.SecondSlide;
import com.oscarhmg.desarrollo1.myapplication.slidesWizard.ThirdSlide;


/**
 * Created by desarrollo1 on 19/5/2017.
 */

public class WizardActivity extends AppIntro2{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        hideStatusBar();

        //Adding Slides to WizardActivity
        addSlide(new FirstSlide());
        addSlide(new SecondSlide());
        addSlide(new ThirdSlide());
        addSlide(new FourthSlide());

        setFadeAnimation();



    }


    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);

    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);

    }

    public void hideStatusBar(){
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }
}

