package com.mateuszkoslacz.moviper.iface.routing;

import android.content.Context;
import android.support.annotation.Nullable;

import com.hannesdorfmann.mosby.mvp.MvpView;
import com.mateuszkoslacz.moviper.iface.presenter.ViperPresenter;
import com.mateuszkoslacz.moviper.iface.presenter.routing.ViperPresenterForRouting;
import com.mateuszkoslacz.moviper.iface.view.ContextHolder;

/**
 * Created by mateuszkoslacz on 08.08.2016. Based on lucas.urbas implementation.
 * <p/>
 * It's responsible for performing all platform-specific tasks in behalf of presenter, ie. starting
 * a new Activity, a new Service, scheduling alarms etc.
 * <p/>
 * It's also responsible of UI changes outside of given view, ie. Fragment presenter uses this
 * routing for switching Fragments in parent Activity.
 * <p/>
 * In complex use cases you will probably want to include here separate classes for handling alarms
 * scheduling, Services creating etc. for better separation of concepts.
 * <p/>
 * If you are looking for solution providing Android Views to use in Android Transaction with
 * shared
 * views, see {@link ViperViewHelperRouting}
 */
public interface ViperRouting
        <RelatedContext extends Context,
                PresenterType extends ViperPresenterForRouting>
        extends CommonViperRouting<RelatedContext> {

    /**
     * Remember to call {@link #isPresenterAttached()} before getting the Presenter to avoid {@link
     * NullPointerException}s.
     *
     * @return attached {@link ViperPresenterForRouting} or null if it's detached (View got
     * destroyed)
     */
    @Nullable
    PresenterType getPresenter();

    /**
     * Checks if a presenter is attached to this routing.
     */
    boolean isPresenterAttached();

    /**
     * You can override this to perform an action on presenter attach (ie. set up the resources,
     * delegates etc.). <b>Don't forget to call super!</b>
     * <p/>
     * Attaches a presenter to this interactor. Will be called right after view is attached to the
     * presenter. This method is invoked from {@link ViperPresenter#attachView(MvpView)}.
     */
    void attach(ContextHolder contextHolder, PresenterType presenter);
}
