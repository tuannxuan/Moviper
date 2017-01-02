package com.mateuszkoslacz.moviper.base.view.activity.autoinject.passive.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.LayoutRes;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;
import com.mateuszkoslacz.moviper.base.view.activity.autoinject.ViperAiActivity;
import com.mateuszkoslacz.moviper.base.view.activity.autoinject.passive.ViperAiPassiveActivity;
import com.mateuszkoslacz.moviper.iface.view.ViperView;

/**
 * Created by tomasznajda on 14.12.2016.
 */

public abstract class ViperDataBindingPassiveActivity
        <ViewType extends MvpView,
                Binding extends ViewDataBinding>
        extends ViperAiPassiveActivity<ViewType>
        implements ViperView {

    protected Binding mBinding;

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        mBinding = DataBindingUtil.setContentView(this, layoutResID);
    }
}