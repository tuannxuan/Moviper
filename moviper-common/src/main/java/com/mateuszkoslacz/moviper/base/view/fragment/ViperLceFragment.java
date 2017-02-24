package com.mateuszkoslacz.moviper.base.view.fragment;

import android.os.Bundle;
import android.view.View;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.lce.MvpLceFragment;
import com.hannesdorfmann.mosby.mvp.lce.MvpLceView;

/**
 * Created by tomasznajda on 14.12.2016.
 */

public abstract class ViperLceFragment
        <ContentView extends View,
                Model,
                ViewType extends MvpLceView<Model>,
                Presenter extends MvpPresenter<ViewType>>
        extends MvpLceFragment<ContentView, Model, ViewType, Presenter>
        implements MvpLceView<Model>, com.mateuszkoslacz.moviper.iface.view.ViperView {

    @Override
    public Bundle getArgs() {
        return getArguments();
    }

}