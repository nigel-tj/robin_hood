package com.campfiresolutions.robinhood;

import com.campfiresolutions.robinhood.authenticator.BootstrapAuthenticatorActivity;
import com.campfiresolutions.robinhood.core.TimerService;
import com.campfiresolutions.robinhood.ui.BootstrapActivity;
import com.campfiresolutions.robinhood.ui.BootstrapFragmentActivity;
import com.campfiresolutions.robinhood.ui.BootstrapTimerActivity;
import com.campfiresolutions.robinhood.ui.CheckInsListFragment;
import com.campfiresolutions.robinhood.ui.MainActivity;
import com.campfiresolutions.robinhood.ui.NavigationDrawerFragment;
import com.campfiresolutions.robinhood.ui.NewsActivity;
import com.campfiresolutions.robinhood.ui.NewsListFragment;
import com.campfiresolutions.robinhood.ui.UserActivity;
import com.campfiresolutions.robinhood.ui.UserListFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AndroidModule.class,
                BootstrapModule.class
        }
)
public interface BootstrapComponent {

    void inject(BootstrapApplication target);

    void inject(BootstrapAuthenticatorActivity target);

    void inject(BootstrapTimerActivity target);

    void inject(MainActivity target);

    void inject(CheckInsListFragment target);

    void inject(NavigationDrawerFragment target);

    void inject(NewsActivity target);

    void inject(NewsListFragment target);

    void inject(UserActivity target);

    void inject(UserListFragment target);

    void inject(TimerService target);

    void inject(BootstrapFragmentActivity target);
    void inject(BootstrapActivity target);


}
