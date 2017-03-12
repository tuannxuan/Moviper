package com.mateuszkoslacz.moviper.tests.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.mateuszkoslacz.moviper.tests.R;


/**
 * Created by bwilk on 12/5/16.
 */
@VisibleForTesting
public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.container);
        setContentView(frameLayout);
    }
}
