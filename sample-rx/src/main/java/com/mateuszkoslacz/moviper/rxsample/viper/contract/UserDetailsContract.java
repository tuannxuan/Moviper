package com.mateuszkoslacz.moviper.rxsample.viper.contract;

import android.app.Activity;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.lce.MvpLceView;
import com.mateuszkoslacz.moviper.iface.interactor.ViperRxInteractor;
import com.mateuszkoslacz.moviper.iface.routing.ViperViewHelperRxRouting;
import com.mateuszkoslacz.moviper.iface.viewhelper.ViperViewHelper;
import com.mateuszkoslacz.moviper.rxsample.viper.entity.User;

import io.reactivex.Observable;

public interface UserDetailsContract {

    interface Presenter extends MvpPresenter<View> {
        // Defines what methods the View can invoke on the Presenter.
        // In most cases there will be user interactions and View lifecycle events.

        void onViewCreated();

        void onAvatarClicked(String avatarUrl);
    }

    interface View extends MvpLceView<User> {
        // Defines what methods the Presenter can invoke on the View
        // In most cases there will be manipulating ui and displaying data or errors.
        // In Super Rx version it also provides getters for Observables emmiting user click events.

        void bindDataToViews(User user);
    }

    interface Interactor extends ViperRxInteractor {
        // Defines what methods the Presenter can invoke on the Interactor.
        // In most cases there will be data saving and querying.
        // It's just a marker interface.

        Observable<User> getUserForUsername(String user);
    }

    interface Routing extends ViperViewHelperRxRouting<Activity, ViewHelper> {
        // Defines what methods the Presenter can invoke on the Routing.
        // In most cases there will be starting another activities, services and using system
        // framework, ie. scheduling alarms or sending broadcasts.
        // In the case of a fragment being the view, there also will be manipulating
        // the root Activity, ie. switching fragments.

        void startFullscreenPhotoActivity(String photoUrl);
    }

    interface ViewHelper extends ViperViewHelper {
        // Defines what Android views the Routing can get from the Viper View.
        // There should only be Android View getter methods to provide the Routing elements
        // to be used on advanced Android transitions.

        android.view.View getAvatarImageView();
    }
}
