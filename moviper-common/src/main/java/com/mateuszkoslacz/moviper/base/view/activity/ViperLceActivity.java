package com.mateuszkoslacz.moviper.base.view.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.lce.MvpLceActivity;
import com.hannesdorfmann.mosby.mvp.lce.MvpLceView;

/**
 * Created by tomasznajda on 14.12.2016.
 */

public abstract class ViperLceActivity
        <ContentView extends View,
                Model,
                ViewType extends MvpLceView<Model>,
                Presenter extends MvpPresenter<ViewType>>
        extends MvpLceActivity<ContentView, Model, ViewType, Presenter>
        implements MvpLceView<Model>, com.mateuszkoslacz.moviper.iface.view.ViperView {

    @NonNull
    @Override
    public Activity getActivity() {
        return this;
    }

    @Override
    public Bundle getArgs() {
        return getIntent().getExtras();
    }
}